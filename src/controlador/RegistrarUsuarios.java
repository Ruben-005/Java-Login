package controlador;

import java.sql.*;


import modelo.Conexion;

public class RegistrarUsuarios {
    
    private Connection con;

    public RegistrarUsuarios(){
        try {
            con = Conexion.DameConexion();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void RegistrarUsers(String nombres, String Apellidos){
        try {
            String sql="call insetarUsuariosRegistrados(?, ?)";
            CallableStatement call = con.prepareCall(sql);
            call.setString(1, nombres);
            call.setString(2, Apellidos);
            call.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

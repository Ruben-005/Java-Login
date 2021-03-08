package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static Connection con;
    
    public Conexion(){
        con = null;
    }

    public static Connection DameConexion() throws Exception{
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/datos", "root", "");

        return con;
    }
}

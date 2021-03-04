package vista;

import java.awt.*;

import javax.swing.*;

import modelo.marcoLogin;

public class frmLogin extends JFrame{
    

    public frmLogin(){
        setBounds(0, 0, 220, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new marcoLogin());

    }

}

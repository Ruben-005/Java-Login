package vista;

import java.awt.*;

import javax.swing.*;

import modelo.marcoRegistrar;

public class frmRegistrar extends JFrame{
    

    public frmRegistrar(){
        setBounds(0, 0, 263, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new marcoRegistrar());
    }


    
}
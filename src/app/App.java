package app;

import javax.swing.JFrame;

import vista.frmLogin;
import vista.frmRegistrar;

public class App {
       
    public static void main(String[] args) throws Exception {
        frmLogin frmL  = new frmLogin();

        frmL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmL.setVisible(true);

        /*frmRegistrar fm = new frmRegistrar();

        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setVisible(true);*/
    }
}

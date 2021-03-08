package modelo;

import javax.swing.*;

import vista.frmLogin;
import vista.frmRegistrar;

import java.awt.*;
import java.awt.event.*;

public class marcoLogin extends JPanel{
    
    private JLabel nombreL;
    private JTextField nombreA;

    private JLabel contraL;
    private JTextField contraA;
    private JButton registrar;
    private JButton boton;

    public marcoLogin(){
        registrar = new JButton("Registrate");
        nombreL = new JLabel("Nombre:    ");
        nombreA = new JTextField(10);
        contraL = new JLabel("Cotraseña:");
        contraA = new JTextField(10);
        boton = new JButton("Hola a Todos");
        Component cm[] ={nombreL , nombreA,
                        contraL, contraA, boton};

        
        creaComponenetes(cm, 1, 0);

        registrar.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                frmRegistrar fm = new frmRegistrar();

                fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fm.setVisible(true);
            }

        });
        add(registrar, BorderLayout.SOUTH);
    }


    private void creaComponenetes(Component com[], int f, int c){
        setLayout(new BorderLayout());

        GridLayout g = new GridLayout(f, c);

        JPanel p = new JPanel(g);

        JPanel pn = new JPanel();

        for(int i = 0; i < com.length; i++) {
            p.add(pn, BorderLayout.CENTER);
            
            pn.add(com[i]);
        }

        add(p);       
    }
}

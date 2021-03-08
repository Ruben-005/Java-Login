package modelo;

import javax.swing.*;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import controlador.RegistrarUsuarios;

import java.awt.*;
import java.awt.event.*;

public class marcoRegistrar extends JPanel {
    
    private JLabel nombreL;
    private JTextField nombreA;

    private JLabel contraL;
    private JTextField contraA;

    private JLabel contraRL;
    private JTextField contraRA;

    private JButton boton;


    public marcoRegistrar(){
        nombreL = new JLabel("                      Nombre:");
        nombreA = new JTextField(10);

        contraL = new JLabel("              Contraseña: ");
        contraA = new JTextField(10);

        contraRL = new JLabel("Repite la contraseña: ");
        contraRA = new JTextField(10);

        boton = new JButton("Registrar");

        Component cm[] = {nombreL, nombreA, contraL, contraA,contraRL, contraRA, boton};

        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                RegistrarUsuarios rs = new RegistrarUsuarios();

               //if(contraA.equals(contraRA)){
                //contraA =  contraRA;
                rs.RegistrarUsers(nombreA.getText(), contraA.getText());
                System.out.println("Correcto");
                //}else{
                  //  System.out.println("Error de la contra");
                //}

                
            }

        });

        creaComponenetes(cm, 1, 0);
    }


    private void creaComponenetes(Component com[], int f, int c){
        setLayout(new BorderLayout());

        GridLayout g = new GridLayout(f, c);

        JPanel p = new JPanel(g);

        JPanel pn = new JPanel();

        for(int i = 0; i < com.length; i++) {
            if(i%2==0){
                p.add(pn);
                System.out.println(i);
            }
            pn.add(com[i]);
        }

        add(p);       
    }
}

package modelo;

import javax.swing.*;
import java.awt.*;

public class marcoLogin extends JPanel{
    
    private JLabel nombreL;
    private JTextField nombreA;

    private JLabel contraL;
    private JTextField contraA;

    private JButton boton;

    public marcoLogin(){
        Component cm[] ={nombreL = new JLabel("Nombre:    "), nombreA = new JTextField(10),
                        contraL = new JLabel("Cotraseña:"), contraA = new JTextField(10),
                        boton = new JButton("Hola a Todos")};

        creaComponenetes(cm, 2, 0);
    }


    private void creaComponenetes(Component com[], int f, int c){
        setLayout(new BorderLayout());

        GridLayout g = new GridLayout(f, c);

        g.setHgap(10);

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

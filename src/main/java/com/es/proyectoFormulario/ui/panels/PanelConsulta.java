package main.java.com.es.proyectoFormulario.ui.panels;

import javax.swing.*;
import java.awt.*;

public class PanelConsulta {
    private JButton consultar;
    private JTextField idUser;
    private JTextArea texto;
    private JButton volver;


    public PanelConsulta() {
        idUser = new JTextField();
        idUser.setLocation(new Point(150, 150));
        idUser.setSize(new Dimension(152, 32));

        consultar = new JButton();
        consultar.setLocation(new Point(250, 150));
        consultar.setSize(new Dimension(152, 32));

        texto = new JTextArea();
        texto.setLocation(new Point(200, 250));
        texto.setSize(new Dimension(152, 32));

        volver = new JButton();
        volver.setLocation(new Point(200, 350));
        volver.setSize(new Dimension(152, 32));

    }
}

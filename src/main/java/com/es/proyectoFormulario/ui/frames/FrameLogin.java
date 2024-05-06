package main.java.com.es.proyectoFormulario.ui.frames;

import main.java.com.es.proyectoFormulario.ui.panels.PanelAlta;
import main.java.com.es.proyectoFormulario.ui.panels.PanelLogin;

import javax.swing.*;
import java.awt.*;

public class FrameLogin extends JFrame {
    public FrameLogin() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("ProyectoFormulario");
        ImageIcon image = new ImageIcon("C:\\Users\\Usuario\\Desktop\\Usuario.jpg");
        this.setIconImage(image.getImage());
        this.setResizable(false);

        PanelLogin p = new PanelLogin(this);
        this.add(p);

        this.setVisible(true);
    }
}

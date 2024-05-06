package main.java.com.es.proyectoFormulario.ui.frames;

import main.java.com.es.proyectoFormulario.ui.panels.PanelAlta;

import javax.swing.*;
import java.awt.*;

public class FrameAlta extends JFrame {
    public FrameAlta() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Proyecto Formulario");
        ImageIcon image = new ImageIcon("C:\\Users\\Usuario\\Desktop\\Usuario.jpg");
        this.setIconImage(image.getImage());
        this.setResizable(false);

        PanelAlta panelAlta = new PanelAlta();
        this.add(panelAlta);

        this.setVisible(true);
    }
}

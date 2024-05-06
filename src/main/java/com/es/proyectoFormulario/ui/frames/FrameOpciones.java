package main.java.com.es.proyectoFormulario.ui.frames;

import main.java.com.es.proyectoFormulario.ui.panels.PanelOpciones;

import javax.swing.*;

public class FrameOpciones extends JFrame {
    public FrameOpciones() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Opciones");
        ImageIcon imagenOpciones = new ImageIcon();
        this.setIconImage(imagenOpciones.getImage());
        this.setResizable(false);

        PanelOpciones po = new PanelOpciones();
        this.setVisible(true);
    }
}

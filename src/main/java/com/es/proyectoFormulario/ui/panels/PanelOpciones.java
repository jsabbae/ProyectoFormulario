package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;

public class PanelOpciones extends JPanel {
    private FrameLogin framePadre;
    private JButton alta;
    private JButton baja;
    private JButton modif;
    private JButton consulta;

    public PanelOpciones(FrameLogin framePadre) {
        this.framePadre = framePadre;

        this.setBackground(new Color(0xDFDCDC));    //  El color del fondo

        alta = new JButton("Alta");
        alta.setLocation(new Point(200, 150));
        alta.setSize(new Dimension(152, 32));
        alta.setBackground(new Color(0xC0DDB8));
        this.add(alta);

        baja = new JButton("Baja");
        baja.setLocation(new Point(200, 250));
        baja.setSize(new Dimension(152, 32));
        baja.setBackground(new Color(0xEA8484));
        this.add(baja);

        modif = new JButton("Modificación");
        modif.setLocation(new Point(200, 350));
        modif.setSize(new Dimension(152, 32));
        modif.setBackground(new Color(0xD8B969));
        this.add(modif);

        consulta = new JButton("Consulta");
        consulta.setLocation(new Point(200, 450));
        consulta.setSize(new Dimension(152, 32));
        consulta.setBackground(new Color(0x69B0D8));

    }
}

package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelOpciones extends JPanel {
    private FrameLogin framePadre;
    private JButton alta;
    private JButton baja;
    private JButton modif;
    private JButton consulta;
    private JButton atras;

    private MouseListener mouseListenerAlta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Has pulsado el botón Alta");
            cargarPanelAlta();
        }
    };

    private MouseListener mouseListenerBaja = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Has pulsado el botón Baja");
            cargarPanelBaja();
        }
    };

    private MouseListener mouseListenerModificar = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Has pulsado el botón Modificar");
            cargarPanelModificar();
        }
    };
    private MouseListener mouseListenerConsulta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Has pulsado el botón Modificar");
            cargarPanelConsulta();
        }
    };

    public PanelOpciones(FrameLogin framePadre) {
        this.framePadre = framePadre;

        this.setBackground(new Color(0xDFDCDC));    //  El color del fondo
        this.setLayout(null);

        //  BOTON ALTA
        alta = new JButton("Alta");
        alta.setBounds(200, 100, 130, 32);
        alta.setBackground(new Color(0xC0DDB8));
        alta.addMouseListener(mouseListenerAlta);
        this.add(alta);


        //  BOTON BAJA
        baja = new JButton("Baja");
        baja.setBounds(200, 200, 130, 32);
        baja.setBackground(new Color(0xEA8484));
        baja.addMouseListener(mouseListenerBaja);
        this.add(baja);

        //  BOTON MODIFICAR
        modif = new JButton("Modificar");
        modif.setBounds(200, 300, 130, 32);
        modif.setBackground(new Color(0xD8B969));
        modif.addMouseListener(mouseListenerModificar);
        this.add(modif);

        //  BOTON CONSULTA
        consulta = new JButton("Consultar");
        consulta.setBounds(200, 400, 130, 32);
        consulta.setBackground(new Color(0x69B0D8));
        consulta.addMouseListener(mouseListenerConsulta);
        this.add(consulta);

        //  No esta haciendo ninguna acción el botón atras de momento
        atras = new JButton("Volver");
        atras.setLocation(new Point(20, 521));
        atras.setSize(new Dimension(152, 32));
        atras.setBackground(new Color(208, 223, 232));
        atras.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        this.add(atras);
    }

    private void cargarPanelAlta() {
        //  ELIMINAMOS THIS PanelOpciones
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelAlta panelAlta = new PanelAlta(framePadre);
        framePadre.add(panelAlta);

        //  ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }

    private void cargarPanelBaja() {
        //  ELIMINAMOS THIS PanelOpciones
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelBaja panelBaja = new PanelBaja(framePadre);
        framePadre.add(panelBaja);

        //  ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }

    private void cargarPanelModificar() {
        //  ELIMINAMOS THIS PanelOpciones
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelModificacion panelModificacion = new PanelModificacion(framePadre);
        framePadre.add(panelModificacion);

        //  ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }


    private void cargarPanelConsulta() {
        //  ELIMINAMOS THIS PanelOpciones
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL ¡¡¡FRAME!!!
        PanelConsulta panelConsulta = new PanelConsulta(framePadre);
        framePadre.add(panelConsulta);

        //  ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }
}

package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.services.impl.ServiceUser;
import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelLogin extends JPanel {
    private JTextField user;
    private JTextField pass;
    private JLabel labelError;
    private JButton bEnviar;
    private JButton bAlta;
    private JButton atras;

    //  Este es el FramePadre de este panel
    private FrameLogin framePadre;
    private ServiceUser serviceUser = new ServiceUser();

    private MouseListener listenerMouseCambiarAspecto = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(135, 206, 250)); // Fondo azul claro
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(208, 223, 232)); // Fondo azul medio
        }

        @Override
        public void mousePressed(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBorder(new LineBorder(new Color(50, 50, 50), 3));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        }
    };

    private MouseListener listenerMouseEnviar = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            // Comprueba si el usuario ha introducido correctamente sus credenciales
            if (serviceUser.checkUser(user.getText(), pass.getText())) {
                // Si se han introducido correctamente, se procede a cargar el panelOpciones
                cargarPanelOpciones();
            } else {
                labelError.setVisible(true);

            }
        }
    };

    private MouseListener listenerMouseAlta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Alta pulsado");
            cargarPanelAlta();
        }
    };


    public PanelLogin(FrameLogin framePadre) {

        this.framePadre = framePadre;

        this.setBackground(new Color(0xDFDCDC));
        this.setLayout(null);

        JLabel usuario = new JLabel("Usuario: ");
        usuario.setLocation(new Point(200, 135));
        usuario.setSize(new Dimension(152, 32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(usuario);

        user = new JTextField("Introduzca su usuario");
        user.setLocation(new Point(260, 135));
        user.setSize(new Dimension(152, 32));
        this.add(user);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200, 200));
        passwd.setSize(new Dimension(152, 32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260, 200));
        pass.setSize(new Dimension(152, 32));
        this.add(pass);


        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(new Point(120, 321));
        bEnviar.setSize(new Dimension(152, 32));
        bEnviar.setBackground(new Color(208, 223, 232));
        bEnviar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        bEnviar.addMouseListener(listenerMouseEnviar);
        bEnviar.addMouseListener(listenerMouseCambiarAspecto);
        this.add(bEnviar);

        bAlta = new JButton("Alta");
        bAlta.setLocation(new Point(320, 321));
        bAlta.setSize(new Dimension(152, 32));
        bAlta.setBackground(new Color(208, 223, 232));
        bAlta.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        bAlta.addMouseListener(listenerMouseAlta);
        this.add(bAlta);

        //  No esta haciendo ninguna acción el botón atras de momento
        atras = new JButton("Volver");
        atras.setLocation(new Point(20, 521));
        atras.setSize(new Dimension(152, 32));
        atras.setBackground(new Color(208, 223, 232));
        atras.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        this.add(atras);

        labelError = new JLabel("Usuario o contraseña incorrectos");
        labelError.setFont(new Font("Consolas", Font.ITALIC, 10));
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(230, 250, 200, 32);
        labelError.setVisible(false);
        this.add(labelError);

    }

    private void cargarPanelAlta() {
        //  ELIMINAMOS THIS PanelLogin ... este ... no otro.
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL  ¡¡¡¡¡FRAME!!!!!!
        PanelAlta panelAlta = new PanelAlta(framePadre);
        framePadre.add(panelAlta);

        //  ULTIMO: REPINTAR AL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }

    private void cargarPanelOpciones() {
        //  ELIMINAMOS THIS PanelLogin
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL OPCIONES AL ¡¡¡FRAME!!!
        PanelOpciones panelOpciones = new PanelOpciones(framePadre);
        framePadre.add(panelOpciones);

        //  ULTIMO: REPINTAR EL FRAME
        framePadre.repaint();
        framePadre.revalidate();
    }
}
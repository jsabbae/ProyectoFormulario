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
    JTextField user;
    JTextField pass;
    JButton bEnviar;
    //  Este es el FramePadre de este panel
    private FrameLogin framePadre;
    private Button bAlta;

    ServiceUser serviceUser = new ServiceUser();

    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {


            if (serviceUser.checkUser(user.getText(), pass.getText())) {
                System.out.println("Has iniciado sesión");
            } else {
                System.out.println("Pa tu casa");
            }

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(135, 206, 250)); // Fondo azul claro
            b.setBorder(new LineBorder(new Color(0, 115, 183), 3)); // Borde azul oscuro
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(102, 153, 204)); // Fondo azul medio
            b.setBorder(new LineBorder(new Color(135, 206, 250), 3)); // Borde azul claro
        }
    };
    private MouseListener listenerMouseAlta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Alta pulsado");
            cargaPanelAlta();
        }
    };

    public PanelLogin(FrameLogin framePadre) {

        this.framePadre = framePadre;

        this.setBackground(new Color(174, 139, 225));
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
        bEnviar.setLocation(new Point(220, 321));
        bEnviar.setSize(new Dimension(152, 32));
        this.add(bEnviar);
        bEnviar.addMouseListener(listenerMouse);

        bAlta = new Button("Alta");
        bAlta.setLocation(new Point(320, 321));
        bAlta.setSize(new Dimension(152, 32));
        bAlta.setBackground(new Color(208, 223, 232));
        this.add(bAlta);
    }

    private void cargaPanelAlta() {
        //  ELIMINAMOS THIS PanelLogin ... este ... no otro.
        framePadre.remove(this);

        //  AÑADIMOS UN PANEL ALTA AL  ¡¡¡¡¡FRAME!!!!!!
        PanelAlta panelAlta = new PanelAlta(framePadre);
        framePadre.add(panelAlta);

        //  ULTIMO: REPINTAR AL FRAME
        framePadre.repaint();
        framePadre.revalidate();

    }
}
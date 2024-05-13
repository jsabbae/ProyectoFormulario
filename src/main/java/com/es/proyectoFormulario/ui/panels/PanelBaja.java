package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.services.impl.ServiceUser;
import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelBaja extends JPanel {
    private FrameLogin framePadre;
    private JLabel id_usuario_consulta;
    private JTextField idUser_consulta;
    private JButton consultar;

    private JLabel datos_user;
    private JLabel id_usuario_baja;
    private JTextField idUser_baja;
    private JLabel nombre_usuario;
    private JTextField nombreUser;
    private JLabel password;
    private JTextField password_baja;
    private JLabel isAdmin;
    private JTextField isAdmin_baja;
    private JButton baja;
    private JButton volver;
    ServiceUser serviceUser = new ServiceUser();
    MouseListener ListenerMouseBaja = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (serviceUser.userExists(idUser_baja.getText()) &&
            serviceUser.nameExists(nombreUser.getText())) {

            } else {

            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(135, 206, 250));
            b.setBorder(new LineBorder(new Color(0, 115, 183), 3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(102, 153, 204));
            b.setBorder(new LineBorder(new Color(135, 206, 250), 3));
        }
    };

    public PanelBaja(FrameLogin framePadre) {
        this.framePadre = framePadre;
        this.setBackground(new Color(0x758BCE));
        this.setLayout(null);

        id_usuario_consulta = new JLabel("id usuario");
        id_usuario_consulta.setLocation(new Point(200, 20));
        id_usuario_consulta.setSize(new Dimension(152, 32));
        this.add(id_usuario_consulta);

        idUser_consulta = new JTextField();
        idUser_consulta.setLocation(new Point(275, 20));
        idUser_consulta.setSize(new Dimension(152, 32));
        this.add(idUser_consulta);

        consultar = new JButton("CONSULTAR");
        consultar.setLocation(new Point(230, 70));
        consultar.setSize(new Dimension(152, 32));
        consultar.setBackground(new Color(183, 154, 46, 184));
        this.add(consultar);

        datos_user = new JLabel("DATOS USER");
        datos_user.setLocation(new Point(230, 150));
        datos_user.setForeground(Color.BLACK);
        datos_user.setSize(new Dimension(304, 64));
        this.add(datos_user);

        id_usuario_baja = new JLabel("id usuario");
        id_usuario_baja.setLocation(new Point(200, 230));
        id_usuario_baja.setSize(new Dimension(152, 32));
        this.add(id_usuario_baja);

        idUser_baja = new JTextField();
        idUser_baja.setLocation(new Point(275, 230));
        idUser_baja.setSize(new Dimension(152, 32));
        this.add(idUser_baja);

        nombre_usuario = new JLabel("nombre usuario");
        nombre_usuario.setLocation(new Point(170, 290));
        nombre_usuario.setSize(new Dimension(152, 32));
        this.add(nombre_usuario);

        nombreUser = new JTextField();
        nombreUser.setLocation(new Point(275, 290));
        nombreUser.setSize(new Dimension(152, 32));
        this.add(nombreUser);

        password = new JLabel("password");
        password.setLocation(new Point(200, 350));
        password.setSize(new Dimension(152, 32));
        this.add(password);

        password_baja = new JTextField();
        password_baja.setLocation(new Point(275, 350));
        password_baja.setSize(new Dimension(152, 32));
        this.add(password_baja);

        isAdmin = new JLabel("is Admin");
        isAdmin.setLocation(new Point(200, 400));
        isAdmin.setSize(new Dimension(152, 32));
        this.add(isAdmin);

        isAdmin_baja = new JTextField();
        isAdmin_baja.setLocation(new Point(275, 400));
        isAdmin_baja.setSize(new Dimension(152, 32));
        this.add(isAdmin_baja);

        baja = new JButton("BAJA");
        baja.setLocation(new Point(250, 460));
        baja.setSize(new Dimension(152, 32));
        baja.setBackground(new Color(211, 95, 95, 184));
        this.add(baja);

        volver = new JButton("ATRAS");
        volver.setLocation(new Point(20, 530));
        volver.setSize(new Dimension(152, 32));
        volver.setBackground(new Color(255, 255, 255, 184));
        this.add(volver);
    }
}

package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import java.awt.*;

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

    public PanelBaja(FrameLogin framePadre) {
        this.framePadre = framePadre;

        id_usuario_consulta = new JLabel("id usuario");
        id_usuario_consulta.setLocation(new Point(200, 100));
        id_usuario_consulta.setSize(new Dimension(152, 32));
        this.add(id_usuario_consulta);

        idUser_consulta = new JTextField();
        idUser_consulta.setLocation(new Point(260, 100));
        idUser_consulta.setSize(new Dimension(152, 32));
        this.add(idUser_consulta);

        consultar = new JButton("CONSULTAR");
        consultar.setLocation(new Point(230, 150));
        consultar.setSize(new Dimension(152, 32));
        consultar.setBackground(new Color(183, 154, 46, 184));
        this.add(consultar);
    }
}

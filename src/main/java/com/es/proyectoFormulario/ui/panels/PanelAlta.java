package main.java.com.es.proyectoFormulario.ui.panels;

import main.java.com.es.proyectoFormulario.model.User;
import main.java.com.es.proyectoFormulario.services.impl.ServiceUser;
import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelAlta extends JPanel {
    private FrameLogin framePadre;
    /*
    - 1. longitud máxima de todos los campos 20
    - 2. NO pueden contener el simbolo :
    - 3. El idUser no está repetido
     */


    //  VINCULAMOS
    private FrameLogin framePadre;
    private JTextField user;
    private JTextField nombre;
    private JTextField pass;
    private JTextField pass2;
    private JTextField isAdmin;
    private JButton alta;
    private JButton atras;
    private JLabel labelError;
    private ServiceUser serviceUser = new ServiceUser();
    MouseListener listenerMouseAlta = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (pass.getText().equalsIgnoreCase(pass2.getText()) && !serviceUser.userExists(user.getText()) && !user.getText().contains(":")) {
                System.out.println("Has creado un usuario");
                serviceUser.anadirFicheroUsers(new User(user.getText(), nombre.getText(), pass2.getText(), Boolean.parseBoolean(isAdmin.getText())));
            } else {
                labelError.setVisible(true);
                System.out.println("Pa tu casa");
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

    public PanelAlta(FrameLogin framePadre) {

        this.framePadre = framePadre;

        this.setBackground(new Color(243, 165, 233));
        this.setLayout(null);

        JLabel usuarioAlta = new JLabel("idUser: ");
        usuarioAlta.setLocation(new Point(200, 50));
        usuarioAlta.setSize(new Dimension(152, 32));
        this.add(usuarioAlta);

        user = new JTextField();
        user.setLocation(new Point(250, 50));
        user.setSize(new Dimension(152, 32));
        this.add(user);

        JLabel nombreAlta = new JLabel("nombre: ");
        nombreAlta.setLocation(new Point(200, 100));
        nombreAlta.setSize(new Dimension(152, 32));
        this.add(nombreAlta);

        nombre = new JTextField();
        nombre.setLocation(new Point(250, 100));
        nombre.setSize(new Dimension(152, 32));
        this.add(nombre);

        JLabel passwordAlta = new JLabel("pass: ");
        passwordAlta.setLocation(new Point(200, 150));
        passwordAlta.setSize(new Dimension(152, 32));
        this.add(passwordAlta);

        pass = new JPasswordField();
        pass.setLocation(new Point(250, 150));
        pass.setSize(new Dimension(152, 32));
        this.add(pass);

        JLabel password2Alta = new JLabel("pass2: ");
        password2Alta.setLocation(new Point(200, 200));
        password2Alta.setSize(new Dimension(152, 32));
        this.add(password2Alta);

        pass2 = new JPasswordField();
        pass2.setLocation(new Point(250, 200));
        pass2.setSize(new Dimension(152, 32));
        this.add(pass2);

        JLabel isAdminAlta = new JLabel("isAdmin: ");
        isAdminAlta.setLocation(new Point(200, 250));
        isAdminAlta.setSize(new Dimension(152, 32));
        this.add(isAdminAlta);

        isAdmin = new JTextField();
        isAdmin.setLocation(new Point(250, 250));
        isAdmin.setSize(new Dimension(152, 32));

        JButton botonAdmin = new JButton(" ↓");
        botonAdmin.setLocation(new Point(300, 250));
        botonAdmin.setSize(152, 32);
        JPopupMenu menuAdmin = new JPopupMenu();
        JMenuItem siAdmin = new JMenuItem("true");
        JMenuItem noAdmin = new JMenuItem("false");
        menuAdmin.add(siAdmin);
        menuAdmin.add(noAdmin);

        this.add(isAdmin);


        alta = new JButton("Alta");
        alta.setLocation(new Point(225, 400));
        alta.setSize(200, 50);
        alta.addMouseListener(listenerMouseAlta);
        this.add(alta);


        //  No esta haciendo ninguna acción el botón atras de momento
        atras = new JButton("Volver");
        atras.setLocation(new Point(20, 521));
        atras.setSize(new Dimension(152, 32));
        atras.setBackground(new Color(208, 223, 232));
        atras.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        this.add(atras);

        labelError = new JLabel("El usuario ya existe o la conntraseña no coincide");
        labelError.setFont(new Font("Consolas", Font.ITALIC, 10));
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(230, 250, 200, 32);
        labelError.setVisible(false);
        this.add(labelError);


    }
}

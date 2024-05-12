package main.java.com.es.proyectoFormulario;

import main.java.com.es.proyectoFormulario.ui.frames.FrameLogin;

import javax.swing.*;

public class ProyectoFormulario {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameLogin fl = new FrameLogin();
            }
        });
    }
}

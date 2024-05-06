package main.java.com.es.proyectoFormulario.services.impl;

public class ServiceLogger {
    private GestionFicheroLogger gestion;

    public ServiceLogger() {
        this.gestion = new GestionFicheroLogger();
    }

    public ServiceLogger(GestionFicheroLogger gestion) {
        this.gestion = gestion;
    }


    public boolean logAlta(String idUser) {
        return false;
    }


    public boolean logLogin(String idUser) {
        return false;
    }


    public void anadirFicheroLog(String mensaje) {
        this.gestion.anadirFicheroLog(mensaje, "src/main/resources/loggers/logs.txt");
    }

}

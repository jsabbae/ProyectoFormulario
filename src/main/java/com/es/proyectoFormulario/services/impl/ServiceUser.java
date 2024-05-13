package main.java.com.es.proyectoFormulario.services.impl;


import main.java.com.es.proyectoFormulario.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser {

    // ATRIBUTOS
    private ArrayList<User> users; // Contiene todos los registros del fichero users.txt
    private GestionFicheroUser gestionUser; // gestion es un objeto para poder llamar a los métodos de GestionFicheroUser
    private ServiceLogger logger;
    private String ruta = "src/main/resources/users/users.txt";

    public ServiceUser() {
        this.users = new ArrayList<>();
        this.gestionUser = new GestionFicheroUser();
        leerFicheroUsers();
        this.logger = new ServiceLogger();
    }


    public boolean checkUser(String idUser, String password) {

        for (int i = 0; i < this.users.size(); i++) {
            User usuario = this.users.get(i); // usuario es el elemento de la posicion i de users
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean userExists(String idUser) {

        return this.users.stream().anyMatch(user -> user.getId().equalsIgnoreCase(idUser));

    }
    public boolean nameExists(String nameUser){
        return this.users.stream().anyMatch(user -> user.getName().equalsIgnoreCase(nameUser));
    }
    public boolean passwordExists(String passwordUser){
        return this.users.stream().anyMatch(user -> user.getPass().equalsIgnoreCase(passwordUser));
    }
    public boolean isAdminExists(String isAdminUser){

        return this.users.stream().anyMatch(user -> (user.isAdmin().equalsIgnoreCase(isAdminUser)));
    }


    public void leerFicheroUsers() {
        this.users = gestionUser.leerFichero(ruta);
    }

    public void anadirFicheroUsers(User u) {
        gestionUser.anadirFichero(u, ruta);
    }

    public void modificarFicheroUsers() {
        gestionUser.modificarFichero(this.users, ruta);
    }
}

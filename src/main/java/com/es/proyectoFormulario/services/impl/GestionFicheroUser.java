package main.java.com.es.proyectoFormulario.services.impl;


import main.java.com.es.proyectoFormulario.model.User;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroUser {
    String ruta = "src/main/resources/users/users.txt";

    public ArrayList<User> leerFichero(String ruta) {
        ArrayList<User> arrUserTemporal = new ArrayList<>();
        File fichero = new File(ruta);
        try {
            if (fichero.canRead() && fichero.isFile() && fichero.exists()) {
                FileReader fr = null;
                BufferedReader br = null;

                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String lineaDeFichero = br.readLine();
                int i = 0;
                while (lineaDeFichero != null) {
                    String[] informacionUsers = lineaDeFichero.split(":");

                    String id_user = "";
                    String name_user = "";
                    String password = "";
                    String isAdmin = "";

                    id_user = informacionUsers[0];
                    name_user = informacionUsers[1];
                    password = informacionUsers[2];
                    isAdmin = informacionUsers[3];

                    User user = new User(id_user, name_user, password, Boolean.valueOf(isAdmin));
                    if (!arrUserTemporal.contains(user)) {
                        arrUserTemporal.add(user);
                    }
                    lineaDeFichero = br.readLine();
                }

                br.close();
                fr.close();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrUserTemporal;
    }

    public void modificarFichero(ArrayList<User> users, String ruta) {
        File fichero = new File(ruta);
        if (fichero.exists() && fichero.canWrite() && fichero.isFile()) {
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                fw = new FileWriter(fichero);
                bw = new BufferedWriter(fw);

                for (User u : users) {
                    bw.write(u.getId());
                    bw.write(":");
                    bw.write(u.getName());
                    bw.write(":");
                    bw.write(u.getPass());
                    bw.write(":");
                    bw.write(String.valueOf(u.isAdmin()));
                    bw.write("\n");
                }
                bw.close();
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void anadirFichero(User users, String ruta) {
        File fichero = new File(ruta);
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {
            FileWriter fa = null;
            BufferedWriter ba = null;
            try {
                fa = new FileWriter(fichero, true);
                ba = new BufferedWriter(fa);

                ba.write("\n");
                ba.write(users.getId()+ ":"+ users.getName()+ ":"+ users.getPass()+ ":");
                ba.write(users.isAdmin()+ "");

                ba.close();
                fa.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}


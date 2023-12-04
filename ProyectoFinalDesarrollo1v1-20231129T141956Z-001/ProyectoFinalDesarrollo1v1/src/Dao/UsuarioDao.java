package Dao;

import Models.Usuario;

import java.io.*;
import java.util.ArrayList;

public class UsuarioDao {
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    public ArrayList<Usuario> cargarUsuarios() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ARCHIVO_USUARIOS))) {
            listaUsuarios = (ArrayList<Usuario>) inputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de usuarios no encontrado. Se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return listaUsuarios;
    }

    public void guardarUsuarios(ArrayList<Usuario> listaUsuarios) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ARCHIVO_USUARIOS))) {
            outputStream.writeObject(listaUsuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

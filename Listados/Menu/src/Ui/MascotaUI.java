package Ui;

import Modelo.Mascota;

import javax.swing.*;

public class MascotaUI {
    public void grabar() {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota.");
        String raza = JOptionPane.showInputDialog("Ingrese raza de la mascota.");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad de la mascota."));

        Mascota miMascota = new Mascota(nombre,raza,edad);
    }
    public void modificar(){
        

    }
    public void listar(){

    }
    public void salir(){
        System.exit(0);
    }


}

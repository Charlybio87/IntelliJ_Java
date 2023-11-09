package EstructuraProyecto;

import Ui.MascotaUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion;
        MascotaUI mascotaUi = new MascotaUI();
        while(true){

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion: "));

            switch(opcion){

                case 1: mascotaUi.grabar();break;
                case 2: mascotaUi.modificar();break;
                case 3: mascotaUi.listar();break;
                case 4: mascotaUi.salir();break;
                default:
                    JOptionPane.showInputDialog(null,"Opcion Invalida.");

            }
        }

    }
}

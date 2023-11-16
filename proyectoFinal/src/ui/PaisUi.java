package ui;



import service.PaisService;

import javax.swing.*;

public class PaisUi {

    PaisService paisService = new PaisService();

    public PaisUi(){
        int opcion;
        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "GESTION DE PAISES"+ "\n" +
                    "1. Alta de Paises" + "\n"+
                    "2. Modificar Paises"+ "\n" +
                    "3. Salir "+ "\n"
            ));
            switch (opcion){
                case 1:
                    getMenuDatosPais();
                    break;
                case 2:
                    //modificarMenuPais();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog( null,"Opcion invalida",
                        "Error",JOptionPane.ERROR_MESSAGE,null);
                    break;
            }

        }

    }
    public void getMenuDatosPais() {
        boolean esvalido = false;
        String nombre = null;
        int cantidadHabitantes;

        while(!esvalido) {
        nombre = JOptionPane.showInputDialog("Ingrese Nombre del Pais",
                "new");
        esvalido = paisService.validarNombrePais(nombre);
        }
        esvalido = false;
        while(!esvalido) {
            cantidadHabitantes = Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese la cantidad de Habitantes",
                    0));
            esvalido = paisService.validarCantidadHabitantesPais(cantidadHabitantes);
        }

    }

}

package ui;

import models.Pais;
import service.PaisService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class PaisUi {

    PaisService paisService = new PaisService();
    private ArrayList<Pais> misPaises = new ArrayList<Pais>();

    public PaisUi(){
        int opcion;
        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "GESTION DE PAISES"+ "\n" +
                    "1. Cargar Paises" + "\n"+
                    "2. Modificar Paises"+ "\n" +
                    "3. Carga previa Paises"+ "\n" +
                    "4. Mostrar Lista"+ "\n" +
                    "5. Salir "+ "\n"
            ));
            switch (opcion){
                case 1:
                    getMenuDatosPais();
                    break;
                case 2:
                    modificarMenuPais();
                    break;
                case 3:
                    cargaPrevia();
                    break;
                case 4:
                    mostrarListaPaises();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog( null,"Opcion invalida",
                        "Error",JOptionPane.ERROR_MESSAGE,null);
                    break;
            }

        }

    }
    public void mostrarListaPaises(){
        for (Pais pais : misPaises) {
            System.out.println(pais.toString());
        }
    }
    public void cargaPrevia(){
        Pais p;
        Date d = new Date();
        for (int i=0; i<10; i++){
            p = new Pais("Argentina"+i,54045416+i,d);
            misPaises.add(p);
        }
    }
    public void getMenuDatosPais() {
        boolean esvalido = false;
        String nombre = null;
        int cantidadHabitantes = 0;
        Date d = new Date();

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
        Pais p = new Pais(nombre,cantidadHabitantes,d);
        misPaises.add(p);
    }

    public void modificarMenuPais(){

    }

}

import models.Profesor;
import service.ProfesorService;

import java.util.Scanner;
/*
* Se crearon directorios (Paquetes).
* CARPETA UI: actuaria como la interfaz usuario
*/
public class Main {

    static ProfesorService profesorService = new ProfesorService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        while (true){
            System.out.println(" ingrese su opcion");
            System.out.println("1. crear profesor ");
            System.out.println("3. Listar profesor");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    // pedir los datos
                    Profesor prof = new Profesor("juan", "pacheco", 12311);
                    profesorService.createProfesor(prof);
                    break;


            }


        }

    }
}
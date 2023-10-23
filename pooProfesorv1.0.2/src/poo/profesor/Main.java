package poo.profesor;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

        /*INICIALIZACION DE VARIABLES Y DECLARACIONES*/
            boolean band =true;
        /*CREACION DE CLASES CON Y SIN OBJETOS*/
        Profesor profesorTitular = new Profesor('1', "Favaloro", "Rene", "Titular");
        Profesor profesorTp = new Profesor('2', "Argento", "Pepe", "Practica");
        ;
        Profesor profesorGabinete = new Profesor('3', "Curie", "Martha", "Gabinete");

        Alumno alumno1 = new Alumno(10, "Lionel", "Messi",
                ' ', ' ', ' ');
        Alumno alumno2 = new Alumno(21, "Manu", "Ginobili",
                ' ', ' ', ' ');
        Alumno alumno3 = null;

      do {
            System.out.println("""
                    ****** SISTEMA ******
                    1. Profesos Titular
                    2. Profesor Trabajo Practico
                    3. Profesor Gabinete
                    4. Motrar Profesores
                    5. Salir
                    """);
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Profesor titular: ");
                    String saludo= profesorTitular.saludar();
                    System.out.println(saludo);
                    System.out.println("============");
                    profesorTitular.saludo2();
                    break;
                case 2:
                    System.out.println("Profesor Trabajos Practicos: ");
                    profesorTp.saludo2();
                    break;
                case 3:
                    System.out.println("Profesor Gabinete: ");
                    profesorGabinete.saludo2();
                    break;
                case 4:
                    System.out.println(profesorTitular);
                    System.out.println(profesorTp);
                    System.out.println(profesorGabinete);
                    break;
                case 5:
                    band = false;
                    break;

            }

     } while (band == true);
    }


}

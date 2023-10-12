import java.net.ContentHandler;
/*
*   1.	Crear un proyecto
    2.	Crear una clase Profesor
    3.	Crear 3 profesores
    4.	Modificar el nombre de los tres profesores
    5.	Listar o mostrar a los profesores
    6.  Crear un menú de opciones :
        -	Crear los tres profesores
        -	Modificar el nombre de los tres profesores
        -	listar a los tres profesores
* */
public class Main {
    public static void main(String[] args) {
        // Se crean clase con objetos vacios
        int i;
        Profesor profesor1 = null;
        Profesor profesor2 = null;
        Profesor profesor3 = null;


        for (i = 1; i < 3; i++) {
            if (i == 1) {
                profesor1 = new Profesor("","","");
            }else if (i == 2) {
                profesor2 = new Profesor("","","");
            }else if (i == 3){
                profesor3 = new Profesor("","","");
            }
        }

    }
}

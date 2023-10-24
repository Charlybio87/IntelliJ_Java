package ArrayList;
import java.util.ArrayList;
public class MiArrayList {
    public static void main(String[] args) {
        //Declaracion del arraylist
        ArrayList<String> mercaderias;

        //Instanciacion del arraylist
        mercaderias = new ArrayList<String>();

    /*METODOS*/
    // 1- Insertar
        mercaderias.add("1k pan");
        mercaderias.add("1k papas");
        mercaderias.add("6 huevos");

    // 2- Imprimir el Arraylist
        System.out.println(mercaderias);

    // 3- Longuitud del Arraylist
        System.out.println(mercaderias.size());

    // 4- Añadir elemento al arraylist
        mercaderias.add("6 limones");
        System.out.println(mercaderias);

    // 5- Obtener un elemento del Arraylist
        System.out.println(mercaderias.get(3));

    // 6- Cambiar un elemento del arraylist
        mercaderias.set(2,"1 mermelada");
        System.out.println(mercaderias);

    // 7- Borrar un elemento delarraylist
        mercaderias.remove(0);
        System.out.println(mercaderias);

        System.out.println(mercaderias.toString());


    }
}

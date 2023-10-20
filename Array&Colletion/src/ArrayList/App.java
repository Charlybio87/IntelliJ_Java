package ArrayList;
/* import java.util.List;
 import java.util.arraylist;*/
import java.util.*;//.* importa todo


public class App {
    public static void main(String[] args) throws Exception {
        //Declaramos arraylist
        List<String> grupoMundial = new ArrayList<String>();

        //Llenar el arraylist con em metodo .add
        grupoMundial.add("Argentina");
        grupoMundial.add("Uruguay");
        grupoMundial.add("Brasil");
        grupoMundial.add("Ecuador");
        grupoMundial.add("Peru");
        grupoMundial.add("Chile");
        grupoMundial.add("Paraguay");
        grupoMundial.add("Bolivia");
        grupoMundial.add("Colombia");
        grupoMundial.add("Venenzuela");
        grupoMundial.add("Estados Unidos");
        grupoMundial.add("Mexico");

        //Bucle ForEach
        int i = 1;
        int contador = 1;
        for (String pais:grupoMundial) {
            System.out.println(i +". "+ pais);
            i++;
            if(contador % 3 == 0) {
                System.out.println("=================");
            }
            contador++;
        }

        System.out.println("Son "+grupoMundial.size()+" equipos de America.");

        System.out.println("En la posicion 10 se encuentra: "+grupoMundial.get(9));

        System.out.println("El equipo que fue eliminado es: "+grupoMundial.remove(5));






    }
}

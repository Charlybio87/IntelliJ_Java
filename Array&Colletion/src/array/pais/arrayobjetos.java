package array.pais;

import java.util.ArrayList;
import java.util.List;

public class arrayobjetos {
    public static void main(String[] args){

        ArrayList<Pais> paises = new ArrayList<Pais>();
        Pais miArgentina = new Pais("Argentina",
                45000000,4000000);

        paises.add(miArgentina);
        paises.add(new Pais("Uruguay",3000000
                ,175000));
        paises.add(new Pais("Chlie",1000000
                ,1000000));
        System.out.println(miArgentina);
        /*  for (Pais p:paises){
            System.out.println(p.toString());

        }*/
        for (Pais miPais:paises){
            System.out.println(miPais.toString());

        }
    }
}

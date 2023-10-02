/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "LOGIN.java."

import java.io.*;

public class login {

    // Tema: logica - operadores relaciones
    // @autor: Carlos A.Ribas
    // @date: 09/08/23
    // @version: 1.0.0
    // Título: hacer un login.
    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String clave;
        String clavecontrol;
        boolean tienepermiso;
        boolean tienepermiso2;
        String usr;
        String usrcontrol;
        // deckaracion de las variables
        // inicializacion de la variable clavecontrol
        usrcontrol = "santino22";
        clavecontrol = "123codo";
        // hardcode
        // inicializacion de la variable clave por instr salida-entrada
        System.out.print("ingrese su usuario: ");
        usr = bufEntrada.readLine();
        System.out.print("ingrese su clave: ");
        clave = bufEntrada.readLine();
        // Proceso
        tienepermiso2 = usrcontrol.equals(usr);
        tienepermiso = clavecontrol.equals(clave);
        // obtencion de resultado
        System.out.println("¿el usuario es correcto?"+tienepermiso2);
        System.out.println("¿la clave es correcta?"+tienepermiso);
        // escribir "¿Puede acceder? ",tienepermiso;
    }


}
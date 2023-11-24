package codoacodo;

import javax.naming.InitialContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //definir nombre del archivo
    private static final String FILE_PATH = "alumno.txt";
    public static void main(String[] args) {
        //generar alta de 2 alumnos: altaRegsitro(nombre,apellido)
        altaRegistro("Ana","Pacheco");
        altaRegistro("Jorge","Villarroel");

        //vamos a leer un archivo y mostrar los registros en pantalla
        List<String> registros = leerRegistros();
        // vamos a visualizar el arrayList de los registros
        for (String registro: registros){
            System.out.println(registro);
        }
        //Actualizar el archivo de alumno.
        actualizacionRegistro(1,"Julia","Ramirez");
        //Eliminar un Registro
        eliminarRegistro(0);
    }
    //Metodo para hacer el alta
    public static void altaRegistro(String nombre,String apellido){
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(FILE_PATH,
                true))){
            buffer.write(nombre +","+apellido);
            buffer.newLine();

        }catch (IOException e){
            System.out.println("No se pudo registrar el alta"+e.getMessage());
        }
    }
    public static List<String> leerRegistros(){
        List<String> registros = new ArrayList<>();
        try(BufferedReader leer = new BufferedReader(new FileReader(FILE_PATH))){
            String linea;
            while((linea = leer.readLine()) !=null){
                registros.add(linea);
            }
        }catch(IOException e){
            System.out.println("No se pudo leer el registro"+e.getMessage());
        }

        return registros;
    }
    public static void actualizacionRegistro(int indice, String newNombre,
                                             String newApellido){
        //busco los registros delk archivo txt y los pongo en un arrayList
        List<String> registros = leerRegistros();
        if(indice > 0 && indice < registros.size()){
            registros.set(indice,newNombre+","+newApellido);
            escribirArrayListAltxt(registros);
        }else{
            System.out.println("el indice ingresado es incorrecto");
        }
    }
    private static void escribirArrayListAltxt(List<String> registros){
        try(BufferedWriter escribir = new BufferedWriter(new FileWriter(FILE_PATH,
                true))){
            for (String registro: registros){
                escribir.write(registro);
                escribir.newLine();

            }

        }catch (IOException e){
            System.out.println("No se pudo escribir en el archivo"+e.getMessage());
        }
    }
    public static void eliminarRegistro(int indice){
        List<String> registros = leerRegistros();
        if (indice >= 0 && indice < registros.size()){
            registros.remove(indice);
            escribirArrayListAltxt(registros);

        }else{
            System.out.println("el registro a eliminar bno existe");
        }
    }

}

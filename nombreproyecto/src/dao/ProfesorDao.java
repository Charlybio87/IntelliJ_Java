package dao;

import models.Profesor;

import java.util.List;
/*
* CAR4PETA DAO: se colocará todo lo referido (ej.alumno, profesor) a escritura, lectura
* en un archivo o una base de datos.
* Aquí se manejara lo que almacenara el profesor.
*/
public class ProfesorDao {

    /* CREAR METODOS*/
    private final String archivo = "profesor.txt";
    // private (no pueda ser modificado por nadie de afuera ni adentro), final (ctte).
    public void crearProfesor(Profesor prof){
        // va el codigo para crear una persona en txt o la base de datos
    }
    public List<Profesor> getProfesores(){
        // voy a buscar a los profesores en el archivo o la base
        // de datos
        return null;
    }
    public Profesor getProfesorPorId(int id){
        // buscar en el archivo o la base de datos ese id y devuelve un Profesor
        return null;
    }

    public void alterProfesor(Profesor prof){
        // modifica un profesor en la base de datos o el archivo
    }
    public void deleteProfesor(int id){
        // elimina un profesor
    }
}

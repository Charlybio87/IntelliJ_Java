package service;

import dao.ProfesorDao;
import models.Profesor;
/*
*CARPETA SERVICE: recibe y guarda las peticiones de la UI y peticiona al metodo
* del DAO (ProfesorDao,AlumnoDao)
*/
public class ProfesorService {
    private ProfesorDao profesorDao = new ProfesorDao();
    // se declara un objeto del tipo de ProfesosDao

    public void createProfesor(Profesor prof){
       profesorDao.crearProfesor(prof);
    }





}

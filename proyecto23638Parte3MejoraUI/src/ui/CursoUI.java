package ui;

import models.Curso;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CursoUI {

    ArrayList<Curso> misCursos = new ArrayList<>();
    public CursoUI(){
        int opcion;
        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    " 1. Crear curso" + "\n" +
                    " 2. Modificar curso" + "\n" +
                    " 3. Eliminar curso" + "\n" +
                    " 4. Salir"
            ));

            switch (opcion) {
                case 1:  altaCurso(); break;
                case 2:  modificarCurso(); break;
                case 3:  eliminarCurso(); break;
                case 4:  System.exit(0);
            }
        }

    }
    public void altaCurso(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección donde se dicta el curso:");
        String fechaInicioCursoStr = JOptionPane.showInputDialog("Ingrese la fecha de inicio del curso (en formato dd/MM/yyyy):");
        String fechaFinCursoStr = JOptionPane.showInputDialog("Ingrese la fecha de finalización del curso (en formato dd/MM/yyyy):");

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicioCurso = dateFormat.parse(fechaInicioCursoStr);

            //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaFinCurso = dateFormat.parse(fechaFinCursoStr);

            Curso miCurso = new Curso(nombre, direccion, fechaInicioCurso,fechaFinCurso);
            misCursos.add(miCurso);

            JOptionPane.showMessageDialog(null, "El curso fue creado exitosamente.");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar la fecha de inicio o fin del curso. Asegúrese de ingresar el formato correcto (dd/MM/yyyy).");
        }
    }
    public void modificarCurso(){
        int seleccionarCurso;
        seleccionarCurso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese al curso que deseas moficar"));
        if(seleccionarCurso>= 0 && seleccionarCurso < misCursos.size()){
            Curso cursoActualizar = misCursos.get(seleccionarCurso);

            String nombreNew = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
            String direccionNew= JOptionPane.showInputDialog("Ingrese la dirección donde se dicta el curso:");
            String fechaInicioCursoStrNew = JOptionPane.showInputDialog("Ingrese la fecha de inicio del curso (en formato dd/MM/yyyy):");
            String fechaFinCursoStrNew = JOptionPane.showInputDialog("Ingrese la fecha de finalización del curso (en formato dd/MM/yyyy):");
            try {
                cursoActualizar.setNombre(nombreNew);
                cursoActualizar.setDireccion(direccionNew);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date nuevaFechaCursoInicio = dateFormat.parse(fechaInicioCursoStrNew);
                Date nuevaFechaCursoFin = dateFormat.parse(fechaFinCursoStrNew);
                cursoActualizar.setFechaInicio(nuevaFechaCursoInicio);
                cursoActualizar.setFechaFin(nuevaFechaCursoFin);
                misCursos.set(seleccionarCurso, cursoActualizar);
                JOptionPane.showMessageDialog(null, "se modifico correctamente el curso");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error al procesar la fecha de inicio o fin del curso. Asegúrese de ingresar el formato correcto (dd/MM/yyyy).");
            }


        }
    }
    public void eliminarCurso() {
        int seleccionarCurso;
        seleccionarCurso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese al curso que deseas moficar"));
        if (seleccionarCurso >= 0 && seleccionarCurso < misCursos.size()) {
            misCursos.remove(seleccionarCurso);
            JOptionPane.showMessageDialog(null, "Curso eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Se elimino correctamente r.");
        }

    }

}

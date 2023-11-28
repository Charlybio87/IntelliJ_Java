package ui;

import models.Curso;
import models.Usuario;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioUI {
    private ArrayList<Usuario> misUsuarios = new ArrayList<>();
    private int idUltimo = 0;

    public UsuarioUI(){
        int opcion;
        while(true){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    " 1. Crear usuario" + "\n" +
                    " 2. Modificar usuario" + "\n" +
                    " 3. Eliminar usuario" + "\n" +
                    " 4. Carga previa de datos" + "\n" +
                    " 5. Listar Usuarios" + "\n" +
                    " 6. Buscar un usuario" + "\n" +
                    " 7. Salir"
            ));

            switch (opcion) {
                case 1:  altaUsuario(); break;
             //   case 2:  modificarUsuario(); break;
             //   case 3:  eliminarUsuario(); break;
                case 4:  cargaPreviaDeUsuarios(); break;
                case 5:  listarUsuarios(); break;
             //   case 6:  buscarUsuario(); break;
                case 7:  System.exit(0);break;
                default: JOptionPane.showConfirmDialog(null,"opcion invalida");
            }
        }
    }
    private void cargaPreviaDeUsuarios(){
        Usuario u;
        Date d = new Date();
        for ( int i= 0 ; i<10; i++){
            u = new Usuario("Ana"+i, "lopez"+i,d);
            misUsuarios.add(u);
        }
    }
    public void listarUsuarios(){
        for(Usuario p: misUsuarios){
            System.out.println(p);
        }
    }


    public void altaUsuario(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del usuario:");
        String fechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del usuario " +
                "(en formato dd/MM/yyyy):");

        // agreagar validaciones!!!!


        //idUltimo = idUltimo +1;
        //int idUsuario = idUltimo;
        //Integer.parseInt(JOptionPane.showInputDialog("ingrese el id del usuario"));

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaNacimiento = dateFormat.parse(fechaNacimientoStr);

            Usuario miUsuario = new Usuario(nombre, apellido,fechaNacimiento);
            misUsuarios.add(miUsuario);

            JOptionPane.showMessageDialog(null, "El Usuario fue creado exitosamente.");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar la fecha de nacimiento. Asegúrese de ingresar el formato correcto (dd/MM/yyyy).");
        }
    }
    /*public void modificarCurso(){
        int usuarioAModificar;
        usuarioAModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre del usuario que deseas moficar"));


        if(usuarioAModificar>= 0 && usuarioAModificar < misUsuarios.size()){
            Usuario usuarioActualizar = misUsuarios.get(usuarioAModificar);

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
    public void buscarUsuario(){}
*/

}


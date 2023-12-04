package Services;

import Dao.UsuarioDao;
import Models.Usuario;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioService {

    UsuarioDao usuarioDao = new UsuarioDao();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void crearNuevoUsuario() {
        // Solicitar al usuario los datos del nuevo usuario
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del usuario:"));
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        Date fechaAlta = new Date(); // Fecha actual
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");
        Date fechaNacimiento = obtenerFechaNacimiento();

        // Crear una nuevo Usuario y agregarlo a la lista
        Usuario nuevoUsuario = new Usuario(id, nombreUsuario, fechaAlta, null, contraseña, fechaNacimiento);
        listaUsuarios.add(nuevoUsuario);

        JOptionPane.showMessageDialog(null, "Usuario creado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        usuarioDao.guardarUsuarios(listaUsuarios);

    }


    private Date obtenerFechaNacimiento() {
        // Solicitar al usuario la fecha de nacimiento en formato dd/mm/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            String fechaNacString = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/yyyy):");
            return dateFormat.parse(fechaNacString);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Ingrese la fecha en formato dd/mm/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
            return obtenerFechaNacimiento();
        }
    }

    public void modificarUsuario() {
        // Solicitar al usuario el ID del usuario a modificar
        int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del usuario que desea modificar:"));

        // Buscar el usuario en la lista por su ID
        Usuario usuarioModificar = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID() == idModificar) {
                usuarioModificar = usuario;
                break;
            }
        }

        // Modificar el usuario si se encontró
        if (usuarioModificar != null) {
            // Solicitar al usuario los nuevos datos
            usuarioModificar.setNombreUsuario(JOptionPane.showInputDialog("Ingrese el nuevo nombre de usuario:"));
            usuarioModificar.setContraseña(JOptionPane.showInputDialog("Ingrese la nueva contraseña:"));
            usuarioModificar.setFechaNac(obtenerFechaNacimiento());


            JOptionPane.showMessageDialog(null, "Usuario modificado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        usuarioDao.guardarUsuarios(listaUsuarios);

    }

    public void buscarUsuario() {
        // Solicitar al usuario el ID del usuario a buscar
        int idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del usuario que busca:"));

        // Buscar el usuario en la lista por su ID
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID() == idBuscar) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        // Mostrar el resultado
        if (usuarioEncontrado != null) {
            JOptionPane.showMessageDialog(null, "Usuario encontrado:\n" + usuarioEncontrado.toString(), "Resultado de la búsqueda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Resultado de la búsqueda", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void listarUsuarios() {
        StringBuilder listaUsuariosTexto = new StringBuilder("Lista de Usuarios:\n");

        if (listaUsuarios.isEmpty()) {
            listaUsuariosTexto.append("No hay usuarios registrados.");
        } else {
            for (Usuario usuario : listaUsuarios) {
                listaUsuariosTexto.append(usuario.toString()).append("\n");
            }
        }

        // Mostrar la lista de usuarios
        JOptionPane.showMessageDialog(null, listaUsuariosTexto.toString(), "Lista de Usuarios", JOptionPane.INFORMATION_MESSAGE);
    }
    public void eliminarUsuarios() {
        // Solicitar al usuario el ID del usuario a eliminar
        int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del usuario que desea eliminar:"));

        // Buscar el usuario en la lista por su ID
        Usuario usuarioEliminar = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getID() == idEliminar) {
                usuarioEliminar = usuario;
                break;
            }
        }

        // Eliminar el usuario si se encontró
        if (usuarioEliminar != null) {
            listaUsuarios.remove(usuarioEliminar);
            JOptionPane.showMessageDialog(null, "Usuario eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        usuarioDao.guardarUsuarios(listaUsuarios);
    }






}

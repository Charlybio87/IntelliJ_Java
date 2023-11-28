import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear ArrayList de usuarios
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Crear objetos Usuario y agregarlos a la lista
        Usuario usuario1 = new Usuario("Juan", 25, "juan@example.com");
        Usuario usuario2 = new Usuario("María", 30, "maria@example.com");

        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);

        // Imprimir la lista antes de la modificación
        System.out.println("Lista antes de la modificación:");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
        int indiceMod = 1;
        Usuario usuarioMod = listaUsuarios.get(indiceMod);
        usuarioMod.setNombre("Carlos");
        System.out.println("\nLista después de la modificación:");
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }



        /*// Modificar el nombre del primer usuario en la lista
        if (!listaUsuarios.isEmpty()) {
            Usuario usuarioModificado = listaUsuarios.get(0);  // Obtener el primer usuario
            usuarioModificado.setNombre("carlos");       // Modificar el nombre

            // Imprimir la lista después de la modificación
            System.out.println("\nLista después de la modificación:");
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
            }
        } else {
            System.out.println("La lista está vacía.");
        }*/
    }
}
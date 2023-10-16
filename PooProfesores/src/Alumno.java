public class Alumno {

    int id;             //Variables globales
    String nombre;
    String apellido;
    int calificacion;

    public Alumno(int id, String nombre, String apellido, int calificacion) { // Constructor (<tipo><datos>,... )
        this.id = id;                                       // This.* establece que variable de esta clase
        this.nombre = nombre;                               // asignale el valor que se recibe como parametro
        this.apellido = apellido;                           // Variables Locales que pueden ser usadas dentro Constr.
        this.calificacion = calificacion;
    }

    public int getId() {                                    // Estructura de tipo Funcion
        return id;                                          // Retorna una id. Muestra
    }

    public void setId(int id) {                             //
        this.id = id;                                       // No hay retorno. Recibe/modifica
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarNombre() {
        System.out.println("Alumno");
    }
    public void notaExamen() {

        if(calificacion == 10) {
            System.out.println("Aprobado con Honores ");
        }else if ((8 <= calificacion) && (calificacion <= 9)){
            System.out.println("Aprobado");
        }else if ((6 <= calificacion) && (calificacion <= 8)) {
            System.out.println("Suficiente");
        }else if (calificacion <= 6){
            System.out.println("Desaprobado");
        }else
            System.out.println("No tiene calificacion.");
    }

}
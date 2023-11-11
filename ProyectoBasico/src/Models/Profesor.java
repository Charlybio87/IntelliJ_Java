package Models;

public class Profesor {
    private String nombre;
    private String apellido;
    private int dni;
    int cantidadClases;

    public Profesor(String nombre, String apellido, int dni, int cantidadClases) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantidadClases = cantidadClases;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", cantidadClases=" + cantidadClases +
                '}';
    }
}

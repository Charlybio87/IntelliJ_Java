public class Alumno {

    // Se generan 3 propiedades
    String  nombre; // Propiedad/atributo nombre
    String  apellido;
    String  materia;

    // Metodo Constructor de Objetos
    public Alumno(String nombre, String apellido, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    //Metodo Getters and Setters (Lee y modifica)
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Metodo String. Codigo que muestra los datos
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }

}

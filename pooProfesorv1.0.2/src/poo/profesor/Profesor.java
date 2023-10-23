package poo.profesor;

public class Profesor {
    int id;
    String apellido, nombre, cargo;

    public Profesor(int id, String apellido, String nombre, String cargo) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", Apellido='" + apellido + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Cargo='" + cargo + '\'' +
                '}';
    }
    public String saludar(){
        return "Hola Profesor " + apellido + "!"
                + " que podemos hacer por ud."
                ;
    }
    public void saludo2(){
        System.out.println("Hola Profesor " + apellido + "!"
                + " que podemos hacer por ud.");
    }

}

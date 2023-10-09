public class Aula {
    //Defino Atributos
    String nombre;
    String direccion;

//Método constructor
    public Aula(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
//Método getter and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

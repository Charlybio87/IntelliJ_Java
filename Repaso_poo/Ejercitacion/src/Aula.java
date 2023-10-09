public class Aula {
    // DEFINO ATRIBUTOS/PROPIEDADES
    String nombre;
    String direccion;

    // METODO CONSTRUCTOR ()
    public Aula(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    // METODO SET AND GET (modifica y leer propiedades)
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
    //METODO STRING (visualizamos los datos)
    @Override
    public String toString() {
        return "Imprimir datos de miAula "+"nombre: '" + nombre + '\'' +", direccion:'" + direccion + '\'';}
>>>>>>> Stashed changes
}

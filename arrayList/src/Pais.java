public class Pais {
    private String nombre; //private que no se pueda ver y no se puede modificar (encapsuilamiento)
    public Pais(String Nombre){
        this.nombre = Nombre;
    }
    public String getNombre(){ // Funcion por tener un return
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

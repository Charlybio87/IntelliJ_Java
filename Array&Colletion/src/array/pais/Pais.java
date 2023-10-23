package array.pais;

public class Pais {
    private String nombre;
    private int poblacion;
    private double superficie;

    public Pais(String nombre, int poblacion, double superficie) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Nombre del pais: "+ this.nombre +"."+
                "con una poblacion: "+ this.poblacion+"."+
                "con una supericie: "+ this.superficie+"."
                ;
    }

}

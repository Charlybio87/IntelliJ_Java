package models;

public class Pais {
    private String nombre;
    private int cantidadHabitantes;

    public Pais(String nombre, int cantidadHabitantes) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void setCantidadHabitantes(int cantidadHabitantes) {
        this.cantidadHabitantes = cantidadHabitantes;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", cantidadHabitantes=" + cantidadHabitantes +
                '}';
    }
}

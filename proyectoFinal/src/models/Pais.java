package models;

import java.util.Date;

public class Pais {
    private String nombre;
    private int cantidadHabitantes;
    private Date d;

    public Pais(String nombre, int cantidadHabitantes, Date d) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.d = d;
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

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", cantidadHabitantes=" + cantidadHabitantes +
                ", Date=" + d +
                '}';
    }
}

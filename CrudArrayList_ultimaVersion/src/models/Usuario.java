package models;

import java.util.Date;

public class Usuario {
    private int id;
    private String nombre;
    private Date fechaAlta;
    private Date fechaModificacion;
    private String fechaNacimiento;
    private String contrasena;

    public Usuario(int id, String nombre, Date fechaAlta,
                   Date fechaModificacion, String fechaNacimiento, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return  "\n"
                + id +
                ", " + nombre +
                ", " + fechaAlta +
                ", " + fechaModificacion +
                ", " + fechaNacimiento +
                ", " + contrasena;
    }
}


package Datos;

public class Profesores {
    private String nombre;
    private String apellido;
    private int dni;
    private int nota;

    public Profesores(String nombre, String apellido, int dni,int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
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

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Comision 23636: " +
                " Nombre= " + nombre +
                " Apellido= " + apellido +
                " dni= " + dni +
                " nota= " + nota
                ;
    }
    public void calificacion(){
        if (nota == 10){
            System.out.println("Aprobado con Honores");
        }else if((nota>=7)&&(nota<=9)){
            System.out.println("Aprobado");
        } else if ((nota>=4)&&(nota<=6)) {
            System.out.println("Suficiente");
        }else
            System.out.println("Nos vemos pronto!!");
    }

}

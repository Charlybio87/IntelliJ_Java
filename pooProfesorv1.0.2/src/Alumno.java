public class Alumno {
    int id,notaexamen,notapractica,notagabinete;
    String apellido, nombre;

    public Alumno(int id, String apellido, String nombre, int notaexamen, int notapractica, int notagabinete) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.notaexamen = notaexamen;
        this.notapractica = notapractica;
        this.notagabinete = notagabinete;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNotaexamen() {
        return notaexamen;
    }

    public void setNotaexamen(int notaexamen) {
        this.notaexamen = notaexamen;
    }

    public int getNotapractica() {
        return notapractica;
    }

    public void setNotapractica(int notapractica) {
        this.notapractica = notapractica;
    }

    public int getNotagabinete() {
        return notagabinete;
    }

    public void setNotagabinete(int notagabinete) {
        this.notagabinete = notagabinete;
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

    @Override
    public String toString() {
        return  "id=" + id +
                ", Apellido='" + apellido + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Notaexamen=" + notaexamen +
                ", Notapractica=" + notapractica +
                ", Notagabinete=" + notagabinete +
                '}';
    }

    public void notaFinal() {
        float calificacion = (notaexamen + notagabinete + notapractica)/3;

        if(calificacion == 10) {
            System.out.println("Aprobado con Honores ");
        }else if ((8 <= calificacion) && (calificacion <= 9)){
            System.out.println("Aprobado");
        }else if ((6 <= calificacion) && (calificacion <= 8)) {
            System.out.println("Suficiente");
        }else if (calificacion <= 6){
            System.out.println("Desaprobado");
        }else
            System.out.println("No tiene calificacion.");
    }
}

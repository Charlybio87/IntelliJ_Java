import java.util.Date;

class Usuario {
    private int id;
    private String nombre;
    private Date fechaAlta;
    private Date fechaModificacion;
    private String password;
    private String fechaNacimiento;

    public Usuario(int id, String nombre, Date fechaAlta, Date fechaModificacion, String password, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.password = password;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y setters

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nombre: " + nombre +
                ", Fecha de Alta: " + fechaAlta +
                ", Fecha de Modificación: " + fechaModificacion +
                ", Contraseña: " + password +
                ", Fecha de Nacimiento: " + fechaNacimiento;
    }
}
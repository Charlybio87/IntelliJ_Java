package Models;
import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {


        private int ID;
        private String nombreUsuario;
        private Date fechaAlta;
        private Date fechaMod;
        private String contraseña;
        private Date fechaNac;

        public Usuario(int ID, String nombreUsuario, Date fechaAlta, Date fechaMod, String contraseña, Date fechaNac) {
            this.ID = ID;
            this.nombreUsuario = nombreUsuario;
            this.fechaAlta = fechaAlta;
            this.fechaMod = fechaMod;
            this.contraseña = contraseña;
            this.fechaNac = fechaNac;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        public Date getFechaAlta() {
            return fechaAlta;
        }

        public void setFechaAlta(Date fechaAlta) {
            this.fechaAlta = fechaAlta;
        }

        public Date getFechaMod() {
            return fechaMod;
        }

        public void setFechaMod(Date fechaMod) {
            this.fechaMod = fechaMod;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public Date getFechaNac() {
            return fechaNac;
        }

        public void setFechaNac(Date fechaNac) {
            this.fechaNac = fechaNac;
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "ID=" + ID +
                    ", nombreUsuario='" + nombreUsuario + '\'' +
                    ", fechaAlta=" + fechaAlta +
                    ", fechaMod=" + fechaMod +
                    ", contraseña='" + contraseña + '\'' +
                    ", fechaNac=" + fechaNac +
                    '}';
        }

}

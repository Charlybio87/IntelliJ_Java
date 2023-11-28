import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaTableModel extends AbstractTableModel {
    private List<Persona> listaPersonas;
    private String[] columnas = {"Nombre", "Dirección", "Fecha de Nacimiento"};

    public PersonaTableModel(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = listaPersonas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return persona.getNombre();
            case 1:
                return persona.getDireccion();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(persona.getFechaNacimiento());
            default:
                return null;
        }
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }
}

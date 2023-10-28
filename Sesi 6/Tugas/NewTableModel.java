import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class NewTableModel extends AbstractTableModel {

    // Mendefinisikan nama-nama kolom pada tabel
    private String[] columnNames = {"Nama", "No. HP", "Jenis_Kelamin", "WNA"};
    
    // Membuat ArrayList untuk menyimpan data dalam bentuk ArrayList<String>
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

    // Mengimplementasikan metode dari kelas AbstractTableModel

    // Mendapatkan jumlah kolom dalam tabel
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    // Mendapatkan jumlah baris dalam tabel
    @Override
    public int getRowCount() {
        return data.size();
    }

    // Mendapatkan nama kolom berdasarkan indeks kolom
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    // Mendapatkan nilai dari sel tertentu dalam tabel berdasarkan indeks baris dan kolom
    @Override
    public Object getValueAt(int row, int col) {
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }

    // Mendefinisikan bahwa sel dalam tabel tidak dapat diedit
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    // Menambahkan data baru ke model tabel
    public void add(ArrayList<String> value) {
        data.add(value);
        // Memberitahu tabel bahwa baris baru telah dimasukkan
        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
    }
}

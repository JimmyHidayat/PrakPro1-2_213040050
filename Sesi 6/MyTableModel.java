import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class MyTableModel extends AbstractTableModel {
    // Mendefinisikan array yang akan digunakan sebagai nama kolom di tabel
    private String[] columnNames = {"Nama", "Jenis Member"};
    // Mendefinisikan ArrayList dari ArrayList String untuk menyimpan data tabel
    private ArrayList<ArrayList<String>> data = new ArrayList<>();

    @Override
    public int getColumnCount() {
        // Mengembalikan jumlah kolom dalam tabel
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        // Mengembalikan jumlah baris (data) dalam tabel
        return data.size();
    }

    @Override
    public String getColumnName(int col) {
        // Mengembalikan nama kolom untuk indeks kolom tertentu
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        // Mengambil nilai (data) pada baris dan kolom tertentu dalam tabel
        List<String> rowItem = data.get(row);
        return rowItem.get(col);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        // Mengembalikan true jika sel dalam tabel dapat diedit, false jika tidak
        return false;
    }

    public void add(ArrayList<String> value) {
        // Menambahkan baris (data) baru ke tabel
        data.add(value);
        // Memberi tahu tabel bahwa baris baru telah ditambahkan
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}

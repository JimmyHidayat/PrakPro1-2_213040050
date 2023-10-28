import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;

public class HelloTable extends JFrame {
    
    public HelloTable() {
        // Mengatur operasi penutupan jendela ketika tombol close di jendela ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Nama" dan mengatur posisinya serta ukurannya
        JLabel labelInput = new JLabel("Nama:");
        labelInput.setBounds(15, 40, 350, 10);

        // Membuat TextField untuk memasukkan nama dan mengatur posisinya serta ukurannya
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Membuat label "No HP" dan mengatur posisinya serta ukurannya
        JLabel labelNoHP = new JLabel("No HP:");
        labelNoHP.setBounds(15, 100, 350, 10);

        // Membuat TextField untuk memasukkan nomor HP dan mengatur posisinya serta ukurannya
        JTextField noHPField = new JTextField();
        noHPField.setBounds(15, 120, 350, 30);

        // Membuat label "Jenis Kelamin" dan mengatur posisinya serta ukurannya
        JLabel labelRadio = new JLabel("Jenis Kelamin:");
        labelRadio.setBounds(15, 160, 100, 10);

        // Membuat tombol radio untuk memilih jenis kelamin (Laki-laki, Perempuan) dan mengatur posisinya serta ukurannya
        JRadioButton radioButtonMale = new JRadioButton("Laki-laki", true);
        radioButtonMale.setBounds(15, 180, 100, 30);

        JRadioButton radioButtonFemale = new JRadioButton("Perempuan");
        radioButtonFemale.setBounds(120, 180, 100, 30);

        // Mengelompokkan tombol radio ke dalam satu grup sehingga hanya satu yang dapat dipilih sekaligus
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonMale);
        genderGroup.add(radioButtonFemale);

        // Membuat label "WNA" (Warga Negara Asing) dan mengatur posisinya serta ukurannya
        JLabel labelWNA = new JLabel("WNA:");
        labelWNA.setBounds(15, 220, 50, 10);

        // Membuat kotak centang (CheckBox) untuk menunjukkan apakah pengguna adalah WNA atau bukan
        JCheckBox wnaCheckBox = new JCheckBox("Ya");
        wnaCheckBox.setBounds(15, 240, 100, 30);

        // Membuat tombol "Simpan" dan mengatur posisnya
        JButton button = new JButton("Simpan");
        button.setBounds(15, 280, 100, 40);

        // Membuat tabel Swing
        JTable table = new JTable();
        // Membuat panel pengguliran untuk tabel
        JScrollPane scrollableTable = new JScrollPane(table);
        // Mengatur posisi dan ukuran panel pengguliran
        scrollableTable.setBounds(15, 330, 700, 200);

        // Membuat objek model tabel "NewTableModel" yang telah didefinisikan sebelumnya
        NewTableModel tableModel = new NewTableModel();
        // Mengatur model tabel ke tabel Swing
        table.setModel(tableModel);

        // Menambahkan ActionListener ke tombol "Simpan" untuk mengambil data yang dimasukkan pengguna, seperti nama, nomor HP, jenis kelamin, dan status WNA, dan menambahkannya ke model tabel.

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String noHP = noHPField.getText();
                String jenisKelamin = radioButtonMale.isSelected() ? "Laki-laki" : "Perempuan";
                String isWNA = wnaCheckBox.isSelected() ? "Yes" : "No";

                // Menambahkan data ke model tabel
                tableModel.add(new ArrayList<>(Arrays.asList(nama, noHP, jenisKelamin, isWNA)));
            }
        });

        // Menambahkan semua komponen ke frame
        this.add(button);
        this.add(textField);
        this.add(noHPField);
        this.add(labelInput);
        this.add(labelNoHP);
        this.add(labelRadio);
        this.add(radioButtonMale);
        this.add(radioButtonFemale);
        this.add(labelWNA);
        this.add(wnaCheckBox);
        this.add(scrollableTable);

        // Mengatur ukuran frame
        this.setSize(750, 600);
        // Mengatur tata letak komponen secara manual
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloTable
                HelloTable h = new HelloTable();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

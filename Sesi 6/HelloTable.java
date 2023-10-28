import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

public class HelloTable extends JFrame {
    
    public HelloTable() {
        // Mengatur operasi penutupan jendela ketika tombol close di jendela ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Nama" dan mengatur posisinya
        JLabel labelInput = new JLabel("Nama:");
        labelInput.setBounds(15, 40, 350, 10);

        // Membuat TextField untuk memasukkan nama dan mengatur posisinya dan ukurannya
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Membuat label "Jenis Member" dan mengatur posisinya
        JLabel labelRadio = new JLabel("Jenis Member");
        labelRadio.setBounds(15, 100, 50, 0);

        // Membuat tombol radio untuk pilihan jenis member (Silver, Gold, Platinum)
        JRadioButton radioButton = new JRadioButton("Silver", true);
        radioButton.setBounds(14, 115, 350, 30);

        JRadioButton radioButton2 = new JRadioButton("Gold");
        radioButton2.setBounds(15, 145, 350, 30);

        JRadioButton radioButton3 = new JRadioButton("Platinum");
        radioButton3.setBounds(15, 175, 350, 30);

        // Mengelompokkan tombol radio ke dalam satu grup sehingga hanya satu yang dapat dipilih sekaligus
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton);
        bg.add(radioButton2);
        bg.add(radioButton3);

        // Membuat tombol "Simpan" dan mengatur posisinya
        JButton button = new JButton("Simpan");
        button.setBounds(15, 205, 100, 40);
        
        // Membuat tabel Swing
        javax.swing.JTable table = new JTable();
        // Membuat panel pengguliran untuk tabel
        JScrollPane scrollableTable = new JScrollPane(table);
        // Mengatur posisi dan ukuran panel pengguliran
        scrollableTable.setBounds(15, 250, 350, 200);

        // Membuat model tabel khusus (MyTableModel) yang telah didefinisikan sebelumnya
        MyTableModel tableModel = new MyTableModel();
        // Mengatur model tabel ke tabel Swing
        table.setModel(tableModel);

        // Menambahkan ActionListener ke tombol "Simpan"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan jenis member yang dipilih dari tombol radio
                String jenisMember = "";
                if (radioButton.isSelected()) {
                    jenisMember = radioButton.getText();
                }
                if (radioButton2.isSelected()) {
                    jenisMember = radioButton2.getText();
                }
                if (radioButton3.isSelected()) {
                    jenisMember = radioButton3.getText();
                }

                // Mendapatkan nama dari TextField
                String nama = textField.getText();
                // Menambahkan data (nama dan jenis member) ke model tabel
                tableModel.add(new ArrayList<>(Arrays.asList(nama, jenisMember)));
            }
        });

        // Menambahkan semua komponen ke frame
        this.add(button);
        this.add(textField);
        this.add(labelRadio);
        this.add(radioButton);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(labelInput);
        this.add(scrollableTable);

        // Mengatur ukuran frame
        this.setSize(400, 500);
        // Mengatur tata letak komponen secara manual
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloTable
                HelloTable h = new HelloTable();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

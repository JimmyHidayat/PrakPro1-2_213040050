import java.awt.Color; // Mengimpor kelas Color dari paket java.awt
import java.awt.event.*; // Mengimpor semua kelas dari paket java.awt.event
import javax.swing.*; // Mengimpor semua kelas dari paket javax.swing
import java.util.*; // Mengimpor semua kelas dari paket java.util
import java.awt.Font; // Ini adalah kesalahan sintaksis, seharusnya "import java.awt.Font;" bukan "import java.awt Font;"
import javax.swing.table.DefaultTableModel; // Mengimpor kelas DefaultTableModel dari paket javax.swing.table
import java.io.BufferedWriter; // Mengimpor kelas BufferedWriter dari paket java.io
import java.io.FileWriter; // Mengimpor kelas FileWriter dari paket java.io
import java.io.IOException; // Mengimpor kelas IOException dari paket java.io
import java.io.BufferedWriter; // Ini adalah kesalahan sintaksis, seharusnya "import java.io.BufferedWriter;" bukan "import java.io BufferedWriter;"
import java.io.FileWriter; // Ini adalah kesalahan sintaksis, seharusnya "import java.io.FileWriter;" bukan "import java.io FileWriter;"
import java.io.IOException; // Ini adalah kesalahan sintaksis, seharusnya "import java.io.IOException;" bukan "import java.io.IOException;"

public class BiodataApp extends JFrame {
    public BiodataApp() {
        // Exit
        addWindowListener(new WindowAdapter() { // Menambahkan WindowListener ke jendela
            public void windowClosing(WindowEvent e) { // Mengimplementasikan metode windowClosing saat jendela akan
                                                       // ditutup
                int exit = JOptionPane.showConfirmDialog(null,
                        "Apakah ingin keluar?", "EXIT",
                        JOptionPane.YES_NO_OPTION);

                if (exit == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Menutup aplikasi jika pengguna memilih "Yes"
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Tidak menutup aplikasi jika pengguna
                                                                          // memilih "No"
                }
            }
        });
        JLabel labelInput = new JLabel("Nama :"); // Membuat label dengan teks "Nama :"
        labelInput.setBounds(15, 20, 350, 30); // Menentukan posisi dan ukuran label (x, y, lebar, tinggi)

        JTextField textField = new JTextField(); // Membuat field teks
        textField.setBounds(15, 50, 350, 30); // Menentukan posisi dan ukuran field teks

        JLabel labelInput2 = new JLabel("Nomor HP :"); // Membuat label kedua dengan teks "Nomor HP :"
        labelInput2.setBounds(15, 80, 350, 30); // Menentukan posisi dan ukuran label kedua

        JTextField textField2 = new JTextField(); // Membuat field teks kedua
        textField2.setBounds(15, 110, 350, 30); // Menentukan posisi dan ukuran field teks kedua

        JLabel labelInput3 = new JLabel("Alamat :"); // Membuat label ketiga dengan teks "Alamat :"
        labelInput3.setBounds(15, 140, 350, 30); // Menentukan posisi dan ukuran label ketiga

        JTextField textField3 = new JTextField(); // Membuat field teks ketiga
        textField3.setBounds(15, 170, 350, 30); // Menentukan posisi dan ukuran field teks ketiga

        // Radio button
        JLabel labelRadio = new JLabel("Jenis Kelamin :"); // Membuat label keempat dengan teks "Jenis Kelamin :"
        labelRadio.setBounds(15, 200, 350, 30); // Menentukan posisi dan ukuran label keempat

        JRadioButton radioButton1 = new JRadioButton("Laki-Laki"); // Membuat radio button pertama dengan opsi
                                                                   // "Laki-Laki"
        radioButton1.setBounds(15, 225, 350, 30); // Menentukan posisi dan ukuran radio button pertama

        JRadioButton radioButton2 = new JRadioButton("Perempuan"); // Membuat radio button kedua dengan opsi "Perempuan"
        radioButton2.setBounds(15, 250, 350, 30); // Menentukan posisi dan ukuran radio button kedua
        ButtonGroup bg = new ButtonGroup(); // Membuat grup tombol
        bg.add(radioButton1); // Menambahkan radio button pertama ke grup
        bg.add(radioButton2); // Menambahkan radio button kedua ke grup

        // Membuat JFrame and JTable
        JFrame frame = new JFrame(); // Membuat frame baru
        JTable table = new JTable(); // Membuat tabel baru

        // Membuat table model dan set Column
        Object[] columns = { "Nama", "Nomor HP", "Jenis Kelamin", "Alamat" }; // Mendefinisikan kolom tabel
        DefaultTableModel model = new DefaultTableModel(); // Membuat model tabel baru
        model.setColumnIdentifiers(columns); // Menetapkan kolom untuk model tabel

        table.setModel(model); // Menetapkan model untuk tabel

        // tombol button
        JButton btnAdd = new JButton("Simpan"); // Membuat tombol "Simpan"
        btnAdd.setBounds(15, 310, 100, 25); // Menentukan posisi dan ukuran tombol "Simpan"

        JButton btnDelete = new JButton("Hapus"); // Membuat tombol "Hapus"
        btnDelete.setBounds(260, 310, 100, 25); // Menentukan posisi dan ukuran tombol "Hapus"

        JButton btnUpdate = new JButton("Edit"); // Membuat tombol "Edit"
        btnUpdate.setBounds(140, 310, 100, 25); // Menentukan posisi dan ukuran tombol "Edit"

        JButton btnFile = new JButton("Simpan Ke File"); // Membuat tombol "Simpan Ke File"
        btnFile.setBounds(380, 310, 120, 25); // Menentukan posisi dan ukuran tombol "Simpan Ke File"

        // Untuk membuat JScrollPane
        JScrollPane pane = new JScrollPane(table); // Membuat JScrollPane dan menambahkan tabel ke dalamnya
        pane.setBounds(15, 350, 500, 200); // Menentukan posisi dan ukuran JScrollPane

        frame.setLayout(null); // Mengatur layout frame menjadi null (absolute positioning)
        frame.add(pane); // Menambahkan JScrollPane ke dalam frame
        // memasukan JTextFields ke jframe
        frame.add(textField); // Menambahkan textField ke dalam frame
        frame.add(textField2); // Menambahkan textField2 ke dalam frame
        frame.add(textField3); // Menambahkan textField3 ke dalam frame

        // memasukan Jbutton ke jframe
        frame.add(btnAdd); // Menambahkan btnAdd ke dalam frame
        frame.add(btnDelete); // Menambahkan btnDelete ke dalam frame
        frame.add(btnUpdate); // Menambahkan btnUpdate ke dalam frame
        frame.add(btnFile); // Menambahkan btnFile ke dalam frame

        // membuat array dengan 4 row
        Object[] row = new Object[4]; // Membuat array objek dengan 4 elemen

        // button add
        btnAdd.addActionListener(new ActionListener() { // Menambahkan ActionListener ke tombol "Simpan"

            @Override
            public void actionPerformed(ActionEvent e) { // Metode ini akan dipanggil ketika tombol "Simpan" diklik
                String jenisKelamin = " "; // Variabel untuk menyimpan jenis kelamin yang dipilih
                if (radioButton1.isSelected()) { // Jika radioButton1 dipilih...
                    jenisKelamin = radioButton1.getText(); // ...maka ambil teks dari radioButton1
                }
                if (radioButton2.isSelected()) { // Jika radioButton2 dipilih...
                    jenisKelamin = radioButton2.getText(); // ...maka ambil teks dari radioButton2
                }
                String nama = textField.getText(); // Mengambil teks dari textField (Nama)
                String nomortlp = textField2.getText(); // Mengambil teks dari textField2 (Nomor HP)
                String alamat = textField3.getText(); // Mengambil teks dari textField3 (Alamat)
                if (nama.trim().isEmpty() || nomortlp.trim().isEmpty() || alamat.trim().isEmpty()) {
                    // Jika salah satu field kosong, tampilkan pesan peringatan
                    JOptionPane.showMessageDialog(BiodataApp.this, "Form tidak boleh ada yang kosong!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    int confirmation = JOptionPane.showConfirmDialog(BiodataApp.this, "Masukan Data?", "Konfirmasi",
                            JOptionPane.YES_NO_OPTION);
                    if (confirmation == JOptionPane.YES_OPTION) {
                        row[0] = textField.getText();
                        row[1] = textField2.getText();
                        row[2] = textField3.getText();
                        row[3] = jenisKelamin;
                        model.addRow(row);
                        textField.setText(null);
                        textField2.setText(null);
                        textField3.setText(null);
                    } else {
                        JOptionPane.showMessageDialog(BiodataApp.this, "Anda tidak memasukan data");
                    }
                }
            }
        });
        // button delete
        btnDelete.addActionListener(new ActionListener() { // Menambahkan ActionListener ke tombol "Hapus"

            @Override
            public void actionPerformed(ActionEvent e) { // Metode ini akan dipanggil ketika tombol "Hapus" diklik

                // i = the index of the selected row
                int i = table.getSelectedRow(); // Mengambil indeks baris yang dipilih
                if (i >= 0) { // Jika baris dipilih...
                    // remove a row from jtable
                    model.removeRow(i); // ...maka hapus baris dari tabel
                } else {
                    System.out.println("Delete Error"); // Jika tidak ada baris yang dipilih, cetak "Delete Error"
                }
                textField.setText(null); // Mengatur textField menjadi kosong
                textField2.setText(null); // Mengatur textField2 menjadi kosong
                textField3.setText(null); // Mengatur textField3 menjadi kosong
            }
        });

        // Fungsi selected row data
        table.addMouseListener(new MouseAdapter() { // Menambahkan MouseAdapter ke tabel

            @Override
            public void mouseClicked(MouseEvent e) { // Metode ini akan dipanggil ketika tabel diklik

                // i = the index of the selected row
                int i = table.getSelectedRow(); // Mengambil indeks baris yang dipilih

                textField.setText(model.getValueAt(i, 0).toString()); // Mengatur teks textField menjadi nilai pada
                                                                      // kolom 0 dari baris yang dipilih
                textField2.setText(model.getValueAt(i, 1).toString()); // Mengatur teks textField2 menjadi nilai pada
                                                                       // kolom 1 dari baris yang dipilih
                textField3.setText(model.getValueAt(i, 2).toString()); // Mengatur teks textField3 menjadi nilai pada
                                                                       // kolom 2 dari baris yang dipilih
            }
        });

        // button Update
        btnUpdate.addActionListener(new ActionListener() { // Menambahkan ActionListener ke tombol "Edit"

            @Override
            public void actionPerformed(ActionEvent e) { // Metode ini akan dipanggil ketika tombol "Edit" diklik

                // i = the index of the selected row
                int i = table.getSelectedRow(); // Mengambil indeks baris yang dipilih

                if (i >= 0) {
                    model.setValueAt(textField.getText(), i, 0); // Mengatur nilai pada kolom 0 dari baris yang dipilih
                                                                 // menjadi teks dari textField
                    model.setValueAt(textField2.getText(), i, 1); // Mengatur nilai pada kolom 1 dari baris yang dipilih
                                                                  // menjadi teks dari textField2
                    model.setValueAt(textField3.getText(), i, 2); // Mengatur nilai pada kolom 2 dari baris yang dipilih
                                                                  // menjadi teks dari textField3
                } else {
                    System.out.println("Update Error"); // Jika tidak ada baris yang dipilih, cetak "Update Error"
                }
            }
        });

        // Membuat button untuk menyimpan data ke file
        btnFile.addActionListener(new ActionListener() { // Menambahkan ActionListener ke tombol "Simpan Ke File"

            @Override
            public void actionPerformed(ActionEvent e) { // Metode ini akan dipanggil ketika tombol "Simpan Ke File"
                                                         // diklik
                JFileChooser fileChooser = new JFileChooser(); // Membuat objek JFileChooser
                int userSelection = fileChooser.showSaveDialog(BiodataApp.this); // Menampilkan dialog penyimpanan file

                if (userSelection == JFileChooser.APPROVE_OPTION) { // Jika pengguna memilih untuk menyimpan file...
                    try {
                        String filePath = fileChooser.getSelectedFile().getAbsolutePath(); // Mendapatkan path file yang
                                                                                           // dipilih
                        FileWriter fileWriter = new FileWriter(filePath); // Membuat FileWriter dengan path file yang
                                                                          // dipilih
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Membuat BufferedWriter dengan
                                                                                        // FileWriter

                        for (int i = 0; i < model.getRowCount(); i++) { // Looping melalui setiap baris pada model tabel
                            String nama = model.getValueAt(i, 0).toString(); // Mengambil nilai pada kolom 0 (Nama)
                            String nomorTlp = model.getValueAt(i, 1).toString(); // Mengambil nilai pada kolom 1 (Nomor
                                                                                 // HP)
                            String alamat = model.getValueAt(i, 2).toString(); // Mengambil nilai pada kolom 2 (Alamat)
                            String jenisKelamin = model.getValueAt(i, 3).toString(); // Mengambil nilai pada kolom 3
                                                                                     // (Jenis Kelamin)

                            String data = nama + "," + nomorTlp + "," + alamat + "," + jenisKelamin; // Membuat string
                                                                                                     // data dengan
                                                                                                     // nilai-nilai
                                                                                                     // tersebut
                            bufferedWriter.write(data); // Menulis data ke file
                            bufferedWriter.newLine(); // Menulis baris baru ke file
                        }

                        bufferedWriter.close(); // Menutup BufferedWriter
                        fileWriter.close(); // Menutup FileWriter

                        JOptionPane.showMessageDialog(BiodataApp.this, "Data berhasil disimpan ke file.", "Info",
                                JOptionPane.INFORMATION_MESSAGE); // Menampilkan pesan bahwa data berhasil disimpan ke
                                                                  // file
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(BiodataApp.this, "Terjadi kesalahan saat menyimpan data ke file.",
                                "Error", JOptionPane.ERROR_MESSAGE); // Menampilkan pesan kesalahan jika terjadi
                                                                     // IOException
                    }
                }
            }
        });

        this.add(textField); // Menambahkan textField ke dalam frame ini
        this.add(textField2); // Menambahkan textField2 ke dalam frame ini
        this.add(textField3); // Menambahkan textField3 ke dalam frame ini
        this.add(labelRadio); // Menambahkan labelRadio ke dalam frame ini
        this.add(radioButton1); // Menambahkan radioButton1 ke dalam frame ini
        this.add(radioButton2); // Menambahkan radioButton2 ke dalam frame ini
        this.add(labelInput); // Menambahkan labelInput ke dalam frame ini
        this.add(labelInput2); // Menambahkan labelInput2 ke dalam frame ini
        this.add(labelInput3); // Menambahkan labelInput3 ke dalam frame ini
        this.add(btnAdd); // Menambahkan btnAdd ke dalam frame ini
        this.add(btnDelete); // Menambahkan btnDelete ke dalam frame ini
        this.add(btnUpdate); // Menambahkan btnUpdate ke dalam frame ini
        this.add(btnFile); // Menambahkan btnFile ke dalam frame ini
        this.add(pane); // Menambahkan pane (JScrollPane) ke dalam frame ini

        this.setSize(600, 700); // Mengatur ukuran frame menjadi 600x700 piksel
        this.setLayout(null); // Mengatur layout manager menjadi null (absolute positioning)
    }

public static void main(String[] args) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() { 
        @Override
        public void run() {

            BiodataApp b = new BiodataApp(); 
            b.setVisible(true);
        }
    });
}
}
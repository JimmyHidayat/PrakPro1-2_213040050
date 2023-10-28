import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormBiodata extends JFrame {

    public FormBiodata() {
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Nama : "
        JLabel labelNama = new JLabel("Nama : ");
        labelNama.setBounds(15, 10, 350, 10);  // Pindahkan ke atas TextField

        // Membuat TextField untuk input nama
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 30, 350, 30);

        // Membuat label "Nomor HP : "
        JLabel labelNomorHP = new JLabel("Nomor HP : ");
        labelNomorHP.setBounds(15, 75, 350, 10);  // Pindahkan ke atas TextField

        // Membuat TextField untuk input nomor HP
        JTextField textFieldNomorHP = new JTextField();
        textFieldNomorHP.setBounds(15, 95, 350, 30);

        // Membuat CheckBox "Warga Negara Asing"
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 130, 350, 30);

        // Membuat label "Jenis Kelamin"
        JLabel labelRadio = new JLabel("Jenis Kelamin");
        labelRadio.setBounds(15, 160, 350, 10);

        // Membuat RadioButton "Laki-Laki" (terpilih secara default)
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
        radioButton1.setBounds(15, 180, 350, 30);

        // Membuat RadioButton "Perempuan"
        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        radioButton2.setBounds(15, 210, 350, 30);

        // ... (Kode lainnya seperti radio button dan checkbox)

        JLabel headerLabel = new JLabel("Layout in action: GridBagLayout", JLabel.CENTER);

        // Membuat panel kontrol
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // Membuat panel utama dengan latar belakang berwarna gelap
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        // Menggunakan layout GridBagLayout untuk panel utama
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Menambahkan label "Nama" ke panel dengan posisi (0, 0)
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelNama, gbc);

        // Menambahkan TextField nama ke panel dengan posisi (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(textFieldNama, gbc);

        // Menambahkan label "Nomor HP" ke panel dengan posisi (0, 1)
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelNomorHP, gbc);

        // Menambahkan TextField nomor HP ke panel dengan posisi (1, 1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textFieldNomorHP, gbc);

        // Menambahkan tombol ke panel dengan posisi (0, 2) dan lebar 2 sel
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(new JButton("Button 5"), gbc);

        // ... (Tambahkan komponen lainnya ke panel)

        // Menambahkan panel utama ke panel kontrol
        controlPanel.add(panel);

        // Mengatur layout frame menjadi GridLayout dengan 2 baris dan 1 kolom
        this.setLayout(new GridLayout(2, 1));

        // Menambahkan label judul ke frame
        this.add(headerLabel);

        // Menambahkan panel kontrol ke frame
        this.add(controlPanel);

        // Mengatur ukuran frame berdasarkan komponen di dalamnya
        this.pack();
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam runnable thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FormBiodata form = new FormBiodata();
                form.setVisible(true); // Menampilkan frame
            }
        });
    }
}

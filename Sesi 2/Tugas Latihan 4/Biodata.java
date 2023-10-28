import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Biodata extends JFrame {
    private JTextArea textarea;

    public Biodata() {
        // Membuat frame
        setTitle("Aplikasi Biodata Teman");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel untuk input
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        // Label dan textfield untuk nama
        JLabel nameLabel = new JLabel("Nama:");
        JTextField nameField = new JTextField();
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);

        // Label dan textfield untuk nomor telepon
        JLabel phoneLabel = new JLabel("Nomor Telepon:");
        JTextField phoneField = new JTextField();
        inputPanel.add(phoneLabel);
        inputPanel.add(phoneField);

        // Tombol untuk menyimpan biodata
        JButton saveButton = new JButton("Simpan");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan data dari textfield
                String name = nameField.getText();
                String phone = phoneField.getText();

                // Menambahkan biodata ke textarea dengan pemisah garis
                String data = name + " - " + phone + "\n";
                textarea.append(data);

                // Mengosongkan textfield setelah disimpan
                nameField.setText("");
                phoneField.setText("");
            }
        });
        inputPanel.add(saveButton);

        // Tombol untuk menghapus biodata terpilih
        JButton deleteButton = new JButton("Hapus");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan indeks awal dan akhir dari teks terpilih
                int start = textarea.getSelectionStart();
                int end = textarea.getSelectionEnd();

                if (start != end) {
                    // Hapus teks terpilih dari textarea
                    textarea.replaceRange("", start, end);
                }
            }
        });
        inputPanel.add(deleteButton);

        // Membuat textarea untuk menampilkan biodata
        textarea = new JTextArea();

        // Menambahkan panel input dan textarea ke frame
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(textarea), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Biodata app = new Biodata();
                app.setVisible(true);
            }
        });
    }
}

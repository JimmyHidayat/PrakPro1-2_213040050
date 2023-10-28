import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloScrollPane extends JFrame {

    public HelloScrollPane() {
        // Mengatur operasi penutupan jendela ketika tombol close di jendela ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Input Nama" dan mengatur posisinya
        JLabel labeinput = new JLabel("Input Nama :");
        labeinput.setBounds(130, 40, 100, 10);

        // Membuat TextField untuk memasukkan nama dan mengatur posisi dan ukurannya
        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        // Membuat tombol "Klik" dan mengatur posisinya
        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        // Membuat JTextArea untuk menampilkan output dan mengatur posisi serta ukurannya
        JTextArea txtoutput = new JTextArea("");
        JScrollPane scrollabelTextArea = new JScrollPane(txtoutput);
        scrollabelTextArea.setBounds(130, 150, 100, 100);
        // Mengatur kebijakan scrollbar horizontal dan vertikal
        scrollabelTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollabelTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Menambahkan ActionListener ke tombol "Klik"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mendapatkan nama dari TextField
                String nama = textField.getText();
                // Menambahkan teks ke JTextArea
                txtoutput.append("Hello " + nama + "\n");
                // Mengosongkan TextField
                textField.setText("");
            }
        });

        // Menambahkan komponen-komponen ke frame
        this.add(button);
        this.add(textField);
        this.add(labeinput);
        this.add(scrollabelTextArea);

        // Mengatur ukuran frame
        this.setSize(400, 500);
        // Mengatur tata letak komponen secara manual
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloScrollPane
                HelloScrollPane h = new HelloScrollPane();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

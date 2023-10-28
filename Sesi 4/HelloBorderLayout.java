import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloBorderLayout extends JFrame {

    public HelloBorderLayout() {
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Apakah ibukota Indonesia" yang akan ditempatkan di bagian atas
        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia");
        
        // Membuat label "Jawab pertanyaan di atas" yang akan ditempatkan di bagian bawah
        JLabel labelHasil = new JLabel("Jawab pertanyaan di atas");

        // Membuat tombol-tombol yang akan ditempatkan di berbagai bagian BorderLayout
        JButton buttonA = new JButton("Jakarta");
        JButton buttonB = new JButton("Bandung");
        JButton buttonC = new JButton("Surabaya");

        // Menambahkan ActionListener ke tombol "Jakarta"
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar.");
            }
        });

        // Menambahkan ActionListener ke tombol "Bandung"
        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah.");
            }
        });

        // Menambahkan ActionListener ke tombol "Surabaya"
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });

        // Menambahkan komponen-komponen ke dalam jendela menggunakan BorderLayout
        this.add(labelPertanyaan, BorderLayout.NORTH); // Label pertanyaan di bagian atas
        this.add(labelHasil, BorderLayout.SOUTH); // Label hasil di bagian bawah
        this.add(buttonA, BorderLayout.WEST); // Tombol "Jakarta" di sebelah kiri
        this.add(buttonB, BorderLayout.CENTER); // Tombol "Bandung" di tengah
        this.add(buttonC, BorderLayout.EAST); // Tombol "Surabaya" di sebelah kanan

        // Mengatur ukuran jendela
        this.setSize(400, 200);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing dalam thread terpisah
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloBorderLayout dan menampilkannya
                HelloBorderLayout h = new HelloBorderLayout();
                h.setVisible(true);
            }
        });
    }
}

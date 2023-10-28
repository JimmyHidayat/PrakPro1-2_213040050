import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloMessageDialog extends JFrame {

    public HelloMessageDialog() {
        // Mengatur operasi penutupan jendela ketika tombol close ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout untuk frame menggunakan FlowLayout
        this.setLayout(new FlowLayout());

        // Membuat tombol dengan teks "Klik"
        JButton button = new JButton("Klik");
        // Mengatur posisi dan ukuran tombol
        button.setBounds(130, 100, 100, 40);

        // Menambahkan ActionListener ke tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan dialog pesan pop-up
                JOptionPane.showMessageDialog(HelloMessageDialog.this,
                        "Halo, Selamat Datang di Praktikum Pemrograman II.");
            }
        });

        // Menambahkan tombol ke frame
        this.add(button);

        // Mengatur ukuran frame
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloMessageDialog
                HelloMessageDialog h = new HelloMessageDialog();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloInputDialog extends JFrame {

    public HelloInputDialog() {
        // Mengatur operasi penutupan jendela ketika tombol close di jendela ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout untuk frame menggunakan FlowLayout
        this.setLayout(new FlowLayout());

        // Membuat tombol "Input"
        JButton button = new JButton("Input");

        // Menambahkan ActionListener ke tombol "Input"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan dialog input teks dengan pesan "Inputkan Nama anda"
                String name = JOptionPane.showInputDialog(HelloInputDialog.this, "Inputkan Nama anda");
                
                // Memeriksa apakah pengguna mengklik "OK" atau menutup dialog
                if (name != null) { // Check if the user clicked "OK" or closed the dialog
                    // Menampilkan pesan pop-up yang menyapa pengguna dengan nama yang dimasukkan
                    JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello, " + name);
                }
            }
        });

        // Menambahkan tombol "Input" ke frame
        this.add(button);

        // Mengatur ukuran frame
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloInputDialog
                HelloInputDialog h = new HelloInputDialog();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloConfirmDialog extends JFrame {

    public HelloConfirmDialog() {
        // Mengatur operasi penutupan jendela ketika tombol close ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout untuk frame menggunakan FlowLayout
        this.setLayout(new FlowLayout());

        // Membuat tombol "EXIT" dan mengatur posisi dan ukurannya
        JButton button = new JButton("EXIT");
        button.setBounds(130, 100, 100, 40);

        // Menambahkan ActionListener ke tombol "EXIT"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan dialog konfirmasi
                int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this,
                        "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    // Keluar dari aplikasi jika user memilih "Yes"
                    System.exit(0);
                } else if (confirmation == JOptionPane.NO_OPTION) {
                    // Menampilkan pesan jika user memilih "No"
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tombol NO");
                }
            }
        });

        // Menambahkan tombol "EXIT" ke frame
        this.add(button);

        // Mengatur ukuran frame
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloConfirmDialog
                HelloConfirmDialog h = new HelloConfirmDialog();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

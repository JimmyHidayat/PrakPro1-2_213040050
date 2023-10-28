import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HelloShowMessageDialog extends JFrame {
    public HelloShowMessageDialog() {
        // Mengatur operasi penutupan jendela ketika tombol close ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur layout untuk frame menggunakan FlowLayout
        this.setLayout(new FlowLayout());

        // Membuat tombol EXIT
        JButton button = new JButton("EXIT");
        JButton buttonError = new JButton("terjadi kesalahan code");
        JButton buttonInfo = new JButton("Hari Ini Libur");
        JButton buttonWarn = new JButton("Password anda salah!");
        JButton buttonPlain = new JButton("Lihat ini");

        // Menambahkan ActionListener ke tombol "EXIT"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan dialog konfirmasi
                int confirmation = JOptionPane.showConfirmDialog(HelloShowMessageDialog.this,
                        "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (confirmation == JOptionPane.YES_OPTION) {
                    // Keluar dari aplikasi jika user memilih "Yes"
                    System.exit(0);
                } else if (confirmation == JOptionPane.NO_OPTION) {
                    // Menampilkan pesan informasi jika user memilih "No"
                    JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Anda menekan tombol NO", "Informasi",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Menambahkan ActionListener ke tombol "terjadi kesalahan code"
        buttonError.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan pesan kesalahan dengan ikon kesalahan
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "terjadi kesalahan code", "Kesalahan",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Menambahkan ActionListener ke tombol "Hari Ini Libur"
        buttonInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan pesan informasi dengan ikon informasi
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Hari Ini Libur", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Menambahkan ActionListener ke tombol "Password anda salah!"
        buttonWarn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan pesan peringatan dengan ikon peringatan
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Password anda salah!", "Peringatan",
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        // Menambahkan ActionListener ke tombol "Lihat ini"
        buttonPlain.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan pesan tanpa ikon khusus (plain message)
                JOptionPane.showMessageDialog(HelloShowMessageDialog.this, "Lihat ini", "Pesan",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });

        // Menambahkan tombol-tombol ke frame
        this.add(button);
        this.add(buttonError);
        this.add(buttonInfo);
        this.add(buttonWarn);
        this.add(buttonPlain);

        // Mengatur ukuran frame
        this.setSize(400, 200);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam event dispatch thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloShowMessageDialog
                HelloShowMessageDialog h = new HelloShowMessageDialog();
                // Menampilkan frame
                h.setVisible(true);
            }
        });
    }
}

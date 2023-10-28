import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloGridBagLayout extends JFrame {

    public HelloGridBagLayout() {
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label judul dengan teks "Layout in action: GridBagLayout"
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

        // Menambahkan tombol-tombol ke panel dengan GridBagLayout
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Button 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Button 4"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;  // Tombol Button 5 akan mengambil 2 sel lebar
        panel.add(new JButton("Button 5"), gbc);

        // Menambahkan panel utama ke panel kontrol
        controlPanel.add(panel);

        // Mengatur tata letak frame menjadi GridLayout dengan 2 baris dan 1 kolom
        this.setLayout(new GridLayout(2, 1));

        // Menambahkan label judul ke frame
        this.add(headerLabel);

        // Menambahkan panel kontrol ke frame
        this.add(controlPanel);

        this.pack();  // Mengatur ukuran frame berdasarkan komponen
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing di dalam runnable thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloGridBagLayout h = new HelloGridBagLayout();
                h.setVisible(true); // Menampilkan jendela
            }
        });
    }
}

import java.awt.event.*;
import javax.swing.*;

public class HelloRadioButton extends JFrame {

    public HelloRadioButton () {
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Nama :" dan mengatur posisinya
        JLabel labelInput = new JLabel ("Nama :");
        labelInput.setBounds(15, 40, 350, 10);

        // Membuat TextField untuk memasukkan nama dan mengatur posisinya
        JTextField textField = new JTextField ();
        textField.setBounds(15, 60, 350, 30);

        // Membuat label "Jenis Member" dan mengatur posisinya
        JLabel labelRadio = new JLabel ("Jenis Member");
        labelRadio.setBounds(15,100,350,10);

        // Membuat RadioButton "Silver" dan mengatur posisinya
        JRadioButton radioButton = new JRadioButton  ("Silver");
        radioButton.setBounds(15,115,350,30);

        // Membuat RadioButton "Gold" dan mengatur posisinya
        JRadioButton radioButton2 = new JRadioButton ("Gold");
        radioButton2.setBounds(15,145,350,30);

        // Membuat RadioButton "Platinum" dan mengatur posisinya
        JRadioButton radioButton3 = new JRadioButton ("Platinum");
        radioButton3.setBounds(15,175,350,30);

        // Membuat grup RadioButton untuk memastikan hanya satu yang dapat dipilih
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton);
        bg.add(radioButton2);
        bg.add(radioButton3);

        // Membuat tombol "Simpan" dan mengatur posisinya
        JButton button = new JButton ("Simpan");
        button.setBounds(15, 205, 100, 40);

        // Membuat area teks untuk menampilkan output dan mengatur posisinya
        JTextArea txtOutput = new JTextArea ("");
        txtOutput.setBounds(15, 250, 350, 100);

        // Menambahkan ActionListener ke tombol "Simpan" untuk menangani klik tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jenisMember = "";
                if (radioButton.isSelected()) {
                    jenisMember = radioButton.getText();
                }
                if (radioButton2.isSelected()) {
                    jenisMember = radioButton2.getText();
                }
                if (radioButton3.isSelected()) {
                    jenisMember = radioButton3.getText();
                }

                String nama = textField.getText();
                txtOutput.append("Hello " + nama+"\n");
                txtOutput.append("Anda adalah member "+jenisMember+"\n");
                textField.setText("");
            }
        });

        // Menambahkan semua komponen ke dalam jendela
        this.add(button);
        this.add(textField);
        this.add(labelRadio);
        this.add(radioButton);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(labelInput);
        this.add(txtOutput);

        // Mengatur ukuran jendela
        this.setSize(400, 500);
        
        // Mengatur tata letak menjadi null untuk mengizinkan penempatan manual komponen
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing dalam thread terpisah
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloRadioButton dan menampilkannya
                HelloRadioButton h = new HelloRadioButton();
                h.setVisible(true);
            }
        });
    }
}

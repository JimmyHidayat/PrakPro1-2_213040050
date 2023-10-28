import java.awt.event.*;
import javax.swing.*;

public class HelloCheckBox extends JFrame {

    private boolean checkBoxSelected;

    public HelloCheckBox() {
        // Inisialisasi variabel checkBoxSelected menjadi false
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label "Input Nama"
        JLabel labelInput = new JLabel("Input Nama");
        labelInput.setBounds(15, 40, 350, 10);

        // Membuat TextField untuk memasukkan nama
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        // Membuat CheckBox "Saya Menyetujui syarat dan ketentuan yang berlaku"
        JCheckBox checkBox = new JCheckBox("Saya Menyetujui syarat dan ketentuan yang berlaku");
        checkBox.setBounds(15, 100, 350, 30);

        // Membuat tombol "Simpan"
        JButton button = new JButton("Simpan");
        button.setBounds(15, 150, 100, 40);

        // Membuat area teks untuk menampilkan output
        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 200, 350, 100);

        // Menambahkan listener ke CheckBox untuk mendeteksi perubahan status
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                checkBoxSelected = e.getStateChange() == 1; // 1 artinya CheckBox dipilih
            }
        });

        // Menambahkan ActionListener ke tombol "Simpan"
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBoxSelected) {
                    String nama = textField.getText();
                    txtOutput.append("Hello " + nama + "\n");
                } else {
                    txtOutput.append("Anda tidak mencentang kotak persetujuan\n");
                }
            }
        });

        // Menambahkan komponen-komponen ke dalam jendela
        this.add(button);
        this.add(textField);
        this.add(checkBox);
        this.add(labelInput);
        this.add(txtOutput);

        // Mengatur ukuran dan tata letak jendela
        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        // Memulai aplikasi Swing dalam thread terpisah
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloCheckBox h = new HelloCheckBox();
                h.setVisible(true); // Menampilkan jendela
            }
        });
    }
}

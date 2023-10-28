// Mengimpor kelas-kelas yang diperlukan
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

// Mendefinisikan kelas BiodataTeman yang merupakan turunan dari JFrame
public class BiodataTeman extends JFrame {
    
    // Konstruktor untuk kelas BiodataTeman
    public BiodataTeman(){
        // Mengatur operasi default ketika jendela ditutup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat label "Nama : "
        JLabel labelInput = new JLabel("Nama : ");
        labelInput.setBounds(15,40,350,10);
        
        // Membuat TextField untuk input nama
        JTextField textField = new JTextField();
        textField.setBounds(15,60, 350,30);
        
        // Membuat label "Nomor HP : "
        JLabel labelInput1 = new JLabel("Nomor HP : ");
        labelInput1.setBounds(15,95,350,10);
        
        // Membuat TextField untuk input nomor HP
        JTextField textField1 = new JTextField();
        textField1.setBounds(15,110, 350,30);
        
        // Membuat label "Jenis Kelamin"
        JLabel labelRadio = new JLabel("Jenis Kelamin");
        labelRadio.setBounds(15,130,350,10);
    
        // Membuat RadioButton "Laki-Laki" (terpilih secara default)
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
        radioButton1.setBounds(15,145,350,30);
        
        // Membuat RadioButton "Perempuan"
        JRadioButton radioButton2 = new JRadioButton("Perempuan" );
        radioButton2.setBounds(15,175,350,30);

        // Membuat CheckBox "Warga Negara Asing"
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15,205,350,30);
        
        // Membuat grup untuk RadioButton agar hanya satu yang bisa dipilih
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        
        // Membuat tombol "Simpan"
        JButton button = new JButton("Simpan");
        button.setBounds(15,240,100,40);
        
        // Membuat area teks untuk menampilkan hasil
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(15,290,350, 200);
        
        // Menambahkan ActionListener ke tombol "Simpan"
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                // Mengumpulkan data dari elemen-elemen UI
                String jenisKelamin = "";
                if(radioButton1.isSelected()){
                    jenisKelamin = radioButton1.getText();
                }if(radioButton2.isSelected()){
                    jenisKelamin = radioButton2.getText();
                }
                
                String nama = textField.getText();
                String noHp = textField1.getText();
                String wnaStatus = checkBox.isSelected() ? "Ya" : "Bukan";
                
                // Menampilkan data di dalam area teks
                txtOutput.append("Nama : "+nama+"\n");
                txtOutput.append("Nomor HP : "+noHp+"\n");
                txtOutput.append("Jenis Kelamin : "+jenisKelamin+"\n");
                txtOutput.append("WNA : " + wnaStatus + "\n");
                txtOutput.append("==============");
                textField.setText("");
            }
        });
        
        // Menambahkan komponen-komponen ke dalam jendela
        this.add(button);
        this.add(textField);
        this.add(textField1);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(labelInput);
        this.add(labelInput1);
        this.add(txtOutput);
        
        // Mengatur ukuran dan tata letak jendela
        this.setSize(400,800);
        this.setLayout(null);
    }
    
    // Metode utama untuk menjalankan program
    public static void main(String [] args){
        // Memulai aplikasi Swing dalam thread terpisah
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run(){
                BiodataTeman h = new BiodataTeman();
                h.setVisible(true); // Menampilkan jendela
            }
        });
    }
}

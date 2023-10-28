import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FromBio extends JFrame {
    public FromBio(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat label judul
        JLabel headerLabel = new JLabel("From Biodata", JLabel.CENTER);

        // Membuat panel kontrol
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // Membuat label-label dan komponen input
        JLabel labelInputNama = new JLabel("Nama:");
        JLabel labelInputJenisKelamin = new JLabel("Jenis Kelamin:");
        JLabel labelInputNoHP = new JLabel("No HP:");
        JTextField textFieldNama = new JTextField();
        JTextField textFieldNoHP = new JTextField();
        JCheckBox checkBoxWNA = new JCheckBox("Warga Negara Asing");
        JTextArea txtOutput = new JTextArea();

        // Membuat radio button untuk jenis kelamin
        JRadioButton lakiLakiRadioButton = new JRadioButton("Laki-Laki");
        JRadioButton perempuanRadioButton = new JRadioButton("Perempuan");

        // Mengelompokkan radio button jenis kelamin
        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(lakiLakiRadioButton);
        genderButtonGroup.add(perempuanRadioButton);

        // Membuat tombol Simpan
        JButton buttonSimpan = new JButton("Simpan");

        // Membuat panel untuk menata elemen dengan GridBagLayout
        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        // Menambahkan komponen ke panel menggunakan GridBagLayout
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 20;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(labelInputNama, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(labelInputJenisKelamin, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(textFieldNama, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(lakiLakiRadioButton, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(labelInputNoHP, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(perempuanRadioButton, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        panel.add(textFieldNoHP, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(checkBoxWNA, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(20,0,0,0);
        gbc.gridwidth = 2;
        panel.add(buttonSimpan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.ipady = 100;
        gbc.ipadx = 100;
        gbc.insets = new Insets(20,0,0,0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(txtOutput, gbc);

        // Menambahkan panel kontrol ke frame
        controlPanel.add(panel);

        // Mengatur tata letak frame menjadi GridLayout dengan 2 baris dan 1 kolom
        this.setLayout(new GridLayout(2,1));

        // Menambahkan label judul ke frame
        this.add(headerLabel);

        // Menambahkan panel kontrol ke frame
        this.add(controlPanel);

        this.setSize(400, 400);

        // Menambahkan ActionListener untuk tombol Simpan
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil data dari komponen input
                String jenisKelamin = "";
                if (lakiLakiRadioButton.isSelected()) {
                    jenisKelamin = lakiLakiRadioButton.getText();
                }
                if(perempuanRadioButton.isSelected()){
                    jenisKelamin = perempuanRadioButton.getText();
                }

                String nama = textFieldNama.getText();
                String noHP = textFieldNoHP.getText();
                String wna = checkBoxWNA.isSelected() ? "Ya" : "Bukan";

                // Menampilkan data ke komponen output (txtOutput)
                txtOutput.append("Nama: "+nama+"\n");
                txtOutput.append("Jenis Kelamin: "+jenisKelamin+"\n");
                txtOutput.append("No HP: "+noHP+"\n");
                txtOutput.append("WNA: "+wna+"\n");
                txtOutput.append("====================================\n");
            }
        });
    }

    public  static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FromBio h = new FromBio();
                h.setVisible(true);
            }
        });
    }
}

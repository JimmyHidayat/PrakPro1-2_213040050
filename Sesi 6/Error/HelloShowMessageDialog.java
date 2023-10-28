import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HelloShowMessageDialog extends JFrame  {
       public HelloShowMessageDialog () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout (new FlowLayout());

        JButton button = new JButton ("EXIT");
        button.setBounds (130,100,100,40);
        JButton buttonerror = new JButton ("terjadi kesalahan code");
        button.setBounds (150,100,100,40);
        JButton buttoninfor = new JButton ("Hari Ini Libur");
        button.setBounds (170,100,100,40);
        JButton buttonwarn = new JButton ("Password anda salah!");
        button.setBounds (190,100,100,40);
        JButton buttonplain = new JButton ("Lihat ini");
        button.setBounds (210,100,100,40);

        button.addActionListener (new ActionListener() {
            public void actionPerformed (ActionEvent  e) {
                int confirmation = JOptionPane.showConfirmDialog(HelloShowMessageDialog.this, "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi",JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }else if (confirmation == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(HelloShowMessageDialog.this,"Anda menekan tombol NO");
                }
                
    }
});
this.add(button);
this.add(buttonerror);
this.add(buttoninfor);
this.add(buttonwarn);
this.add(buttonplain);
this.setSize(200, 200);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloShowMessageDialog h = new HelloShowMessageDialog();
                h.setVisible(true);
            }
        });
    }
    }
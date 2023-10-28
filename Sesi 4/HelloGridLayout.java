import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloGridLayout extends JFrame implements ActionListener {

    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;

    private JButton[] buttons; // Membuat array untuk tombol
    private boolean gameOver; // Menyimpan status permainan (apakah sudah selesai atau belum)

    public HelloGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur operasi default ketika tombol close di klik

        gameOver = false; // Inisialisasi status permainan (belum selesai)

        // Membuat tombol-tombol dan mengosongkan teksnya
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");

        // Menyimpan tombol-tombol dalam array
        buttons = new JButton[9];
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        // Menambahkan action listener ke setiap tombol dan menambahkannya ke frame
        for (JButton button : buttons) {
            button.addActionListener(this);
            this.add(button);
        }

        this.setLayout(new GridLayout(3, 3)); // Mengatur layout frame menjadi GridLayout dengan ukuran 3x3
        this.setSize(300, 300); // Mengatur ukuran frame menjadi 300x300 piksel
    }

    public void actionPerformed(ActionEvent e) {
        if (!gameOver) { // Memeriksa apakah permainan masih berjalan
            JButton button = (JButton) e.getSource(); // Mendapatkan tombol yang menghasilkan event
            if (button.getText().isEmpty()) { // Memeriksa apakah teks tombol kosong
                button.setText("O"); // Mengubah teks tombol menjadi "O"
                checkWinner("O"); // Memeriksa apakah pemain "O" telah memenangkan permainan
                if (!gameOver) { // Jika permainan belum selesai
                    for (int i = 0; i < buttons.length; i++) {
                        if (buttons[i] == button) {
                            continue; // Melewati tombol saat ini dalam loop
                        }
                        if (buttons[i].getText().isEmpty()) { // Memeriksa apakah teks tombol lainnya kosong
                            buttons[i].setText("X"); // Mengubah teks tombol lainnya menjadi "X"
                            checkWinner("X"); // Memeriksa apakah pemain "X" telah memenangkan permainan
                            break; // Keluar dari loop setelah mengatur satu tombol "X"
                        }
                    }
                }
            }
        }
    }

    private void checkWinner(String player) {
        // Daftar kombinasi pemenang untuk permainan Tic-Tac-Toe (3x3)
        int[][] winningCombinations = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Baris
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Kolom
            {0, 4, 8}, {2, 4, 6} // Diagonal
        };

        for (int[] combo : winningCombinations) {
            int a = combo[0];
            int b = combo[1];
            int c = combo[2];

            // Memeriksa apakah pemain "player" telah memenangkan permainan dengan kombinasi tertentu
            if (buttons[a].getText().equals(player)
                    && buttons[b].getText().equals(player)
                    && buttons[c].getText().equals(player)) {
                buttons[a].setForeground(Color.RED); // Mengubah warna tombol yang menang menjadi merah
                buttons[b].setForeground(Color.RED);
                buttons[c].setForeground(Color.RED);
                gameOver = true; // Menandakan bahwa permainan telah selesai
                break; // Keluar dari loop setelah menemukan pemenang
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HelloGridLayout h = new HelloGridLayout();
            h.setVisible(true); // Menampilkan frame permainan
        });
    }
}

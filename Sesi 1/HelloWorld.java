import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld  extends JFrame{
    private JLabel label;

    public HelloWorld() {
        label = new JLabel();
        label.setText("Hallo Dunia");

        add(label);
        setTitle("Program Pertama");

        setSize(600, 300);
    }

    public static void main(String[] args) {
        JFrame form = new HelloWorld();
        form.setVisible(true);
    }

}
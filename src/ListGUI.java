import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGUI extends JFrame implements ActionListener {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ListGUI frame = new ListGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ListGUI() {
        JFrame frame = new JFrame("Smartie");
        frame.setSize(900, 900);
        frame.setVisible(true);

        JLabel textLabel = new JLabel("Test");
        textLabel.setText("Accounts Manager");
        textLabel.setLayout(null);

        frame.add(textLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

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
        Font f1 = new Font("Arial", Font.BOLD, 24);

        JFrame frame = new JFrame("Account Manager");
        frame.setSize(900, 900);

        JLabel title = new JLabel("Account Manager");
        title.setFont(f1);

        frame.add(title);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

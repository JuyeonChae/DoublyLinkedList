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

//        JLabel ID = new JLabel("ID");
//        JTextField IDField = new JTextField(null, 20);
//
//        JLabel password = new JLabel("Password");
//        JTextField passwordField = new JTextField(null, 20);
//
//        JLabel website = new JLabel("website");
//        JTextField websiteField = new JTextField(null, 20);

        frame.add(title, new FlowLayout());
        frame.setLayout(new FlowLayout());

//        frame.add(ID);
//        frame.add(IDField);

        frame.setVisible(true);
    }

    public void textFields() {
        JPanel textPanel = new JPanel();
        textPanel.setSize(900, 24);

        JLabel ID = new JLabel("ID");
        JTextField IDField = new JTextField(null, 20);

        JLabel password = new JLabel("Password");
        JTextField passwordField = new JTextField(null, 20);

        JLabel website = new JLabel("website");
        JTextField websiteField = new JTextField(null, 20);

        frame.add(ID);
        frame.add(IDField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

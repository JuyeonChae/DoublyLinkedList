import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListGUI extends JFrame implements ActionListener {
    private JFrame frame;

    private JPanel textPanel;
    private JPanel tablePanel;
    private JPanel deletePanel;

    private JLabel title;
    private JLabel ID;
    private JLabel password;
    private JLabel website;

    private JTextField IDField;
    private JTextField passwordField;
    private JTextField websiteField;

    private JButton addButton;
    private JButton deleteButton;

    private JTable table;

    public ListGUI() {
        // Frame
        frame = new JFrame("Account Organizer");
        frame.setSize(850, 900);

        // Title
        title = new JLabel("Account Organizer");
        // Simple visual effect for the title
        Font f1 = new Font("Arial", Font.BOLD, 24);
        title.setFont(f1);

        // A panel for placing ID, password and website
        textPanel = new JPanel();
        textPanel.setSize(900, 24);

        // Textboxes for ID, password and websits
        ID = new JLabel("ID");
        IDField = new JTextField(null, 20);

        password = new JLabel("Password");
        passwordField = new JTextField(null, 20);

        website = new JLabel("website");
        websiteField = new JTextField(null, 20);

        // an add button for recording the inputs into a list
        addButton = new JButton("add");

        // add the typing components to the textpanel
        textPanel.add(ID);
        textPanel.add(IDField);
        textPanel.add(password);
        textPanel.add(passwordField);
        textPanel.add(website);
        textPanel.add(websiteField);
        textPanel.add(addButton);

        // A Panel for a table
        tablePanel = new JPanel();

        String header[] = {"ID", "Password", "Website"};
        String contents[][] = {null, null, null, null};

        DefaultTableModel model = new DefaultTableModel(contents, header);

        // A table that records ID, password, and website
        table = new JTable(model);

        table.getColumnModel().getColumn(0).setPreferredWidth(250);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setPreferredWidth(250);

        // add the table onto tablePanel
        tablePanel.add(table);

        // A panel for a delete button
        deletePanel = new JPanel();

        // A delete button
        deleteButton = new JButton("delete");

        // add the delete button to the panel
        deletePanel.add(deleteButton);

        // add the panel onto the frame
        frame.add(title);
        // set the layout as flow layout
        frame.setLayout(new FlowLayout());
        // add text panel onto frame
        frame.add(textPanel);
        // add table panel onto frame
        frame.add(tablePanel);
        // add delete panel onto frame
        frame.add(deletePanel);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new ListGUI();
    }
}

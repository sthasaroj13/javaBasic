package MenuFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame {
    public static void main(String[] args) {

        // Create a JFrame
        JFrame f1 = new JFrame("Menu Example");

        // Set JFrame properties
        f1.setResizable(true);
        f1.setSize(500, 500);
        f1.setLocation(100, 100);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create a JMenu
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");


        // Create JMenuItem objects
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Open");
        JMenuItem item3 = new JMenuItem("Save");
        JMenuItem item4 = new JMenuItem("Exit");

        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add JMenuItems to the JMenu
        file.add(item1);
        file.add(item2);
        file.add(item3);
        file.addSeparator();
        file.add(item4);

        // Add JMenu to the JMenuBar
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);



        f1.setJMenuBar(menuBar);

f1.setVisible(true);
    }
}

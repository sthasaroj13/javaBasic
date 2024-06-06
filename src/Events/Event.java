package Events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event {
    public static   void main (String[]args) {
        JFrame frame = new JFrame("button event");
        JButton button = new JButton("click me ");

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(button);
        frame.setLayout(null);
        button.setBounds(100,50,100,30);

       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("button is clicked");
               JOptionPane.showMessageDialog(frame,"button is clicked");
           }
       });
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
}

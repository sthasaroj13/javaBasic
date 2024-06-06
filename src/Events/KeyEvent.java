package Events;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;

public class KeyEvent {

       public static void main(String[] args) {
           JFrame frame = new JFrame("key event");
           JLabel  label = new JLabel();
           frame.setSize(500,500);

           label.setText("no key is pressed");

           frame.addKeyListener(new KeyAdapter() {
               @Override
               public void keyTyped(java.awt.event.KeyEvent e) {
                   label.setText("key is typed");
               }

               @Override
               public void keyPressed(java.awt.event.KeyEvent e) {
                   label.setText("key is pressed");

               }

               @Override
               public void keyReleased(java.awt.event.KeyEvent e) {
                   label.setText("key is released");

               }
           });



           frame.add(label);
           frame.setVisible(true);
           frame.setLayout(null);

       }

}

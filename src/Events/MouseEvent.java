package Events;

import javax.swing.*;
import java.awt.event.MouseListener;

public class MouseEvent {
    public static   void main (String[]args) {
        JFrame frame = new JFrame("mouse  event");
        JLabel  label = new JLabel();

        label.setText("No event");
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
               label.setText("mouse click");
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                label.setText("mouse is pressed");

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                label.setText("mouse is released");

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                label.setText("mouse is Entered");

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                label.setText("mouse is exited");

            }
        });



        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);


    }
}

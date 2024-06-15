package Colorclick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Paint {
    public static   void main (String[]args) {
        JFrame frame = new JFrame("paint");

        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.setLayout(null);

        frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                Graphics g = frame.getGraphics();
                g.setColor(Color.red);
                g.fillOval(e.getX(),e.getY(),10,10);
            }
        });

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

    }
    }

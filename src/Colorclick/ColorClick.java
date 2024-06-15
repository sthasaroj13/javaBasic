package Colorclick;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorClick {

    public static   void main (String[]args){
        JFrame frame = new JFrame();

        frame.setSize(500,500);
        frame.setVisible(true);

        frame.setLayout(null);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               super.mouseClicked(e);
             Graphics g =  frame.getGraphics();
             g.setColor(Color.red);
             g.fillOval(e.getX(),e.getY(),10,10);

            }
        });


        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



    }
}

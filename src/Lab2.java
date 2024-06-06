import javax.swing.*;
import java.awt.*;

public class Lab2 {
    public static  void main (String[]args) {

        JFrame frame1 = new JFrame("NIST College");


        frame1.setResizable(true);
        frame1.setSize(500, 500);
        frame1.setVisible(true);
        frame1.setLocation(100,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel(){
            public void paint(Graphics g) {
                Graphics2D g2d =(Graphics2D) g ;
                g2d.setColor(Color.red);
                        g2d.setFont(new Font("Times New Roman",Font.ITALIC,50));
                g2d.drawString("We are learning Advance Java",100,100);

            };



        };
        frame1.add(pan);
        frame1.setVisible(true);
    }






}




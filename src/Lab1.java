import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Lab1 {

    public static  void main (String[]args){

        JFrame frame1 = new JFrame("BCA lAB1");
        frame1.setResizable(true);
        frame1.setSize(500, 500);
        frame1.setVisible(true);
        frame1.setLocation(100,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(){
            public void paint(Graphics g){
                Graphics2D g2d =(Graphics2D) g ;
                g2d.setColor(Color.yellow);
                g2d.setStroke(new BasicStroke(10));
                g2d.drawLine(50,50,200,180);
                g2d.setColor(Color.RED);
                g2d.fillRect(200,200,200,200);
                g2d.setColor(Color.BLUE);
                g2d.fillOval(400,400,200,200);



            }


        };
        frame1.add(p);
        frame1.setVisible(true);

    }
}

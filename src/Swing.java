import javax.swing.*;

public class Swing {
    public static   void main (String[]args){
        JFrame  frame = new JFrame();
        JButton  button  = new JButton("click me ");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(button);
        frame.setLayout(null);
        button.setBounds(100,100,100,100);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



    }
}

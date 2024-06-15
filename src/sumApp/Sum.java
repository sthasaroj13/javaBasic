package sumApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JLabel label = new JLabel("Num1:");
        label.setBounds(110,60,100,30);
        JTextField field = new JTextField();
        field.setBounds(160,60,100,30);


        JLabel label1 = new JLabel("Num2:");
        label1.setBounds(110,100,100,30);
        JTextField field1 = new JTextField();
        field1.setBounds(160,100,100,30);

        JButton button = new JButton("Sum ");
        button.setBounds(150,200,100,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(field.getText());
                    int num2 = Integer.parseInt(field1.getText());
                    int sum = num1+num2;

                    JOptionPane.showMessageDialog(frame,"The sum is ::"+sum);

                }
                catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,"Please Enter the valid Integers","Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        frame.add(button);
        frame.add(label);
        frame.add(field);
        frame.add(label1);
        frame.add(field1);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}

package Counter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Model model = new Model();
        Controller controller = new Controller(model);

        JLabel label = new JLabel();
        label.setText("0");
        label.setBounds(100, 100, 100, 100);
        frame.add(label);

        JButton button = new JButton("Count++");
        JButton button1 = new JButton("Count--");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = controller.increment();
                label.setText(String.valueOf(num));
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = controller.decrement();
                label.setText(String.valueOf(num));
            }
        });
        button.setBounds(100, 50, 100, 30);
        button1.setBounds(200, 50, 100, 30);

        frame.add(button);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MultipleImage {


    public static  void  main (String[]args) throws MalformedURLException {
        JFrame f = new JFrame("Images");
        f.setResizable(true);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel  l = new JLabel();
        URL url = new URL("https://t3.ftcdn.net/jpg/02/39/22/12/360_F_239221224_ZspRhx9wK21O82bALOVfCJfH2ox2YgNx.jpg");

        ImageIcon i = new ImageIcon(url);

        l.setIcon(i);

        f.add(l);
        f.setVisible(true);
    }

}

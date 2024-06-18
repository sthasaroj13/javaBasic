import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static  void  main(String[]args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/MyTable_db";
        String user ="root";
        String password ="9863392928saroj@ir";
//        String query = "create database MyTable_db";
        String query = "insert into students (id,name,roll_no,username,password) values(2,'Saroj',5,'sarojstha','saroj123')";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null,"column is  created");
    }
}

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static  void  main(String[]args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/MyTable_db";
        String user ="root";
        String password ="9863392928saroj@ir";
//        String query = "create database MyTable_db";
        String query = "create table students(id int ,name varchar(25),roll_no int,username varchar(50),password varchar(50))";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null,"students table is  created");
    }
}

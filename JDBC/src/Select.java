import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.sql.*;

public class Select {
    public static  void  main(String[]args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/MyTable_db";
        String user ="root";
        String password ="9863392928saroj@ir";
//        String query = "create database MyTable_db";
        String query = "select * from students;";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();

   ResultSet rs= statement.executeQuery(query);
   while (rs.next()){
       int id = rs.getInt("id");
       String name = rs.getString("name");
       int roll_no = rs.getInt("roll_no");
   String username = rs.getString("username");
       System.out.println("id is :"+id+"name is :"+name+"roll_no is:"+roll_no +  " username is :"+username);

   }

        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null,"table is selected ");
    }
}

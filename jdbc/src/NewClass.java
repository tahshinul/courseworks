
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TAHSHIN
 */
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url ="jdbc:mysql://127.0.0.1/jdbc";
        String user= "root";
        String password = "";
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(url, user, password);
        String query = "SELECT  `name` FROM `info` WHERE id =1;";
        Statement statement = connection.createStatement();
        ResultSet result;
        result = statement.executeQuery(query);
        result.next();
        String name = result.getString("name");
        
        System.out.println(name);
        connection.close();
        statement.close();
    }
}

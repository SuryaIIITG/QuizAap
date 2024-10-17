
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DBManager {
        public static Connection DBConnection ()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinedb","root","root");
            System.out.println("Success");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("DB ERROR "); 
            return null;
        }
    }
    public static void main(String[] args) {
        DBConnection();
    }    
}
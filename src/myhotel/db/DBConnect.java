/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhotel.db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DBConnect {
    
    public static Connection connectDB()
    {
           Connection link =null;
            
             try
             {
                 Class.forName("com.mysql.jdbc.Connection");
                 link = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "");     
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
            
            return link;
    
    }
}

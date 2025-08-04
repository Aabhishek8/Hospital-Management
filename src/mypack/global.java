/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author shruti
 */
public class global {
       static Connection con=null;
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:///hospital","root","");
            
        }
        catch(Exception ae)
        {
          JOptionPane.showMessageDialog(null,ae.getMessage());  
        }
        return con;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billingmanagementsystem.JFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
public class BillingManagementSystem {
     static final String pass = "azad";
     static final String user = "root";
    static final String url= "jdbc:mysql://localhost:3306/billingsystem";
    static Connection con=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;
    public static void main(String[] args) 
    {       
   try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        pst=con.prepareStatement("select *from user");
        rs=pst.executeQuery();
        if(rs.next())
        {
            new Login().setVisible(true);
        }   
        else
        {
          new SignUp().setVisible(true);
   
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, user);
        }
    
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
// Importing required classes
import java.util.*;
 

/**
 *
 * @author rosha
 */
public class Connection {
   
        public Connection(){
       

            try{
    Class.forName("com.mysql.jdbc.Driver");
    try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instacart","root","")){

        
    }catch(Exception e){
        
        JOptionPane.showMessageDialog( null,e );
    }
    
}
catch(Exception e)
{
    
  JOptionPane.showMessageDialog( null,e ); 
}
        
    }
    }



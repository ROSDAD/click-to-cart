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

/**
 *
 * @author rosha
 */
public class Connection {

    private static java.sql.Connection con;

    public Connection() {

    }

    public java.sql.Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/instacart", "root", "");
//        String query;
//        query="INSERT INTO `logintable`(`username`, `password`, `usertype`) VALUES (?,?,?)";
//        PreparedStatement pst = con.prepareStatement(query);
//        pst.setString(1,"abc");
//        pst.setString(2,"abc");
//        pst.setString(3,"Customer");
////        if(cpass.equals(password)){
//        pst.executeUpdate();
//        System.out.println("INserted");
            System.out.println("Database Connected");
            
            
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

}

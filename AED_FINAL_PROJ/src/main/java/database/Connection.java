/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.DriverManager;
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
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/click_to_cart", "root", "root");
            System.out.println("Database Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

}

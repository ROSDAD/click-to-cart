/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.security.MessageDigest;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 * Class to hash the password.
 *
 * @author Abhishek
 */
public class PasswordEncryption {

    public static String encryptThisString(String input) {
        String hashtext = "";
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            // return the HashText
        } // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Exception occured when trying to hash password.");
        }
        return hashtext;
    }
}

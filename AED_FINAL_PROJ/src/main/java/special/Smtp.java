/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package special;
import com.sun.mail.smtp.SMTPTransport;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;
/**
 *
 * @author rosha
 */
public class Smtp {
    private static final String SMTP_SERVER = "smtp.gmail.com";
    private static final String USERNAME = "instacartclone@gmail.com";
    private static final String PASSWORD = "nigcokxgnoghyiod";

    private static final String EMAIL_FROM = "instacartclone@gmail.com";
    private static final String EMAIL_TO = "roshandadlani3@gmail.com";
    private static final String EMAIL_TO_CC = "";

    private static final String EMAIL_SUBJECT = "CONFIRMATION MAIL";
    private static final String EMAIL_TEXT = "Thank You for choosing Insta Cart!";
    
    public Smtp(String Email, String Subject, String Data){
       
        sendMail(Email,Subject,Data);
    }
    public void sendMail(String Email,String Subject, String Data){
        Properties prop = System.getProperties();
        prop.put("mail.smtp.host", SMTP_SERVER);//optional, defined in SMTPTransport
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "587"); // default port 25

        Session session = Session.getInstance(prop, null);
        Message msg = new MimeMessage(session);

        try {
		
			// from
            msg.setFrom(new InternetAddress(EMAIL_FROM));

			// to 
            msg.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Email, false));

			// cc
            msg.setRecipients(Message.RecipientType.CC,
                    InternetAddress.parse(EMAIL_TO_CC, false));

			// subject
            msg.setSubject(Subject);
			
			// content 
            msg.setText(Data);
			
            msg.setSentDate(new Date());

            // connect
            try ( // Get SMTPTransport
                    SMTPTransport t = (SMTPTransport) session.getTransport("smtp")) {
                // connect
                t.connect(SMTP_SERVER, USERNAME, PASSWORD);
                
                // send
                t.sendMessage(msg, msg.getAllRecipients());
                
                System.out.println("Response: " + t.getLastServerResponse());
            }

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        
    }
}

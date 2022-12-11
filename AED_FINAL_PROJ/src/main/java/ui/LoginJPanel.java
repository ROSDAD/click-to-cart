/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JSplitPane;
import javax.swing.JOptionPane;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author Abhishek
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDirectory;
    private Community community;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel() {
//        initComponents();
    }

    public LoginJPanel(CityDir cityDirectory, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.community = community;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.splitPane = splitPane;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.orderManagement = orderManagement;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createLabel1 = new javax.swing.JLabel();
        usernameJLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        usernameTextField1 = new javax.swing.JTextField();
        passwordTextField2 = new javax.swing.JTextField();
        loginButton1 = new javax.swing.JButton();

        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Login");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        usernameJLabel1.setText("Username");

        passwordLabel2.setText("Password");

        loginButton1.setText("Login");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usernameJLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(230, 230, 230)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameTextField1)
                                    .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameJLabel1)
                    .addComponent(usernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel2)
                    .addComponent(passwordTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(loginButton1)
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:

        if (usernameTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "UserName is empty");
            return;
        }

        if (passwordTextField2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Password text field is empty");
            return;
        }

        String usertype = "";

        boolean flag = false;
        for (UserAuthentication userAuthentication : userauthenticationdirectory.getUserAuthenticationList()) {
            if ( userAuthentication.getUserName().equalsIgnoreCase(usernameTextField1.getText())
                    && userAuthentication.getPassword().equalsIgnoreCase(passwordTextField2.getText())) {
                usertype = userAuthentication.getUserType() ;
                flag = true;
            }
        }

        if (flag && usertype.equalsIgnoreCase("Customer")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for customer");
            MainCustomerJPanel mainCustomerJPanel = new MainCustomerJPanel(cityDirectory,usernameTextField1.getText(), orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainCustomerJPanel);
        } else if (flag && usertype.equalsIgnoreCase("DeliveryBoy")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for Delivery Boy");
            MainDeliveryBoyJPanel mainDeliveryBoyJPanel = new MainDeliveryBoyJPanel(community,usernameTextField1.getText(), customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainDeliveryBoyJPanel);
        } else if (flag && usertype.equalsIgnoreCase("CompanyAdmin")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for Company Admin");
            MainCompanyAdminJPanel mainCompanyAdminPanel = new MainCompanyAdminJPanel(cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainCompanyAdminPanel);
        } else if (flag && usertype.equalsIgnoreCase("OrderAdmin")) {
            JOptionPane.showMessageDialog(this, "Login is successfully done for Order Admin");
            MainOrderAdminJPanel mainOrderAdminJPanel = new MainOrderAdminJPanel(orderManagement,cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
            splitPane.setRightComponent(mainOrderAdminJPanel);
        }
//        } else if (flag && usertype.equalsIgnoreCase("DeliveryAdmin")) {
//            JOptionPane.showMessageDialog(this, "Login is successfully done for Delivery Admin");
//            MainOrderAdminJPanel mainOrderAdminJPanel = new MainOrderAdminJPanel(cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
//            splitPane.setRightComponent(mainOrderAdminJPanel);
//        } else if (flag && usertype.equalsIgnoreCase("InventoryAdmin")) {
//            JOptionPane.showMessageDialog(this, "Login is successfully done for Inventory Admin");
//            MainOrderAdminJPanel inventoryAdminJPanel = new MainOrderAdminJPanel(cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
//            splitPane.setRightComponent(inventoryAdminJPanel);
//        }
    }//GEN-LAST:event_loginButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createLabel1;
    private javax.swing.JButton loginButton1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JTextField passwordTextField2;
    private javax.swing.JLabel usernameJLabel1;
    private javax.swing.JTextField usernameTextField1;
    // End of variables declaration//GEN-END:variables
}

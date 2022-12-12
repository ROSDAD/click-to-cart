/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.UserAuthenticationDirectory;
import javax.swing.JSplitPane;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;

/**
 *
 * @author Abhishek
 */
public class MainCustomerJPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private String userName;
    private CityDir cityDirectory;

    /**
     * Creates new form MainCustomerJPanel
     */
    public MainCustomerJPanel() {
        initComponents();
    }

    public MainCustomerJPanel(CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.userName = userName;
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
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

        orderNowButton = new javax.swing.JButton();
        viewPreviousOrderButton = new javax.swing.JButton();
        createLabel1 = new javax.swing.JLabel();

        orderNowButton.setText("order Now");
        orderNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowButtonActionPerformed(evt);
            }
        });

        viewPreviousOrderButton.setText("view previous order");
        viewPreviousOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPreviousOrderButtonActionPerformed(evt);
            }
        });

        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Customer Main Panel");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orderNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(viewPreviousOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(createLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderNowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPreviousOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowButtonActionPerformed
        // TODO add your handling code here:
        CustomerOrderNowJPanel customerOrderNowJPanel = new CustomerOrderNowJPanel(cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(customerOrderNowJPanel);
    }//GEN-LAST:event_orderNowButtonActionPerformed

    private void viewPreviousOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPreviousOrderButtonActionPerformed
        // TODO add your handling code here:
        CustomerOrderHistoryJPanel customerOrderHistoryJPanel = new CustomerOrderHistoryJPanel(cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(customerOrderHistoryJPanel);
    }//GEN-LAST:event_viewPreviousOrderButtonActionPerformed


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        LoginJPanel loginJPanel = new LoginJPanel(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(loginJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createLabel1;
    private javax.swing.JButton orderNowButton;
    private javax.swing.JButton viewPreviousOrderButton;
    // End of variables declaration//GEN-END:variables
}

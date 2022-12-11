/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSplitPane;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.UserAuthenticationDirectory;

/**
 *
 * @author Abhishek
 */
public class MainCompanyAdminJPanel extends javax.swing.JPanel {

    private CityDir cityDirectory;
    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private String cityName;
    private String companyName;

    /**
     * Creates new form MainCompanyAdminJPanel
     */
    public MainCompanyAdminJPanel() {
        initComponents();
    }

    public MainCompanyAdminJPanel(String cityName, String companyName, CityDir cityDirectory, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.cityName = cityName;
        this.companyName = companyName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyButton = new javax.swing.JButton();
        orderAdminButton = new javax.swing.JButton();
        deliveryAdminButton = new javax.swing.JButton();
        createLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inventoryAdminButton = new javax.swing.JButton();

        companyButton.setText("Company");
        companyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyButtonActionPerformed(evt);
            }
        });

        orderAdminButton.setText("Order Admin");
        orderAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderAdminButtonActionPerformed(evt);
            }
        });

        deliveryAdminButton.setText("Delivery Admin");
        deliveryAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryAdminButtonActionPerformed(evt);
            }
        });

        createLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel4.setText("Entity");
        createLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Person");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inventoryAdminButton.setText("Inventory Admin");
        inventoryAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(orderAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryAdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(companyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createLabel4)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryAdminButton)
                    .addComponent(companyButton))
                .addGap(40, 40, 40)
                .addComponent(orderAdminButton)
                .addGap(34, 34, 34)
                .addComponent(inventoryAdminButton)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void companyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyButtonActionPerformed
        // TODO add your handling code here:
        CompanyEntityAdminPanel companyEntityAdminPanel = new CompanyEntityAdminPanel(cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(companyEntityAdminPanel);
    }//GEN-LAST:event_companyButtonActionPerformed

    private void orderAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderAdminButtonActionPerformed
        // TODO add your handling code here:
        OrderAdminRegistrationJPanel houseEntityPanel = new OrderAdminRegistrationJPanel(cityName, companyName, cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(houseEntityPanel);
    }//GEN-LAST:event_orderAdminButtonActionPerformed

    private void deliveryAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryAdminButtonActionPerformed
        // TODO add your handling code here:
        DeliveryAdminRegistrationJPanel deliveryAdminJPanel = new DeliveryAdminRegistrationJPanel(cityName, companyName, cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(deliveryAdminJPanel);
    }//GEN-LAST:event_deliveryAdminButtonActionPerformed

    private void inventoryAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryAdminButtonActionPerformed
        // TODO add your handling code here:
        InventoryAdminRegistrationJPanel inventoryAdminJPanel = new InventoryAdminRegistrationJPanel(cityName, companyName,cityDirectory, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(inventoryAdminJPanel);
    }//GEN-LAST:event_inventoryAdminButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton companyButton;
    private javax.swing.JLabel createLabel4;
    private javax.swing.JButton deliveryAdminButton;
    private javax.swing.JButton inventoryAdminButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orderAdminButton;
    // End of variables declaration//GEN-END:variables
}

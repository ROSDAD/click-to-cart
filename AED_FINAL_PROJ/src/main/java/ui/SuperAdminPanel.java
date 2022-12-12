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
 * @author rosha
 */
public class SuperAdminPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;

    private final CityDir cityDirectory;
    private final Community community;
    private final CustomerDirectory customerDirectory;
    private final CompanyDirectory companyDirectory;
    private final UserAuthenticationDirectory userauthenticationdirectory;
    private final DeliveryBoyDirectory deliveryBoyDirectory;
    private final Ordermgt orderManagement;

    /**
     * Creates new form SuperAdminPanel
     */
    public SuperAdminPanel(CityDir cityDirectory, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cityDirectory = cityDirectory;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cityBtn = new javax.swing.JButton();
        cityAdmin = new javax.swing.JButton();
        companyAdmin = new javax.swing.JButton();
        deliveryAdmin = new javax.swing.JButton();
        inventoryAdmin = new javax.swing.JButton();
        orderAdmin = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel1);

        cityBtn.setText("CITY");
        cityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityBtnActionPerformed(evt);
            }
        });

        cityAdmin.setText("CITY ADMIN");
        cityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityAdminActionPerformed(evt);
            }
        });

        companyAdmin.setText("COMPANY ADMIN");
        companyAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyAdminActionPerformed(evt);
            }
        });

        deliveryAdmin.setText("DELIVERY ADMIN");
        deliveryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryAdminActionPerformed(evt);
            }
        });

        inventoryAdmin.setText("INVENTORY ADMIN");
        inventoryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryAdminActionPerformed(evt);
            }
        });

        orderAdmin.setText("ORDER ADMIN");
        orderAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(orderAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventoryAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(companyAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliveryAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(cityBtn)
                .addGap(27, 27, 27)
                .addComponent(companyAdmin)
                .addGap(18, 18, 18)
                .addComponent(cityAdmin)
                .addGap(18, 18, 18)
                .addComponent(deliveryAdmin)
                .addGap(18, 18, 18)
                .addComponent(inventoryAdmin)
                .addGap(18, 18, 18)
                .addComponent(orderAdmin)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityBtnActionPerformed
        // TODO add your handling code here:
        CityPanel cityPanel = new CityPanel(cityDirectory, splitPane);
        jSplitPane1.setRightComponent(cityPanel);
    }//GEN-LAST:event_cityBtnActionPerformed

    private void companyAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyAdminActionPerformed
        // TODO add your handling code here:
        String role = "CompanyAdmin";
        SuperCompanyAdmin supCompAdmin = new SuperCompanyAdmin(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role);
        jSplitPane1.setRightComponent(supCompAdmin);

    }//GEN-LAST:event_companyAdminActionPerformed

    private void cityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAdminActionPerformed
        // TODO add your handling code here:
        SuperCityAdmin supCityAdmin = new SuperCityAdmin(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1);
        jSplitPane1.setRightComponent(supCityAdmin);
    }//GEN-LAST:event_cityAdminActionPerformed

    private void deliveryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryAdminActionPerformed
        // TODO add your handling code here:
        String role = "DeliveryAdmin";
        SuperCompanyAdmin supDeliveryAdmin = new SuperCompanyAdmin(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role);
        jSplitPane1.setRightComponent(supDeliveryAdmin);
    }//GEN-LAST:event_deliveryAdminActionPerformed

    private void inventoryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryAdminActionPerformed
        // TODO add your handling code here:
        String role = "InventoryAdmin";
        SuperCompanyAdmin supInventoryAdmin = new SuperCompanyAdmin(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role);
        jSplitPane1.setRightComponent(supInventoryAdmin);
    }//GEN-LAST:event_inventoryAdminActionPerformed

    private void orderAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderAdminActionPerformed
        // TODO add your handling code here:
        String role = "OrderAdmin";
        System.out.println(orderManagement.getOrders().size());
        SuperCompanyAdmin supOrderAdmin = new SuperCompanyAdmin(cityDirectory, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory, jSplitPane1, role);
        jSplitPane1.setRightComponent(supOrderAdmin);
    }//GEN-LAST:event_orderAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cityAdmin;
    private javax.swing.JButton cityBtn;
    private javax.swing.JButton companyAdmin;
    private javax.swing.JButton deliveryAdmin;
    private javax.swing.JButton inventoryAdmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton orderAdmin;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.CustomerDirectory;
import model.DeliveryBoy;
import model.DeliveryBoyDirectory;
import model.Orders;
import model.UserAuthenticationDirectory;

/**
 *
 * @author hrish
 */
public class DeliveryAdminAssignPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAdminAssignPanel
     */
    private Company company;
    private Community community;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private JSplitPane splitPane;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private CityDir cityDir;
    private String cityName;
    private String companyName;

    public DeliveryAdminAssignPanel(CityDir cityDir, String cityName, String companyName, Company company, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {

        initComponents();

        this.company = company;
        this.community = community;
        this.customerDirectory = customerDirectory;
        companyDirectory = companyDirectory;
        userauthenticationdirectory = userauthenticationdirectory;
        splitPane = splitPane;
        deliveryBoyDirectory = deliveryBoyDirectory;
        cityDir = cityDir;
        cityName = cityName;
        companyName = companyName;

        populateOrderTable();
        populateDeliveryBoyTable();
    }

    private void populateDeliveryBoyTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        DefaultTableModel model = (DefaultTableModel) tblDeliveryBoys.getModel();
        model.setRowCount(0);

        if (deliveryBoyDirectory.getDeliveryBoyList() != null) {
            for (DeliveryBoy d : deliveryBoyDirectory.getDeliveryBoyList()) {

                Object[] row = new Object[11];
                //row[0] = house;
                row[0] = d.getDeliveryBoyName();
                row[1] = d.getQualificaton();
                row[2] = d.getYearOfDeliveryExperience();
                row[3] = d.getEmergencyContactNumber();

                model.addRow(row);
            }
        }
    }

    private List<Orders> getOrderDir() {

        List<Orders> ordDir = new ArrayList<Orders>();

        for (City c : cityDir.getCityDir()) {

            if (c.getCityName().equalsIgnoreCase(cityName)) {

                for (Company comp : c.getCompanyDirectory().getCompanyDirectoryList()) {

                    ordDir = comp.getOrderMgt().getOrders();
                    break;
                }

                break;
            }
        }

        return ordDir;
    }

    private void populateOrderTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);

        if (getOrderDir() != null) {
            for (Orders o : getOrderDir()) {

                Object[] row = new Object[11];
                //row[0] = house;
                row[0] = o.getOrderId();
                row[1] = o.getAddress();
                row[2] = o.getFinalPrice();

                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDeliveryBoys = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Address", "Order Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.setPreferredSize(new java.awt.Dimension(904, 638));
        jScrollPane1.setViewportView(tblOrders);

        tblDeliveryBoys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Delivery Boy Name", "Years of Experience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDeliveryBoys.setPreferredSize(new java.awt.Dimension(904, 638));
        jScrollPane2.setViewportView(tblDeliveryBoys);

        btnAssign.setText("Assign Order");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnAssign)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDeliveryBoys.getSelectedRow();

        if (selectedRowIndex < 0) {

            JOptionPane.showMessageDialog(this, "Please select an delivery boy.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblDeliveryBoys.getModel();
        String deliveryBoy = (String) model.getValueAt(selectedRowIndex, 0);

        selectedRowIndex = tblOrders.getSelectedRow();

        if (selectedRowIndex < 0) {

            JOptionPane.showMessageDialog(this, "Please select an order.");
            return;
        }

        model = (DefaultTableModel) tblDeliveryBoys.getModel();
        String orderID = (String) model.getValueAt(selectedRowIndex, 0);

        List<Orders> ordDir = getOrderDir();

        for (Orders o : ordDir) {
            if (o.getOrderId().equalsIgnoreCase(orderID)) {

                for (DeliveryBoy d : deliveryBoyDirectory.getDeliveryBoyList()) {

                    if (d.getDeliveryBoyName().equalsIgnoreCase(deliveryBoy)) {

                        d.getOrderList().add(o);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDeliveryBoys;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}

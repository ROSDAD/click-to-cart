/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Orderedprod;
import model.Ordermgt;
import model.Orders;
import model.UserAuthenticationDirectory;
import model.ChatClient;
import model.InventoryProduct;

/**
 *
 * @author Abhishek
 */
public class MainOrderAdminJPanel extends javax.swing.JPanel {

    private CityDir cityDirectory;
    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;

    /**
     * Creates new form MainOrderAdminJPanel
     */
    public MainOrderAdminJPanel() {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(approvedRadioButton);
        buttonGroup.add(rejectedRadioButton);
    }

    public MainOrderAdminJPanel(Ordermgt orderManagement, CityDir cityDirectory, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(approvedRadioButton);
        buttonGroup.add(rejectedRadioButton);
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
     * Populate the table cities rows from the arrayList.
     */
    private void populateCustomers() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        for (Customer customer : customerDirectory.getCustomerList()) {
            Object[] row = new Object[1];
            row[0] = customer.getUserName();
            model.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        updateOrderCancellationRequestrButton = new javax.swing.JButton();
        orderedProductsjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ordersjButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        viewCustomersButton = new javax.swing.JButton();
        approvedRadioButton = new javax.swing.JRadioButton();
        rejectedRadioButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Final Price", "Address", "Payment Type", "Order Status", "Order Adm Appr"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        updateOrderCancellationRequestrButton.setText("Update order for Cancelation Request");
        updateOrderCancellationRequestrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderCancellationRequestrButtonActionPerformed(evt);
            }
        });

        orderedProductsjButton.setText("View Ordered Products");
        orderedProductsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderedProductsjButtonActionPerformed(evt);
            }
        });

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Product count", "Product Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        ordersjButton.setText("View Orders");
        ordersjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersjButtonActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Customers"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        viewCustomersButton.setText("View Customers");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        approvedRadioButton.setText("Approved");

        rejectedRadioButton.setText("Rejected");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ordersjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rejectedRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(updateOrderCancellationRequestrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(orderedProductsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)))
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(approvedRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(viewCustomersButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)))
                .addComponent(viewCustomersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateOrderCancellationRequestrButton)
                            .addComponent(ordersjButton)
                            .addComponent(orderedProductsjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(approvedRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(rejectedRadioButton)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateOrderCancellationRequestrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderCancellationRequestrButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable3.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a customer row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        String customerUsername = model.getValueAt(selectedRowIndex, 0).toString();

        int selectedRowOrderIndex = jTable1.getSelectedRow();
        if (selectedRowOrderIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel modelOrder = (DefaultTableModel) jTable1.getModel();
        String orderStatus = modelOrder.getValueAt(selectedRowOrderIndex, 4).toString();
        String selectedOrderID = modelOrder.getValueAt(selectedRowOrderIndex, 0).toString();
        String approvedOrCancelled = "";

        if (approvedRadioButton.isSelected() == false && rejectedRadioButton.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Order Admin approval radio button is not filled");
            return;
        }

        if (approvedRadioButton.isSelected() == true) {
            approvedOrCancelled = "Approved";
        } else if (rejectedRadioButton.isSelected() == true) {
            approvedOrCancelled = "Rejected";
        }

        String previousOrderStatus = "";
        for (Customer customer : customerDirectory.getCustomerList()) {
            if (customerUsername.equalsIgnoreCase(customer.getUserName())) {
                for (Orders orders : customer.getOrders()) {
                    if (orders.getOrderId().equalsIgnoreCase(selectedOrderID)) {
                        System.out.println(selectedOrderID + " " + orders.getOrderId());
                        if (approvedOrCancelled.equalsIgnoreCase("Approved")) {
                            orders.setOrderStatus("Cancelled");
                            orders.setOrderAdminApproval(true);
                            break;
                        } else {
                            previousOrderStatus = orders.getPreviousOrderStatus();
                            orders.setOrderStatus(previousOrderStatus);
                            orders.setOrderAdminApproval(false);
                            break;
                        }
                    }
                }
            }
        }

        if (orderStatus.equalsIgnoreCase("Pending_for_Approval")) {
            if (approvedOrCancelled.equalsIgnoreCase("Approved")) {
                modelOrder.setValueAt("Cancelled", selectedRowOrderIndex, 4);
                modelOrder.setValueAt(true, selectedRowOrderIndex, 5);

            } else {
                modelOrder.setValueAt(previousOrderStatus, selectedRowOrderIndex, 4);
                modelOrder.setValueAt(false, selectedRowOrderIndex, 5);
            }
        }

        JOptionPane.showMessageDialog(this, "Order admin request cancellation is completed");
    }//GEN-LAST:event_updateOrderCancellationRequestrButtonActionPerformed

    private void orderedProductsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderedProductsjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select order to view the products");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String orderID = model.getValueAt(selectedRowIndex, 0).toString();

        
        for (Orders order : orderManagement.getOrders()) {
            if (order.getOrderId().equalsIgnoreCase(orderID)) {
                if (order.getOrderedProds().isEmpty()) {
                    List<Orderedprod> orderList = new ArrayList<>();
                    populateOrderedProducts(orderList);
                } else {
                    populateOrderedProducts(order.getOrderedProds());
                }
            }
        }
    }//GEN-LAST:event_orderedProductsjButtonActionPerformed

    /**
     * Populate the table rows from the arrayList.
     */
    private void populateOrderedProducts(List<Orderedprod> OrderedprodList) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Orderedprod orderedprod : OrderedprodList) {
//            String pName = "";
//             for (int k = 0; k < comp.getInventoryManagement().getInventoryMgt().size(); k++) {
//                    List<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(k).getInventoryProductDir().getInventoryProductDir();
//                    for (int j = 0; j < mainM.size(); j++) {
//                        if (orderedprod.getProdid().equals(mainM.get(j).getPid())) {
//                            pName = mainM.get(j).getProductName();
//                        }
//                    }
//
//                }
            Object[] row = new Object[3];
            row[0] = orderedprod.getProdid();
            row[1] = orderedprod.getprodcount();
            row[2] = orderedprod.getProdTotalprice();
            model.addRow(row);
        }
    }


    private void ordersjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable3.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a customer row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        String customerUsername = model.getValueAt(selectedRowIndex, 0).toString();

        DefaultTableModel modelOrders = (DefaultTableModel) jTable1.getModel();
        modelOrders.setRowCount(0);
        for (Customer customer : customerDirectory.getCustomerList()) {

            if (customerUsername.equalsIgnoreCase(customer.getUserName())) {
                for (Orders orders : customer.getOrders()) {
                    Object[] row = new Object[6];
                    row[0] = orders.getOrderId();
                    row[1] = orders.getFinalPrice();
                    row[2] = orders.getAddress();
                    row[3] = orders.getPaymentType().getPaymentType();
                    row[4] = orders.getOrderStatus();
                    row[5] = orders.isOrderAdminApproval();
                    modelOrders.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_ordersjButtonActionPerformed

    private void viewCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersButtonActionPerformed
        // TODO add your handling code here:
        populateCustomers();
    }//GEN-LAST:event_viewCustomersButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChatServerGUI chatServerGui = new ChatServerGUI();
        chatServerGui.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approvedRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton orderedProductsjButton;
    private javax.swing.JButton ordersjButton;
    private javax.swing.JRadioButton rejectedRadioButton;
    private javax.swing.JButton updateOrderCancellationRequestrButton;
    private javax.swing.JButton viewCustomersButton;
    // End of variables declaration//GEN-END:variables
}

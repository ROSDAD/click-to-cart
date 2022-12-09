/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Company;
import model.Customer;
import model.Inventory;
import model.InventoryProduct;
import model.Orderedprod;
import model.Ordermgt;
import model.Orders;

/**
 *
 * @author rosha
 */
public class CartPanel extends javax.swing.JPanel {

    /**
     * Creates new form CartPanel
     */
    public CartPanel() {
        initComponents();
            Customer cust = new Customer();
            ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();
            
            
        displayItemList();
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
        cartTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        orderBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "pid", "Name", "Count", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("YOUR CART");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Your Total:");

        totalPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPrice.setText("$12");

        orderBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderBtn.setText("ORDER");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        removeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        removeBtn.setText("REMOVE");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orderBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
                // TODO add your handling code here:
        if(){
            Customer cust = new Customer(); //need to be changed
            ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();
            Ordermgt ordmgt = new Ordermgt();
            Orders ord = ordmgt.addNewOrder();
            int finalPrice = 0;
            for(int i = 0; i<ordProd.size();i++){
                Orderedprod newProd = ord.addNewOrderedProds();
                newProd.setProdId(ordProd.get(i).getProdid());
                newProd.setProdcount(ordProd.get(i).getprodcount());
                newProd.setProdTotalprice(ordProd.get(i).getProdTotalprice());
                finalPrice = finalPrice+ordProd.get(i).getProdTotalprice();

            }
            ord.setFinalPrice(finalPrice);
        }
    }//GEN-LAST:event_orderBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        Customer cust = new Customer();
        ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();
        int selectedRowIndex = cartTable.getSelectedRow();
        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Select a Product to Remove.");
            return;
        }
        Orderedprod orderObj = ordProd.get(selectedRowIndex);
        
        ordProd.remove(orderObj);
            
        displayItemList();
    }//GEN-LAST:event_removeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
private void displayItemList() {
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        Customer cust = new Customer(); //need to be changed
        
        ArrayList<Orderedprod> ordProd = cust.getCart().getCartProd();
        
        Company comp = new Company(); //need to be changed
        
        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();
        
        
         
        
        int finalPrice = 0;
        String pName = "";
        for (int i =0;i<ordProd.size();i++){
          if(ordProd.get(i) != null){
            for(int k = 0; k<dirModel.size();k++){
            ArrayList<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(k).getInventoryProductDir().getInventoryProductDir();
            for(int j = 0; j<mainM.size();j++){
                if(ordProd.get(i).getProdid().equals(mainM.get(j).getPid())){
                    pName = mainM.get(j).getProductName();
                }
                }

            }
            
            Object[] row = new Object[4];
            row[0] = ordProd.get(i).getProdid();

            row[1] = pName;
            row[2] = ordProd.get(i).getprodcount();
            row[3] = ordProd.get(i).getProdTotalprice();
            finalPrice = finalPrice+ordProd.get(i).getProdTotalprice();
            model.addRow(row);
           
            
          }
        }

        totalPrice.setText("$"+finalPrice);

    }

}

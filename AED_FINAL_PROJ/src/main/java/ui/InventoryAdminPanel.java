/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Company;
import model.CompanyDirectory;
import model.Inventory;
import model.InventoryMgt;
import javax.swing.JOptionPane;

/**
 *
 * @author hrish
 */
public class InventoryAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryAdmin
     */
    
    private String cityName;
    private String companyName;
    private CityDir cityDir;
    private JSplitPane splitPane;
    private CompanyDirectory companyDir;
    private InventoryMgt invMgt;
    private String inventoryCategory;
    private String inventoryType; //critical, general
    
    public InventoryAdminPanel(String cityName, String companyName, CityDir cityDir, JSplitPane splitPane) {
        initComponents();
        
        this.cityName = cityName;
        this.companyName = companyName;
        this.cityDir = cityDir;
        this.splitPane = splitPane;
        
        populateInventoriesTable();
    }
    
    private void populateInventoriesTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        // House Table        
        DefaultTableModel model = (DefaultTableModel) tblInventories.getModel();
        model.setRowCount(0);
        
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                
                companyDir = c.getCompanyDirectory();
                
                List<Company> compDir = companyDir.getCompanyDirectoryList();
                
                    for(Company comp:compDir) {
                        
                        if(comp.getCompanyName().equalsIgnoreCase(companyName)) {
                            
                            if(comp.getInventoryManagement() != null) {
                                
                                model = (DefaultTableModel) tblInventories.getModel();
                                model.setRowCount(0);
                                
                                invMgt = comp.getInventoryManagement();
                                
                                ArrayList<Inventory> invDir = invMgt.getInventoryMgt();
                                        
                                for(Inventory i : invDir) {

                                    Object[] row = new Object[11];
                                    //row[0] = house;
                                    row[0] = i.getInventoryCategory();
                                    row[1] = i.getInventoryType();

                                    model.addRow(row);

                                }       

                            }
                            else {
                                    Inventory i = new Inventory();
                                    
                                    Object[] row = new Object[11];
                                    //row[0] = house;
                                    row[0] = i.getInventoryCategory();
                                    row[1] = i.getInventoryType();

                                    model.addRow(row);
                            }                            
                        }
                    }
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
        tblInventories = new javax.swing.JTable();
        btnCreateInventory = new javax.swing.JButton();
        updateInventory = new javax.swing.JButton();
        btnDeleteInventory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        radioGeneral = new javax.swing.JRadioButton();
        radioCritical = new javax.swing.JRadioButton();
        btnModifyProducts = new javax.swing.JButton();

        tblInventories.setModel(new javax.swing.table.DefaultTableModel(
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
                "Inventory Category", "Inventory Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventories);

        btnCreateInventory.setText("Create Inventoy");
        btnCreateInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInventoryActionPerformed(evt);
            }
        });

        updateInventory.setText("Update Inventory");
        updateInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryActionPerformed(evt);
            }
        });

        btnDeleteInventory.setText("Delete Inventory");
        btnDeleteInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteInventoryActionPerformed(evt);
            }
        });

        jLabel3.setText("Inventory Category:");

        jLabel4.setText("Inventory Type:");

        radioGeneral.setText("General");
        radioGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioGeneralActionPerformed(evt);
            }
        });

        radioCritical.setText("Critical");

        btnModifyProducts.setText("Modify Inventory Products");
        btnModifyProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioGeneral)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(radioCritical))))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCreateInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(updateInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(btnModifyProducts)))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteInventory)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioGeneral)
                    .addComponent(radioCritical))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateInventory)
                    .addComponent(updateInventory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(btnModifyProducts)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInventoryActionPerformed
        // TODO add your handling code here:

        inventoryCategory = txtCategory.getText();      

        if(!inventoryCategory.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Category should have only alphabets.");
            return;
        }

        if(inventoryCategory.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }

        //Radio buttons

        if(radioGeneral.isSelected() == true) {
            inventoryType = "General";
        }
        else if(radioCritical.isSelected() == true){
            inventoryType = "Critical";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select an inventory type.");
        }

        Inventory i  = invMgt.addNewInventory();

        i.setInventoryCategory(inventoryCategory);
        i.setInventoryType(inventoryType);

        JOptionPane.showMessageDialog(this, "Inventory created!");

        populateInventoriesTable();

    }//GEN-LAST:event_btnCreateInventoryActionPerformed

    private void updateInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryActionPerformed
        // TODO add your handling code here:

        inventoryCategory = txtCategory.getText();

        if(!cityName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name should have only alphabets.");
            return;
        }

        if(cityName.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }

        //Radio buttons

        if(radioGeneral.isSelected() == true) {
            inventoryType = "General";
        }
        else if(radioCritical.isSelected() == true){
            inventoryType = "Critical";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select an inventory type.");
        }

        int selectedRowIndex = tblInventories.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a inventory to update.");
            return;
        }        

        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                
                companyDir = c.getCompanyDirectory();
                
                List<Company> compDir = companyDir.getCompanyDirectoryList();
                
                    for(Company comp:compDir) {
                        
                        if(comp.getCompanyName().equalsIgnoreCase(companyName)) {
                            
                            if(comp.getInventoryManagement() != null) {
                                                                
                                invMgt = comp.getInventoryManagement();
                                
                                DefaultTableModel model = (DefaultTableModel) tblInventories.getModel();
                                String selectedInv = (String) model.getValueAt(selectedRowIndex, 0);
                                
                                ArrayList<Inventory> invDir = invMgt.getInventoryMgt();
                                        
                                for(Inventory i : invDir) {
                                    
                                    if(i.getinventoryCategory().equalsIgnoreCase(selectedInv)) {
                                        
                                        i.setInventoryCategory(inventoryCategory);
                                        i.setInventoryType(inventoryType);
                                    }
                                }       
                            }                            
                        }
                    }
                }
            }

        JOptionPane.showMessageDialog(this, "Inventory updated!");

        populateInventoriesTable();
    }//GEN-LAST:event_updateInventoryActionPerformed

    private void btnDeleteInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteInventoryActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblInventories.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select an inventory.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblInventories.getModel();
        String inventoryName = (String) model.getValueAt(selectedRowIndex, 0);

        ArrayList<City> cDir = cityDir.getCityDir();
        
        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                
                companyDir = c.getCompanyDirectory();
                
                List<Company> compDir = companyDir.getCompanyDirectoryList();
                
                    for(Company comp:compDir) {
                        
                        if(comp.getCompanyName().equalsIgnoreCase(companyName)) {
                            
                            if(comp.getInventoryManagement() != null) {
                                                                
                                invMgt = comp.getInventoryManagement();
                                
                                model = (DefaultTableModel) tblInventories.getModel();
                                String selectedInv = (String) model.getValueAt(selectedRowIndex, 0);
                                
                                ArrayList<Inventory> invDir = invMgt.getInventoryMgt();
                                        
                                for(Inventory i : invDir) {
                                    
                                    if(i.getinventoryCategory().equalsIgnoreCase(selectedInv)) {
                                        
                                        invMgt.deleteInventory(i);
                                        populateInventoriesTable();
                                        JOptionPane.showMessageDialog(this, "Inventory Deleted!");
                                        break;
                                    }
                                }       
                            }                            
                        }
                    }
                }
            }
    }//GEN-LAST:event_btnDeleteInventoryActionPerformed

    private void radioGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioGeneralActionPerformed

    private void btnModifyProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyProductsActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblInventories.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select an inventory.");
            return;
        }
        
        ArrayList<City> cDir = cityDir.getCityDir();
        
        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                
                companyDir = c.getCompanyDirectory();
                
                List<Company> compDir = companyDir.getCompanyDirectoryList();
                
                    for(Company comp:compDir) {
                        
                        if(comp.getCompanyName().equalsIgnoreCase(companyName)) {
                            
                            if(comp.getInventoryManagement() != null) {
                                                                
                                invMgt = comp.getInventoryManagement();
                                
                                DefaultTableModel model = (DefaultTableModel) tblInventories.getModel();
                                String selectedInv = (String) model.getValueAt(selectedRowIndex, 0);
                                
                                ArrayList<Inventory> invDir = invMgt.getInventoryMgt();
                                        
                                for(Inventory i : invDir) {
                                    
                                    if(i.getinventoryCategory().equalsIgnoreCase(selectedInv)) {
        
                                        ModifyInvProductsPanel m = new ModifyInvProductsPanel(cityName, companyName, cityDir, splitPane, i.getInventoryProductDir());
                                        splitPane.setRightComponent(m);   
                                        //break;
                                    }
                                }       
                            }                            
                        }
                    }
                }
        }
    }//GEN-LAST:event_btnModifyProductsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateInventory;
    private javax.swing.JButton btnDeleteInventory;
    private javax.swing.JButton btnModifyProducts;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioCritical;
    private javax.swing.JRadioButton radioGeneral;
    private javax.swing.JTable tblInventories;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JButton updateInventory;
    // End of variables declaration//GEN-END:variables
}

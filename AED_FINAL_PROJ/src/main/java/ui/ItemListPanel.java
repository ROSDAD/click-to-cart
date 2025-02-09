/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.*;
import database.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author rosha
 */
public class ItemListPanel extends javax.swing.JPanel {

    private Customer cust;
    private Company comp;
    private JSplitPane splitPane;
    private String selectedCityName;
    private double distance;

    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private String userName;
    private double dist;
    private CityDir cityDirectory;

    /**
     * Creates new form ItemListPanel
     */
    public ItemListPanel(Double dist, String selectedCityName, Customer cust, Company comp, CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        String imgDir = System.getProperty("user.dir")+"/src/main/java/IMAGES/";
        customerRegistrationLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"itemlistwelcome.png").getImage().getScaledInstance(700, 300, Image.SCALE_DEFAULT)));
//        welcomeLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"signupwelcome.gif").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
        roadLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"road.png").getImage().getScaledInstance(1300, 300, Image.SCALE_DEFAULT)));
        cartButton.setIcon(new ImageIcon(new ImageIcon(imgDir+"cart.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        
        this.cust = cust;
        this.comp = comp;
        this.selectedCityName = selectedCityName;
        this.distance = dist;
        filterComboBox.removeAllItems();
        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();
        for (int i = 0; i < dirModel.size(); i++) {
            filterComboBox.addItem(dirModel.get(i).getInventoryCategory());
        }

        this.cityDirectory = cityDirectory;
        this.userName = userName;
        this.orderManagement = orderManagement;
        this.community = community;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.splitPane = splitPane;
        this.deliveryBoyDirectory = deliveryBoyDirectory;

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
        itemListTable = new javax.swing.JTable();
        quantityTxt = new javax.swing.JTextField();
        viewDetails = new javax.swing.JButton();
        pNameLabel = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        itemSeacrhBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        filterComboBox = new javax.swing.JComboBox<>();
        prodIdLbl = new javax.swing.JLabel();
        cartButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        customerRegistrationLabel = new javax.swing.JLabel();
        roadLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        itemListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pid", "Name", "Price", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemListTable);

        viewDetails.setBackground(new java.awt.Color(71, 43, 29));
        viewDetails.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        viewDetails.setForeground(new java.awt.Color(255, 255, 255));
        viewDetails.setText("View");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        pNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pNameLabel.setText("Product Name");

        addToCart.setBackground(new java.awt.Color(71, 43, 29));
        addToCart.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setText("ADD TO CART");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(71, 43, 29));
        searchBtn.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });

        prodIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prodIdLbl.setText("Product ID");

        cartButton.setBackground(new java.awt.Color(71, 43, 29));
        cartButton.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(71, 43, 29));
        backButton.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        customerRegistrationLabel.setBackground(new java.awt.Color(255, 255, 255));
        customerRegistrationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(itemSeacrhBox, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prodIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(customerRegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cartButton)
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(roadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addToCart)
                .addGap(419, 419, 419))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerRegistrationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemSeacrhBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 21, Short.MAX_VALUE)
                .addComponent(roadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = itemListTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a product to view the quantity");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        prodIdLbl.setText((model.getValueAt(selectedRowIndex, 0)).toString());
        pNameLabel.setText((model.getValueAt(selectedRowIndex, 1)).toString());
        quantityTxt.setText("0");
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        
        String prodId;
        int quantity = Integer.parseInt(quantityTxt.getText());
        int prodQuantity = comp.getInventoryManagement().getInventoryMgt()
                .get(0).getInventoryProductDir().getInventoryProductDir()
                .get(itemListTable.getSelectedRow()).getInventoryQty();
        if (quantity <= prodQuantity) {
            DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
            int selectedRowIndex = itemListTable.getSelectedRow();

            int flag = 0;
            if (cust.getCart() != null) {
                ArrayList<Orderedprod> ordProdList = cust.getCart().getCartProd();
                for (int w = 0; w < ordProdList.size(); w++) {
                    if (ordProdList.get(w).getProdid().equals((model.getValueAt(selectedRowIndex, 0)).toString())) {
                        flag = 1;
                        if ((ordProdList.get(w).getprodcount() + quantity) <= prodQuantity) {
                            ordProdList.get(w).setProdcount(ordProdList.get(w).getprodcount() + quantity);
                            double price = Double.parseDouble(String.valueOf(quantity * Double.parseDouble((model.getValueAt(selectedRowIndex, 2)).toString())));
                            double price2 = ordProdList.get(w).getProdTotalprice();
                            double finalPrice = price + price2;
                            ordProdList.get(w).setProdTotalprice(finalPrice);
                        } else {
                            JOptionPane.showMessageDialog(this, "Not Enough Quantity left In Inventory!");
                            return;
                        }
                    }
                }
            }
            if (flag == 0) {
                Orderedprod ordProd = cust.getCart().addNewCartProd();
                prodId = model.getValueAt(selectedRowIndex, 0).toString();
                ordProd.setProdId((model.getValueAt(selectedRowIndex, 0)).toString());
                String pName = "";
                double price = Double.parseDouble(String.valueOf(quantity * Double.parseDouble((model.getValueAt(selectedRowIndex, 2)).toString())));
                for (int k = 0; k < comp.getInventoryManagement().getInventoryMgt().size(); k++) {
                    List<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(k).getInventoryProductDir().getInventoryProductDir();
                    for (int j = 0; j < mainM.size(); j++) {
                        if (ordProd.getProdid().equals(mainM.get(j).getPid())) {
                            pName = mainM.get(j).getProductName();
                        }
                    }
                }

                ordProd.setProductName(pName);
                ordProd.setProdTotalprice(price);
                ordProd.setProdcount(quantity);
                
                Connection obj = new Connection();
                java.sql.Connection con = obj.getConnection();

                String query = "INSERT INTO `ordered_prod`(prodID, `productName`, `prodTotalPrice`, `prodCount`) VALUES (?,?,?,?)";
                PreparedStatement pst = null;
                try {
                    pst = obj.getConnection().prepareStatement(query);
                    pst.setString(1, prodId);
                    pst.setString(2, pName);
                    pst.setDouble(3, price);
                    pst.setInt(4, quantity);

                    pst.executeUpdate();
                    System.out.println("Inserted product.");
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }
            JOptionPane.showMessageDialog(this, "Product Added To Cart!");

        } else {
            JOptionPane.showMessageDialog(this, "Not Enough Quantity left In Inventory!");
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        itemListTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(itemSeacrhBox.getText()));
    }//GEN-LAST:event_searchBtnActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        // TODO add your handling code here:
        if (filterComboBox.getSelectedIndex() != -1) {
            displayItemList();

        }
    }//GEN-LAST:event_filterComboBoxActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        // TODO add your handling code here:
        CartPanel cartPanel = new CartPanel(distance, selectedCityName, cust, comp, splitPane, cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, deliveryBoyDirectory);
        splitPane.setRightComponent(cartPanel);

    }//GEN-LAST:event_cartButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CustomerOrderNowJPanel customerOrderNowJPanel = new CustomerOrderNowJPanel(cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(customerOrderNowJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cartButton;
    private javax.swing.JLabel customerRegistrationLabel;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JTable itemListTable;
    private javax.swing.JTextField itemSeacrhBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel prodIdLbl;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JLabel roadLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
    private void displayItemList() {
        DefaultTableModel model = (DefaultTableModel) itemListTable.getModel();
        model.setRowCount(0);

        ArrayList<Inventory> dirModel = comp.getInventoryManagement().getInventoryMgt();

        int j = 0;
        for (int i = 0; i < dirModel.size(); i++) {
            if (dirModel.get(i).getInventoryCategory().equals(filterComboBox.getSelectedItem().toString())) {
                j = i;
                break;
            }

        }
        ArrayList<InventoryProduct> mainM = comp.getInventoryManagement().getInventoryMgt().get(j).getInventoryProductDir().getInventoryProductDir();
        for (int i = 0; i < mainM.size(); i++) {
            if (mainM.get(i) != null) {

                Object[] row = new Object[4];
                row[0] = mainM.get(i).getPid();

                row[1] = mainM.get(i).getProductName();
                row[2] = mainM.get(i).getPrice();
                row[3] = mainM.get(i).getInventoryQty();

                model.addRow(row);

            }
        }

    }

}

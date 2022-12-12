/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.UserAuthenticationDirectory;
import javax.swing.JFrame;
import java.sql.*;
import java.util.UUID;
import model.City;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoy;
import model.DeliveryBoyDirectory;
import model.Inventory;
import model.InventoryMgt;
import model.InventoryProduct;
import model.InventoryProductDir;
import model.Ordermgt;
import model.UserAuthentication;
import database.Connection;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.Cart;
import model.Orderedprod;
import model.Orders;
import model.Payment;
import ui.CustomerRegistrationJPanel;
import ui.LoginJPanel;

//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author hrish
 */
public class MainJFrame extends javax.swing.JFrame {

    private Community community;
    private CustomerDirectory customerDirectory;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private CityDir cityDirectory;
    private CompanyDirectory companyDir;
    private InventoryMgt inventoryManagement;
    private InventoryProductDir invProdDir;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private City city;
    private Company company;
    private Company company1;
    private UserAuthentication userAuthentication;
    private DeliveryBoy deliveryBoy;
    private Customer customer;
    private Cart cart;

    public MainJFrame() {
        initComponents();
//        System.out.println();
        String imgDir = System.getProperty("user.dir")+"/src/main/java/IMAGES/";
        roadLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"road.png").getImage().getScaledInstance(1300, 300, Image.SCALE_DEFAULT)));
        welcomeLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"welcome.png").getImage().getScaledInstance(1000, 300, Image.SCALE_DEFAULT)));
        scootLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"scooter.png").getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT)));
        genieLabel.setIcon(new ImageIcon(new ImageIcon(imgDir+"ecommerce.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
//        scootLabel.setIcon(new ImageIcon(imgDir+"scooter.png"));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connection obj = new Connection();
        java.sql.Connection con = obj.getConnection();

        community = new Community();
        customerDirectory = new CustomerDirectory();
        userauthenticationdirectory = new UserAuthenticationDirectory();
        cityDirectory = new CityDir();
        companyDir = new CompanyDirectory();
        inventoryManagement = new InventoryMgt();
        deliveryBoyDirectory = new DeliveryBoyDirectory();
        orderManagement = new Ordermgt();
        invProdDir = new InventoryProductDir();
        cart = new Cart();
        

        InventoryProduct invProd = invProdDir.addNewInventoryProduct();
        invProd.setProductName("TV");
        invProd.setPid(1);
        invProd.setPrice(500);
        invProd.setInventoryQty(24);

        Inventory inv = inventoryManagement.addNewInventory();
        inv.setInventoryCategory("Default");
        inv.setInventoryType("Critical");
        inv.setInventoryProductDir(invProdDir);

        company = companyDir.addNewCompany();
        company.setCompanyName("Costco");
        company.setCompanyType("Public");
        company.setInventoryManagement(inventoryManagement);

        company1 = companyDir.addNewCompany();
        company1.setCompanyName("Target");
        company1.setCompanyType("Private");
        company1.setInventoryManagement(inventoryManagement);

        company1 = companyDir.addNewCompany();
        company1.setCompanyName("Target");
        company1.setCompanyType("Private");
        company1.setInventoryManagement(inventoryManagement);

        //Default City
        city = cityDirectory.addNewCity();

        city.setCityName("Boston");
        city.setCityType("Urban");
        city.setPopulation(25000);
        city.setCompanyDirectory(companyDir);

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("abc");
        userAuthentication.setPassword("abc");
        userAuthentication.setUserType("Customer");

        String query;
        
//        query = "SELECT cityName, population, cityType FROM city";
//        try {        
//        Statement stmt = con.createStatement();
//        ResultSet rs;                        
//        
//        rs = stmt.executeQuery(query);
//            while ( rs.next() ) {
//                String cityName = rs.getString("cityName");
//                int population = rs.getInt("population");
//                String cityType = rs.getString("cityType");
//            }
//        }
//        
//        catch (SQLException ex) {
//            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("de");
        userAuthentication.setPassword("de");
        userAuthentication.setUserType("DeliveryBoy");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("abc1");
        userAuthentication.setPassword("abc1");
        userAuthentication.setUserType("OrderAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("ab");
        userAuthentication.setPassword("ab");
        userAuthentication.setUserType("SuperAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("co");
        userAuthentication.setPassword("co");
        userAuthentication.setCityName("Boston");
        userAuthentication.setCompanyName("Costco");
        userAuthentication.setUserType("CompanyAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("city");
        userAuthentication.setPassword("city");
        userAuthentication.setCityName("Boston");
        userAuthentication.setCompanyName("");
        userAuthentication.setUserType("CityAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("del");
        userAuthentication.setPassword("del");
        userAuthentication.setCityName("Boston");
        userAuthentication.setCompanyName("Costco");
        userAuthentication.setUserType("DeliveryAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("inv");
        userAuthentication.setPassword("inv");
        userAuthentication.setCityName("Boston");
        userAuthentication.setCompanyName("Costco");
        userAuthentication.setUserType("InventoryAdmin");

        userAuthentication = userauthenticationdirectory.addNewUserAuthentication();
        userAuthentication.setUserName("system");
        userAuthentication.setPassword("system");
        userAuthentication.setCityName("");
        userAuthentication.setCompanyName("");
        userAuthentication.setUserType("SuperAdmin");

        List<Orders> ordersList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

            Orders orders = new Orders();
            orders.setOrderId(String.valueOf(i));
            orders.setOrderStatus("OrderPlaced");
            Payment payment = new Payment();
            payment.setPaymentType("Debit");
            orders.setPaymentType(payment);
            List<Orderedprod> orderedprodList = new ArrayList<>();
            Orderedprod orderedprod = new Orderedprod();
            orderedprod.setProdId("1");
            orderedprod.setProductName("sr");
            orderedprod.setProdTotalprice(500.78);
            orderedprod.setProdcount(12);
            orderedprodList.add(orderedprod);
            orders.setOrderedProds(orderedprodList);
            ordersList.add(orders);
        }

        orderManagement.setOrders(ordersList);

        deliveryBoy = deliveryBoyDirectory.addNewDeliveryBoy();
        deliveryBoy.setDeliveryBoyName("de");
        deliveryBoy.setOrderList(ordersList);

        
        customer = customerDirectory.addNewCustomer();
        customer.setUserName("abc");
        customer.setOrders(ordersList);
        customer.setCart(cart);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCustomerRegister = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        roadLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        genieLabel = new javax.swing.JLabel();
        scootLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        controlPanel.setPreferredSize(new java.awt.Dimension(1018, 700));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCustomerRegister.setText("Customer Register");
        btnCustomerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(btnCustomerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setMinimumSize(new java.awt.Dimension(200, 200));
        workArea.setPreferredSize(new java.awt.Dimension(1200, 700));

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CLICK 2 CART");

        lblDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails.setText("By Hrishikesh Pawar, Abhishek Nair and Roshan Dadlani");

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        genieLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        scootLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                        .addGap(0, 294, Short.MAX_VALUE)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetails)
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addComponent(genieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scootLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 272, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(roadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scootLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lblDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(roadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginJPanel loginJPanel = new LoginJPanel(cityDirectory, orderManagement, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(loginJPanel);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCustomerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerRegisterActionPerformed
        // TODO add your handling code here:
        CustomerRegistrationJPanel customerRegistrationJPanel = new CustomerRegistrationJPanel(cityDirectory, orderManagement, community, customerDirectory, companyDir, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(customerRegistrationJPanel);
    }//GEN-LAST:event_btnCustomerRegisterActionPerformed

    private void cityAdminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityAdminTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityAdminTestActionPerformed

    private void invAdminTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invAdminTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invAdminTestActionPerformed

    private void deliveryBoyRegistrationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryBoyRegistrationJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryBoyRegistrationJButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/aed_project", "root", "root");
//            //here sonoo is database name, root is username and password  
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from Inventory_Product");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerRegister;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel genieLabel;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel roadLabel;
    private javax.swing.JLabel scootLabel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}

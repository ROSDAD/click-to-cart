/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import java.text.DecimalFormat;
import javax.swing.JSplitPane;
import javax.swing.event.MouseInputListener;
import model.CityDir;
import model.CityDir;
import model.Community;
import model.Community;
import model.Company;
import model.Company;
import model.CompanyDirectory;
import model.CompanyDirectory;
import model.Customer;
import model.Customer;
import model.CustomerDirectory;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.Ordermgt;
import model.UserAuthenticationDirectory;
import model.UserAuthenticationDirectory;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import ui.MainCustomerJPanel;

/**
 *
 * @author rosha
 */
public class OrderCnfPanel extends javax.swing.JPanel {

    private Customer cust;
    private Company comp;
    private JSplitPane splitPane;
    private String cityName;
    private double distance;
    private double ETA;

    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private Ordermgt orderManagement;
    private String userName;
    private double dist;
    private CityDir cityDirectory;

    public OrderCnfPanel(double distance, String cityName, Customer cust, Company comp, JSplitPane splitPane, CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        this.cust = cust;
        this.comp = comp;
        this.splitPane = splitPane;
        this.cityName = cityName;
        this.distance = distance;
        this.cityDirectory = cityDirectory;
        this.userName = userName;
        this.community = community;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
        this.orderManagement = orderManagement;

        String companyName = comp.getCompanyName();
        init(companyName, cityName);
    }

    private void init(String companyName, String cityName) {

        TileFactoryInfo info = new OSMTileFactoryInfo();

        //TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer1.setTileFactory(tileFactory);

        //String latLongs[];
        try {

            JOpenCageGeocoder jO = new JOpenCageGeocoder("b530cbd50cd843c485a70dff613da0aa");

            JOpenCageForwardRequest request = new JOpenCageForwardRequest(companyName.concat(", " + cityName));
            //request.setRestrictToCountryCode("za"); // restrict results to a specific country

            JOpenCageResponse response = jO.forward(request);
            JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result
            System.out.println(firstResultLatLng.getLat().toString() + "," + firstResultLatLng.getLng().toString());

            GeoPosition geo = new GeoPosition(firstResultLatLng.getLat(), firstResultLatLng.getLng());
            //GeoPosition geo = new GeoPosition(Double.parseDouble(latLongs[0]),Double.parseDouble(latLongs[1]));

            jXMapViewer1.setAddressLocation(geo);
            jXMapViewer1.setZoom(2);

            MouseInputListener mm = new PanMouseInputListener(jXMapViewer1);
            jXMapViewer1.addMouseListener(mm);
            jXMapViewer1.addMouseMotionListener(mm);
            jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));

            ETA = 60 * (distance / 15.0);

            if (ETA >= 0 && ETA <= 60) {
                DecimalFormat df = new DecimalFormat("0.0");
                ETA = Double.parseDouble(df.format(ETA));

                lblETA.setText("ETA for your order is " + ETA + " minutes.");
            } else if (ETA > 60 && ETA <= 24 * 60) {

                DecimalFormat df = new DecimalFormat("0.0");
                ETA = ETA / 60;
                ETA = Double.parseDouble(df.format(ETA));

                lblETA.setText("ETA for your order is " + ETA + " hours.");
            } else if (ETA > 24 * 60) {

                DecimalFormat df = new DecimalFormat("0.0");
                ETA = ETA / (60 * 24);
                ETA = Double.parseDouble(df.format(ETA));

                lblETA.setText("ETA for your order is " + ETA + " days.");
            }

//        DecimalFormat df = new DecimalFormat("0.0");
//        ETA = Double.parseDouble(df.format(ETA));
//        
//        lblETA.setText("ETA for your order is "+ETA+" minutes.");
        } catch (Exception e) {

            System.out.println(e);

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();
        lblETA = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUR ORDER IS CONFIRMED!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("We have sent you an order confirmation and receipt on your Email!");

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        lblETA.setText("                ");

        backButton.setText("Back ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblETA)
                    .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblETA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainCustomerJPanel mainCustomerJPanel = new MainCustomerJPanel(cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(mainCustomerJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    private javax.swing.JLabel lblETA;
    // End of variables declaration//GEN-END:variables
}

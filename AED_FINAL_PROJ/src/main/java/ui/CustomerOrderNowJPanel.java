/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.UserAuthenticationDirectory;
import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.Company;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoyDirectory;
import model.Ordermgt;
import model.UserAuthentication;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

/**
 *
 * @author Abhishek
 */
public class CustomerOrderNowJPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
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
     * Creates new form MainCustomerJPanel
     */
    public CustomerOrderNowJPanel() {
        initComponents();
    }

    public CustomerOrderNowJPanel(CityDir cityDirectory, String userName, Ordermgt orderManagement, Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
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
        populateCities();
    }


    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (unit == 'K') {
            dist = dist * 1.609344;
        } else if (unit == 'N') {
            dist = dist * 0.8684;
        }
        return (dist);
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

            DecimalFormat df = new DecimalFormat("0.00");

            dist = distance(firstResultLatLng.getLat(), firstResultLatLng.getLng(), 42.3398067, -71.0891717, 'M');
            dist = Double.parseDouble(df.format((dist)));

            lblDistance.setText("Distance from default address is " + dist + " miles.");

        } catch (Exception e) {

            System.out.println(e);

        }
    }

    /**
     * Populate the table cities rows from the arrayList.
     */
    private void populateCities() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (City city : cityDirectory.getCityDir()) {
            Object[] row = new Object[1];
            row[0] = city.getCityName();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        orderNowjButton = new javax.swing.JButton();
        ViewCompany = new javax.swing.JButton();
        btnViewMap = new javax.swing.JButton();
        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();
        lblDistance = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Company Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        orderNowjButton.setText("Order Now");
        orderNowjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowjButtonActionPerformed(evt);
            }
        });

        ViewCompany.setText("View Company");
        ViewCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCompanyActionPerformed(evt);
            }
        });

        btnViewMap.setText("View on Map");
        btnViewMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        lblDistance.setText("                   ");

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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ViewCompany)
                        .addGap(39, 39, 39)
                        .addComponent(btnViewMap))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(lblDistance)
                        .addGap(674, 674, 674))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(orderNowjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDistance)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewCompany)
                    .addComponent(btnViewMap)
                    .addComponent(orderNowjButton))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderNowjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select city");
            return;
        }

        DefaultTableModel modelCity = (DefaultTableModel) jTable1.getModel();
        String selectedCityName = modelCity.getValueAt(selectedRowIndex, 0).toString();

        //Selected City Table
        int selectedRowIndexCompany = jTable2.getSelectedRow();
        if (selectedRowIndexCompany < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select company");
            return;
        }

        DefaultTableModel modelCompany = (DefaultTableModel) jTable2.getModel();
        String selectedCompany = modelCompany.getValueAt(selectedRowIndexCompany, 0).toString();

        Company companyObject = null;
        // For inserting the doctor to the doctor directory of the hospital.
        for (City city : cityDirectory.getCityDir()) {
            System.out.println(city.getCityName() + " " + selectedCityName);
            if (city.getCityName().equalsIgnoreCase(selectedCityName)) {
                for (Company company : city.getCompanyDirectory().getCompanyDirectoryList()) {
                    System.out.println(company.getCompanyName() + " " + selectedCompany);
                    if (company.getCompanyName().equalsIgnoreCase(selectedCompany)) {
                        companyObject = company;
                    }
                }
            }
        }

        Customer customerObject = null;
        for (Customer customer : customerDirectory.getCustomerList()) {
            System.out.println(customer.getUserName() + " " + userName);
            if (customer.getUserName().equalsIgnoreCase(userName)) {
                customerObject = customer;
            }
        }

        System.out.println(companyObject + " " + customerObject);

        for (int i = 0; i < userauthenticationdirectory.getUserAuthenticationList().size(); i++) {
            UserAuthentication userauthentication = userauthenticationdirectory.getUserAuthenticationList().get(i);
            if ("Customer".equalsIgnoreCase(userauthentication.getUserType())
                    && userauthentication.getUserName().equalsIgnoreCase(userName)) {
                userauthentication.setCityName(selectedCityName);
                userauthentication.setCompanyName(selectedCompany);
            }
        }

        ItemListPanel itemListPanel = new ItemListPanel(dist, selectedCityName, customerObject, companyObject , cityDirectory,  userName,  orderManagement,  community,  customerDirectory,  companyDirectory,  userauthenticationdirectory,  splitPane,  deliveryBoyDirectory);

        splitPane.setRightComponent(itemListPanel);


    }//GEN-LAST:event_orderNowjButtonActionPerformed

    private void ViewCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCompanyActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select city");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String city = model.getValueAt(selectedRowIndex, 0).toString();
        List<City> cityList1 = cityDirectory.getCityDir();
        for (int i = 0; i < cityList1.size(); i++) {
            if (city.equalsIgnoreCase(cityList1.get(i).getCityName())) {
                if (cityList1.get(i).getCompanyDirectory() == null) {
                    List<Company> companyList = new ArrayList<>();
                    populateCompanies(companyList);
                } else {
                    List<Company> companyList = cityList1.get(i).getCompanyDirectory().getCompanyDirectoryList();
                    populateCompanies(companyList);
                }
            }
        }
    }//GEN-LAST:event_ViewCompanyActionPerformed

    private void btnViewMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMapActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select city");
            return;
        }

        DefaultTableModel modelCity = (DefaultTableModel) jTable1.getModel();
        String selectedCityName = modelCity.getValueAt(selectedRowIndex, 0).toString();

        //Selected City Table
        int selectedRowIndexCompany = jTable2.getSelectedRow();
        if (selectedRowIndexCompany < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to select company");
            return;
        }

        DefaultTableModel modelCompany = (DefaultTableModel) jTable2.getModel();
        String selectedCompany = modelCompany.getValueAt(selectedRowIndexCompany, 0).toString();

        init(selectedCompany, selectedCityName);

    }//GEN-LAST:event_btnViewMapActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MainCustomerJPanel mainCustomerJPanel = new MainCustomerJPanel(cityDirectory, userName, orderManagement, community, customerDirectory, companyDirectory, userauthenticationdirectory, splitPane, deliveryBoyDirectory);
        splitPane.setRightComponent(mainCustomerJPanel);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewCompany;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnViewMap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JButton orderNowjButton;
    // End of variables declaration//GEN-END:variables

    private void populateCompanies(List<Company> companyList) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Company company : companyList) {
            Object[] row = new Object[1];
            row[0] = company.getCompanyName();
            model.addRow(row);
        }
    }
}

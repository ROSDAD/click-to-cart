/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.net.*;
import com.byteowls.jopencage.JOpenCageGeocoder;
import com.byteowls.jopencage.model.JOpenCageForwardRequest;
import com.byteowls.jopencage.model.JOpenCageLatLng;
import com.byteowls.jopencage.model.JOpenCageResponse;
//import com.teamdev.jxmaps.Geocoder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import javax.swing.event.MouseInputListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.w3c.dom.Document;


/**
 *
 * @author hrish
 */
public class MapTest2 extends javax.swing.JPanel {

    /**
     * Creates new form MapTest2
     */
    public MapTest2() {
        initComponents();
        
        try {
            //String latLongs[] = getLatLongPositions(new String("Target Boston"));

            //System.out.println("Test 3");
            //System.out.println(latLongs[0]+", "+latLongs[1]);

            init();
        }
        catch(Exception e) {
        }
    }
//    
//    private void init() {
//        TileFactoryInfo info = new OSMTileFactoryInfo();
//        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
//        jXMapViewer1.setTileFactory(tileFactory);
//        
//        GeoPosition geo = new GeoPosition(42.3398741,-71.0897081);
//        jXMapViewer1.setAddressLocation(geo);
//        jXMapViewer1.setZoom(4);
//        
//        MouseInputListener mm = new PanMouseInputListener(jXMapViewer1);
//        jXMapViewer1.addMouseListener(mm);
//        jXMapViewer1.addMouseMotionListener(mm);
//        jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));
//    }
//    
    private void init() {
        
        TileFactoryInfo info = new OSMTileFactoryInfo();
        
        //TileFactoryInfo info = new OSMTileFactoryInfo();
        
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer1.setTileFactory(tileFactory);
        
        //String latLongs[];
                
        try {        
            
        JOpenCageGeocoder jO = new JOpenCageGeocoder("b530cbd50cd843c485a70dff613da0aa");
        
        JOpenCageForwardRequest request = new JOpenCageForwardRequest("Prathamesh Park");
        //request.setRestrictToCountryCode("za"); // restrict results to a specific country
        
        JOpenCageResponse response = jO.forward(request);
        JOpenCageLatLng firstResultLatLng = response.getFirstPosition(); // get the coordinate pair of the first result
        System.out.println(firstResultLatLng.getLat().toString() + "," + firstResultLatLng.getLng().toString());
        
          
            
            
        //String latLongs[] = getLatLongPositions(new String("Target Boston"));
        
        
        //System.out.println(latLongs[0]+", "+latLongs[1]);
        
        GeoPosition geo = new GeoPosition(firstResultLatLng.getLat(),firstResultLatLng.getLng());
        //GeoPosition geo = new GeoPosition(Double.parseDouble(latLongs[0]),Double.parseDouble(latLongs[1]));
        
        
        jXMapViewer1.setAddressLocation(geo);
        jXMapViewer1.setZoom(2);
        
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer1);
        jXMapViewer1.addMouseListener(mm);
        jXMapViewer1.addMouseMotionListener(mm);
        jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));
        }
        catch(Exception e) {
            
            System.out.println(e);
            
        }
    }
    
    public static String[] getLatLongPositions(String address) throws Exception
  {
      
      System.out.println("Test 4");
    int responseCode = 0;
    String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
    URL url = new URL(api);
    HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
    httpConnection.connect();
    responseCode = httpConnection.getResponseCode();
    
    System.out.println("Test 5");
    
    if(responseCode == 200)
    {
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
      Document document = builder.parse(httpConnection.getInputStream());
      XPathFactory xPathfactory = XPathFactory.newInstance();
      XPath xpath = xPathfactory.newXPath();
      XPathExpression expr = xpath.compile("/GeocodeResponse/status");
      String status = (String)expr.evaluate(document, XPathConstants.STRING);
      
      System.out.println("Test 5.1, status= "+status);
      
      if(status.equals("OK"))
      {
          System.out.println("Test 6");
          
         expr = xpath.compile("//geometry/location/lat");
         String latitude = (String)expr.evaluate(document, XPathConstants.STRING);
         expr = xpath.compile("//geometry/location/lng");
         String longitude = (String)expr.evaluate(document, XPathConstants.STRING);
         System.out.println("Test 7");
         return new String[] {latitude, longitude};
      }
      else
      {
         throw new Exception("Error from the API - response status: "+status);
      }
    }
    return null;
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jXMapViewer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    // End of variables declaration//GEN-END:variables
}

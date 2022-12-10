/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class to hold the community information.
 *
 * @author Abhishek
 */
public class Company {

    private String companyName;
    private String companyType;
    private long companyEmployeeCount;
    private InventoryMgt inventoryManagement;
    private Ordermgt orderMgt;
    private Ordermgt orderManagement;
    private DeliveryMgt deliveryManagement;

//    public Company(String companyName, String companyType, long companyEmployeeCount,InventoryMgt inventoryManagement) {
//        this.companyName = companyName;
//        this.companyType = companyType;
//        this.companyEmployeeCount = companyEmployeeCount;
//        this.inventoryManagement = inventoryManagement;
//    }

    public void setOrderMgt(Ordermgt orderMgt) {
        this.orderMgt = orderMgt;
    }
    
    

    public Ordermgt getOrderMgt() {
        return orderMgt;
    }


    
    

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public InventoryMgt getInventoryManagement() {
        return inventoryManagement;
    }

    public void setInventoryManagement(InventoryMgt inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public long getCompanyEmployeeCount() {
        return companyEmployeeCount;
    }

    public void setCompanyEmployeeCount(long companyEmployeeCount) {
        this.companyEmployeeCount = companyEmployeeCount;
    }

    public DeliveryMgt getDeliveryManagement() {
        return deliveryManagement;
    }

    public void setDeliveryManagement(DeliveryMgt deliveryManagement) {
        this.deliveryManagement = deliveryManagement;
    }

    public Ordermgt getOrderManagement() {
        return orderManagement;
    }

    public void setOrderManagement(Ordermgt orderManagement) {
        this.orderManagement = orderManagement;
    }

}

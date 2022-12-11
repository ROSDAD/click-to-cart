/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author rosha
 */
public class Orders {
//     = UUID.randomUUID().toString();

    private String orderId;
    private List<Orderedprod> orderedProds;
    private double finalPrice;
    private String address;
    private Payment payment;
    private String orderStatus;
    private boolean orderAdminApproval;
    private String customerId;
    private String previousOrderStatus;

    public Orders() {
        this.orderedProds = new ArrayList<>();
    }
    
    

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Orderedprod> getOrderedProds() {
        return orderedProds;
    }

    public void setOrderedProds(List<Orderedprod> orderedProds) {
        this.orderedProds = orderedProds;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Payment getPaymentType() {
        return payment;
    }

    public void setPaymentType(Payment payment) {
        this.payment = payment;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Orderedprod addNewOrderedProds() {
        Orderedprod ordProd = new Orderedprod();

        orderedProds.add(ordProd);
        return ordProd;

    }

    public boolean isOrderAdminApproval() {
        return orderAdminApproval;
    }

    public void setOrderAdminApproval(boolean orderAdminApproval) {
        this.orderAdminApproval = orderAdminApproval;
    }

    public String getPreviousOrderStatus() {
        return previousOrderStatus;
    }

    public void setPreviousOrderStatus(String previousOrderStatus) {
        this.previousOrderStatus = previousOrderStatus;
    }
    
    
}

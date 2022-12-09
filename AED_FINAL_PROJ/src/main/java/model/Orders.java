/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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
    private int finalPrice;
    private String address;
    private String paymentType;
    private String orderStatus;

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

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
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
}

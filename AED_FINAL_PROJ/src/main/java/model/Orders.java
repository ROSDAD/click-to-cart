/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author rosha
 */
public class Orders {
//     = UUID.randomUUID().toString();
    private String orderId;
    private Orderedprod orderedProds;
    private int finalPrice;
    private String address;
    private String paymentType;

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
    
    
    public void setOrderid(String orderId){
        this.orderId = orderId;
    }
    
    public String getOrderid(){
        return orderId;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    public void setOrderprods(Orderedprod orderedProds){
        this.orderedProds = orderedProds;
    }
    public Orderedprod getOrderedprods(){
        return orderedProds;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hrish
 */
public class Payment {
    
    private String paymentType;
    private float paymentLimit; //Cannot exceed this limit when using a particular type

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public float getPaymentLimit() {
        return paymentLimit;
    }

    public void setPaymentLimit(float paymentLimit) {
        this.paymentLimit = paymentLimit;
    }
    
    
            
    
}

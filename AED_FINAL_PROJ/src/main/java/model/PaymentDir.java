/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hrish
 */
public class PaymentDir {
    
    private ArrayList<Payment> paymentDir;

    public PaymentDir() {
        this.paymentDir = new ArrayList<Payment>();
    }

    public ArrayList<Payment> getPaymentDir() {
        return paymentDir;
    }

    public void setPaymentDir(ArrayList<Payment> paymentDir) {
        this.paymentDir = paymentDir;
    }
    
    public Payment addNewPayment() {
        Payment h = new Payment();
        paymentDir.add(h);
        return h;
    }
    
    public void deletePayment(Payment c) {
        paymentDir.remove(c);
    }
    
    public void updatePayment(Payment c, Payment u) {
        
        for(int i=0;i<paymentDir.size();i++) {
            
            if (paymentDir.get(i).equals(c)) {
                paymentDir.set(i,u);
            }
        }
    }
    
}

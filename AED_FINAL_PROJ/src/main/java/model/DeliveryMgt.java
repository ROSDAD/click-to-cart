/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hrish
 */
public class DeliveryMgt {
    
    private ArrayList<Delivery> deliveryMgt;
    
    public DeliveryMgt() {
        this.deliveryMgt = new ArrayList<Delivery>();
    }

    public ArrayList<Delivery> getDeliveryDir() {
        return deliveryMgt;
    }

    public void setDeliveryDir(ArrayList<Delivery> deliveryMgt) {
        this.deliveryMgt = deliveryMgt;
    }
    
    public Delivery addNewDelivery() {
        Delivery h = new Delivery();
        deliveryMgt.add(h);
        return h;
    }
    
    public void deleteDelivery(Delivery c) {
        deliveryMgt.remove(c);
    }
    
    public void updateDelivery(Delivery c, Delivery u) {
        
        for(int i=0;i<deliveryMgt.size();i++) {
            
            if (deliveryMgt.get(i).equals(c)) {
                deliveryMgt.set(i,u);
            }
        }
    }
}

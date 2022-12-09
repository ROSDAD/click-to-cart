/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 91961
 */
public class DeliveryBoyDirectory {

    private ArrayList<DeliveryBoy> deliveryBoyList;

    public DeliveryBoyDirectory() {
        this.deliveryBoyList = new ArrayList<>();
    }

    public List<DeliveryBoy> getDeliveryBoyList() {
        return deliveryBoyList;
    }

    public void setDeliveryBoyList(ArrayList<DeliveryBoy> deliveryBoyList) {
        this.deliveryBoyList = deliveryBoyList;
    }

    /**
     * Method to add an deliveryBoy to the delivery Boy list.
     *
     * @return {@link DeliveryBoy}
     */
    public DeliveryBoy addNewDeliveryBoy() {
        DeliveryBoy newDeliveryBoy = new DeliveryBoy();
        deliveryBoyList.add(newDeliveryBoy);
        return newDeliveryBoy;
    }

    /**
     * Method to delete the hospital based on the index of the list.
     *
     * @param index
     */
    public void deleteDeliveryBoy(DeliveryBoy c) {
        deliveryBoyList.remove(c);
    }
    
    public void updateDeliveryBoy(DeliveryBoy c, DeliveryBoy u) {
        
        for(int i=0;i<deliveryBoyList.size();i++) {
            
            if (deliveryBoyList.get(i).equals(c)) {
                deliveryBoyList.set(i,u);
            }
        }
    }

}

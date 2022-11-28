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
public class InventoryMgt {
    
    private ArrayList<Inventory> inventoryMgt;
    
    public InventoryMgt() {
        this.inventoryMgt = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getInventoryMgt() {
        return inventoryMgt;
    }

    public void setInventoryMgt(ArrayList<Inventory> inventoryMgt) {
        this.inventoryMgt = inventoryMgt;
    }
    
    public Inventory addNewInventory() {
        Inventory h = new Inventory();
        inventoryMgt.add(h);
        return h;
    }
    
    public void deleteInventory(Inventory c) {
        inventoryMgt.remove(c);
    }
    
    public void updateInventory(Inventory c, Inventory u) {
        
        for(int i=0;i<inventoryMgt.size();i++) {
            
            if (inventoryMgt.get(i).equals(c)) {
                inventoryMgt.set(i,u);
            }
        }
    }
}

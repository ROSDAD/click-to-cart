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
public class InventoryProductDir {
    
    private ArrayList<InventoryProduct> inventoryProductDir;

    public InventoryProductDir() {
        this.inventoryProductDir = new ArrayList<InventoryProduct>();
    }

    public ArrayList<InventoryProduct> getInventoryProductDir() {
        return inventoryProductDir;
    }

    public void setInventoryProductDir(ArrayList<InventoryProduct> inventoryProductDir) {
        this.inventoryProductDir = inventoryProductDir;
    }
    
    public InventoryProduct addNewInventoryProduct() {
        InventoryProduct h = new InventoryProduct();
        inventoryProductDir.add(h);
        return h;
    }
    
    public void deleteInventoryProduct(InventoryProduct c) {
        inventoryProductDir.remove(c);
    }
    
    public void updateInventoryProduct(InventoryProduct c, InventoryProduct u) {
        
        for(int i=0;i<inventoryProductDir.size();i++) {
            
            if (inventoryProductDir.get(i).equals(c)) {
                inventoryProductDir.set(i,u);
            }
        }
    }
    
}

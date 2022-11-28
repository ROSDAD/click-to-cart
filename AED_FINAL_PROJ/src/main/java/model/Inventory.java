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
public class Inventory {
    
    private int inventoryID;
    private String inventoryCategory;
    private InventoryProductDir inventoryProductDir;


    public void setInventoryCategory(String inventoryCategory) {
        this.inventoryCategory = inventoryCategory;
    }

    public InventoryProductDir getInventoryProductDir() {
        return inventoryProductDir;
    }

    public void setInventoryProductDir(InventoryProductDir inventoryProductDir) {
        this.inventoryProductDir = inventoryProductDir;
    }

    public int getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public String getinventoryCategory() {
        return inventoryCategory;
    }

    public String getInventoryCategory() {
        return inventoryCategory;
    }
    
    public void setinventoryCategory(String inventoryCategory) {
        this.inventoryCategory = inventoryCategory;
    }
    
}

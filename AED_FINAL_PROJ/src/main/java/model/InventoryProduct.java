/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.UUID;

/**
 *
 * @author hrish
 */
public class InventoryProduct {

   
    private String pid;
    private String productName;
    private float price;
    private int inventoryQty;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getInventoryQty() {
        return inventoryQty;
    }

    public void setInventoryQty(int inventoryQty) {
        this.inventoryQty = inventoryQty;
    }
}

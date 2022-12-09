/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rosha
 */
public class Ordermgt {
    private ArrayList<Orders> orders;
    private Cart cart;
    
    
    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public Orders addNewOrder() {
        Orders ord = new Orders();
        orders.add(ord);
        return ord;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
}

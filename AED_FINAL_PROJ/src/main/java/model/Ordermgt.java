/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rosha
 */
public class Ordermgt {
    private List<Orders> orders;
    private Cart cart;
    private PaymentDir paymentDir;

    public Ordermgt() {
        this.orders = new ArrayList<>();
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Orders addNewOrder() {
        Orders ord = new Orders();
        orders.add(ord);
        return ord;
    }
    public void setPaymentDir(PaymentDir paymentDir){
        this.paymentDir = paymentDir;
    }
    public PaymentDir getPaymentDir(){
        return paymentDir;
    }
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
}

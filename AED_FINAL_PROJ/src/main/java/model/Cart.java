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
public class Cart {

    private ArrayList<Orderedprod> cartProd;
    private double totalPrice;

    public Cart() {
        this.cartProd = new ArrayList<>();
    }

//    private CompanyDir companyDir;
//    private CommunityDir communityDir;
    public Orderedprod addNewCartProd() {
        Orderedprod ord = new Orderedprod();
        cartProd.add(ord);
        return ord;
    }

    public void deleteCartProd(Orderedprod objProd) {
        cartProd.remove(objProd);
    }

    public ArrayList<Orderedprod> getCartProd() {
        return cartProd;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}

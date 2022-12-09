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
    private String totalPrice;
    
    
//    private CompanyDir companyDir;
//    private CommunityDir communityDir;

    public Orderedprod addNewCartProd() {
        Orderedprod ord = new Orderedprod();
        cartProd.add(ord);
        return ord;
    }

    public ArrayList<Orderedprod> getCartProd() {
        return cartProd;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}

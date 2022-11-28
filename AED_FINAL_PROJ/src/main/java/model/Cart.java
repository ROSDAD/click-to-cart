/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rosha
 */
public class Cart {
    
    private Orderedprod cartProd;
    private String totalPrice;
    
//    private CompanyDir companyDir;
//    private CommunityDir communityDir;

    public Orderedprod getCartProd() {
        return cartProd;
    }

    public void setCartProd(Orderedprod cartProd) {
        this.cartProd = cartProd;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}

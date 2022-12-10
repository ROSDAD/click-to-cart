/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rosha
 */
public class Orderedprod {
    private String prodId;
    private int prodCount;
    private double prodTotalprice;
    
    public void setProdId(String prodId){
        this.prodId = prodId;
    }
    
    public String getProdid(){
        return prodId;
    }
    
    public void setProdcount(int prodCount){
        this.prodCount = prodCount;
    }
    public int getprodcount(){
        return prodCount;
    }
    
    public double getProdTotalprice() {
        return prodTotalprice;
    }

    public void setProdTotalprice(double prodTotalprice) {
        this.prodTotalprice = prodTotalprice;
    }
}

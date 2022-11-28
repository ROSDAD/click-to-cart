/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author rosha
 */
public class Orders {
//     = UUID.randomUUID().toString();
    private String orderId;
    private Orderedprod orderedProds;
    
    public void setOrderid(String orderId){
        this.orderId = orderId;
    }
    
    public String getOrderid(){
        return orderId;
    }
    
    public void setOrderprods(Orderedprod orderedProds){
        this.orderedProds = orderedProds;
    }
    public Orderedprod getOrderedprods(){
        return orderedProds;
    }
    
}

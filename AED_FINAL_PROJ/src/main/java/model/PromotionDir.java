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
public class PromotionDir {
    
    private ArrayList<Promotion> promotionDir;

    public PromotionDir() {
        this.promotionDir = new ArrayList<Promotion>();
    }

    public ArrayList<Promotion> getPromotionDir() {
        return promotionDir;
    }

    public void setPromotionDir(ArrayList<Promotion> promotionDir) {
        this.promotionDir = promotionDir;
    }
    
    public Promotion addNewPromotion() {
        Promotion h = new Promotion();
        promotionDir.add(h);
        return h;
    }
    
    public void deletePromotion(Promotion c) {
        promotionDir.remove(c);
    }
    
    public void updatePromotion(Promotion c, Promotion u) {
        
        for(int i=0;i<promotionDir.size();i++) {
            
            if (promotionDir.get(i).equals(c)) {
                promotionDir.set(i,u);
            }
        }
    }
}

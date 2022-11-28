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
public class CityDir {
    
    private ArrayList<City> cityDir;
    
    public CityDir() {
        this.cityDir = new ArrayList<City>();
    }

    public ArrayList<City> getCityDir() {
        return cityDir;
    }

    public void setCityDir(ArrayList<City> cityDir) {
        this.cityDir = cityDir;
    }
    
    public City addNewCity() {
        City h = new City();
        cityDir.add(h);
        return h;
    }
    
    public void deleteCity(City c) {
        cityDir.remove(c);
    }
    
    public void updateCity(City c, City u) {
        
        for(int i=0;i<cityDir.size();i++) {
            
            if (cityDir.get(i).equals(c)) {
                cityDir.set(i,u);
            }
        }
    }
}

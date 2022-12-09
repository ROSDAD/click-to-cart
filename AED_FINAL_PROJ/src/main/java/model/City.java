/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hrish
 */
public class City {
    
    private String cityName;
    private int population;
    private String cityType;
    private CompanyDirectory companyDirectory;

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }

    public CompanyDirectory getCompanyDirectory() {
        return companyDirectory;
    }

    public void setCompanyDirectory(CompanyDirectory companyDirectory) {
        this.companyDirectory = companyDirectory;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

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
    private CompanyDir companyDir;
    private CommunityDir communityDir;

    public String getCityType() {
        return cityType;
    }

    public void setCityType(String cityType) {
        this.cityType = cityType;
    }
    
    

    public CompanyDir getCompanyDir() {
        return companyDir;
    }

    public void setCompanyDir(CompanyDir companyDir) {
        this.companyDir = companyDir;
    }

    public CommunityDir getCommunityDir() {
        return communityDir;
    }

    public void setCommunityDir(CommunityDir communityDir) {
        this.communityDir = communityDir;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class to hold the community information.
 *
 * @author Abhishek
 */
public class Company {

    private String companyName;
    private String companyType;
    private CommunityDirectory communityDirectory;
    private InventoryMgt inventoryManagement;

    public Company(String companyName, String companyType, CommunityDirectory communityDirectory, InventoryMgt inventoryManagement) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.inventoryManagement = inventoryManagement;
    }

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    
    public InventoryMgt getInventoryManagement() {
        return inventoryManagement;
    }

    public void setInventoryManagement(InventoryMgt inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }



}

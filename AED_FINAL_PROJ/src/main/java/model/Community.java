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
public class Community {

    private String communityName;
    private String majorityReligion;
    private String communityType;
    private CustomerDirectory customerDirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;

    public Community(String communityName, String majorityReligion, String communityType, CustomerDirectory personDiretory,DeliveryBoyDirectory deliveryBoyDirectory) {
        this.communityName = communityName;
        this.majorityReligion = majorityReligion;
        this.communityType = communityType;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
    }

    public Community() {
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getMajorityReligion() {
        return majorityReligion;
    }

    public void setMajorityReligion(String majorityReligion) {
        this.majorityReligion = majorityReligion;
    }

    public String getCommunityType() {
        return communityType;
    }

    public void setCommunityType(String communityType) {
        this.communityType = communityType;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryBoyDirectory getDeliveryBoyDirectory() {
        return deliveryBoyDirectory;
    }

    public void setDeliveryBoyDirectory(DeliveryBoyDirectory deliveryBoyDirectory) {
        this.deliveryBoyDirectory = deliveryBoyDirectory;
    }


}

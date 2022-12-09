/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model class to get the delivery Boy information.
 *
 * @author Abhishek
 */
public class DeliveryBoy extends Person {

    private String deliveryBoyName;
    private long emergencyContactNumber;
    private String qualificaton;
    private int yearOfDeliveryExperience;

    public DeliveryBoy() {
    }

    public DeliveryBoy(String deliveryBoyName, long emergencyContactNumber, String qualificaton, int yearOfDeliveryExperience, String firstName, String lastName, String gender, int age, String emailAddress, String phoneNumber) {
        super(firstName, lastName, gender, age, emailAddress, phoneNumber);
        this.deliveryBoyName = deliveryBoyName;
        this.emergencyContactNumber = emergencyContactNumber;
        this.qualificaton = qualificaton;
        this.yearOfDeliveryExperience = yearOfDeliveryExperience;
    }

    public String getDeliveryBoyName() {
        return deliveryBoyName;
    }

    public void setDeliveryBoyName(String deliveryBoyName) {
        this.deliveryBoyName = deliveryBoyName;
    }

    public long getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(long emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getQualificaton() {
        return qualificaton;
    }

    public void setQualificaton(String qualificaton) {
        this.qualificaton = qualificaton;
    }

    public int getYearOfDeliveryExperience() {
        return yearOfDeliveryExperience;
    }

    public void setYearOfDeliveryExperience(int yearOfDeliveryExperience) {
        this.yearOfDeliveryExperience = yearOfDeliveryExperience;
    }

}

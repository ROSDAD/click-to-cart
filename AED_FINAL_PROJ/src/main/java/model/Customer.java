/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model class to get the customer information.
 *
 * @author Abhishek
 */
public class Customer extends Person {

    private String customerName;
    private String customerId;
    private String customerNearestLandmark;
    private String customerAddress;
    private String userName;
    private String password;

    public Customer() {
    }

    public Customer(String customerName, String customerId, String customerAddress, String customerNearestLandmark, String userName, String password, String firstName, String lastName, String gender, int age, String emailAddress, String phoneNumber) {
        super(firstName, lastName, gender, age, emailAddress, phoneNumber);
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerNearestLandmark = customerNearestLandmark;
        this.customerAddress = customerAddress;
        this.userName = userName;
        this.password = password;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNearestLandmark() {
        return customerNearestLandmark;
    }

    public void setCustomerNearestLandmark(String customerNearestLandmark) {
        this.customerNearestLandmark = customerNearestLandmark;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

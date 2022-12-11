/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Class to get the user authentication details from the user.
 *
 * @author Abhishek
 */
public class UserAuthentication {

    private String userName;
    private String password;
    private String userType;
    private String companyName;
    private String cityName;

    public UserAuthentication() {
    }

    public UserAuthentication(String userName, String password, String userType, String companyName, String cityName) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.companyName = companyName;
        this.cityName = cityName;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

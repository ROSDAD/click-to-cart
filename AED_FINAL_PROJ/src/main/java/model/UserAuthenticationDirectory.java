/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to add authentication of user to the user Authentication Directory.
 *
 * @author Abhishek
 */
public class UserAuthenticationDirectory {

    private List<UserAuthentication> userAuthenticationList;

    public UserAuthenticationDirectory() {
        userAuthenticationList = new ArrayList<>();
    }

    public List<UserAuthentication> getUserAuthenticationList() {
        return userAuthenticationList;
    }

    public void setUserAuthenticationList(List<UserAuthentication> userAuthenticationList) {
        this.userAuthenticationList = userAuthenticationList;
    }

    /**
     * Method to add a user credential to the credential list.
     *
     * @return {@link UserAuthentication}
     */
    public UserAuthentication addNewUserAuthentication() {
        UserAuthentication newUserAuth = new UserAuthentication();
        userAuthenticationList.add(newUserAuth);
        return newUserAuth;
    }

    /**
     * Method to delete the credential based on the index of the list.
     *
     * @param index
     */
    public void deleteUserAuthentication(UserAuthentication index) {
        userAuthenticationList.remove(index);
    }

}

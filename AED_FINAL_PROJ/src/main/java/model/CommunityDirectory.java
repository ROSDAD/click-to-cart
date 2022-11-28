/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author hrish
 */  


/**
 * Class to hold the directory of communities.
 *
 * @author Abhishek
 */
public class CommunityDirectory {

    private List<Community> communityDirectoryList;

    public CommunityDirectory() {
        communityDirectoryList = new ArrayList<>();
    }

    public List<Community> getCommunityDirectoryList() {
        return communityDirectoryList;
    }

    public void setCommunityDirectoryList(List<Community> communityDirectoryList) {
        this.communityDirectoryList = communityDirectoryList;
    }

    /**
     * Method to add a house to the house list.
     *
     * @return {@link Community}
     */
    public Community addNewCommunity() {
        Community newCommunity = new Community();
        communityDirectoryList.add(newCommunity);
        return newCommunity;
    }

    /**
     * Method to delete the community based on the index of the list.
     *
     * @param index
     */
    public void deleteCommunity(int index) {

        communityDirectoryList.remove(index);
    }
}

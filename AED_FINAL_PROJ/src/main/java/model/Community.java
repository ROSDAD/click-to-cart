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
    private PersonDirectory personDiretory;

    public Community(String communityName, String majorityReligion, String communityType, PersonDirectory personDiretory) {
        this.communityName = communityName;
        this.majorityReligion = majorityReligion;
        this.communityType = communityType;
        this.personDiretory = personDiretory;
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

    public PersonDirectory getPersonDiretory() {
        return personDiretory;
    }

    public void setPersonDiretory(PersonDirectory personDiretory) {
        this.personDiretory = personDiretory;
    }

}

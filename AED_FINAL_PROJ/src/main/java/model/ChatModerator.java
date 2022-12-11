/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Model class to get the chat moderator information.
 *
 * @author Abhishek
 */
public class ChatModerator  {

    private String chatModeratorName;
    private String emergencyContactName;
    private String qualificaton;
    private int moderatorExperience;

    public ChatModerator() {
    }

    public ChatModerator(String chatModeratorName, String emergencyContactName, String qualificaton, int moderatorExperience) {
        this.chatModeratorName = chatModeratorName;
        this.emergencyContactName = emergencyContactName;
        this.qualificaton = qualificaton;
        this.moderatorExperience = moderatorExperience;
    }

    public String getChatModeratorName() {
        return chatModeratorName;
    }

    public void setChatModeratorName(String chatModeratorName) {
        this.chatModeratorName = chatModeratorName;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getQualificaton() {
        return qualificaton;
    }

    public void setQualificaton(String qualificaton) {
        this.qualificaton = qualificaton;
    }

    public int getModeratorExperience() {
        return moderatorExperience;
    }

    public void setModeratorExperience(int moderatorExperience) {
        this.moderatorExperience = moderatorExperience;
    }

}

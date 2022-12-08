/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 91961
 */
public class PersonDirectory {
    
    private List<Person> personList;
    
    
    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    
    
      /**
     * Method to add an hospital to the hospital list.
     *
     * @return {@link Hospital}
     */
    public Person addNewPerson() {
        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    }

    /**
     * Method to delete the hospital based on the index of the list.
     *
     * @param index
     */
    public void deletePerson(int index) {
        personList.remove(index);
    }
    
}

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
public class CustomerDirectory {

    private List<Customer> customerList;

    public CustomerDirectory() {
        this.customerList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    /**
     * Method to add an customer to the customer list.
     *
     * @return {@link Customer}
     */
    public Customer addNewCustomer() {
        Customer newCustomer = new Customer();
        customerList.add(newCustomer);
        return newCustomer;
    }

    /**
     * Method to delete the hospital based on the index of the list.
     *
     * @param index
     */
    public void deleteCustomer(int index) {
        customerList.remove(index);
    }

}

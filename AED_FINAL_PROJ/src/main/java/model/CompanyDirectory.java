/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import model.Company;

/**
 * Class to hold the directory of companies.
 *
 * @author Abhishek
 */
public class CompanyDirectory {

    private List<Company> companyDirectoryList;

    public CompanyDirectory() {
        this.companyDirectoryList = new ArrayList<>();
    }

    public List<Company> getCompanyDirectoryList() {
        return companyDirectoryList;
    }

    public void setCompanyDirectoryList(List<Company> companyDirectoryList) {
        this.companyDirectoryList = companyDirectoryList;
    }


    /**
     * Method to add a company to the company list.
     *
     * @return {@link Company}
     */
    public Company addNewCompany() {
        Company newCompany = new Company();
        companyDirectoryList.add(newCompany);
        return newCompany;
    }

    /**
     * Method to delete the company based on the index of the list.
     *
     * @param index
     */
    public void deleteCompany(int index) {
        companyDirectoryList.remove(index);
    }
}

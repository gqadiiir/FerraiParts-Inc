/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ferrariadmin;

import com.mycompany.ferrariadmin.JavaData.Customer;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author qadirnazir
 */
      public class SharedCustomerModel {
    private static SharedCustomerModel instance = new SharedCustomerModel();
    private ObservableList<Customer> customerData;

    private SharedCustomerModel() {
        customerData = FXCollections.observableArrayList();
    }

    public static SharedCustomerModel getInstance() {
        return instance;
    }

    public ObservableList<Customer> getCustomerData() {
        return customerData;
    }

    public void addCustomer(Customer customer) {
        customerData.add(customer);
    }
}
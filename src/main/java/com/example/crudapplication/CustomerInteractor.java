package com.example.crudapplication;

public class CustomerInteractor {

    private CustomerModel model;

    public CustomerInteractor(CustomerModel model) {
        this.model = model;
    }

    public void saveCustomer() {
        System.out.println("Savings account: " + model.getAccountNumber() + " Name: " + model.getCustomerName());
    }

    Customer createCustomerFromModel() {
        Customer customer = new Customer();
        customer.setAccountNumber(model.getAccountNumber());
        customer.setName(model.getCustomerName());
        return customer;
    }
}

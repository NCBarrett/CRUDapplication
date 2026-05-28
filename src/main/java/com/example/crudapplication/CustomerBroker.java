package com.example.crudapplication;

public class CustomerBroker {

    private final CustomerDAO dao = new CustomerDAO();

    int saveCustomer(Customer customer) {
        return dao.saveCustomer(createCustomerDTO(customer));
    }

    public CustomerDTO createCustomerDTO(Customer customer) {
        return new CustomerDTO(customer.getAccountNumber(), customer.getName());
    }
}

package com.example.crudapplication;

import java.util.HashMap;
import java.util.Map;

public class CustomerDAO {

    static CustomerDatabase customerDatabase = new CustomerDatabase();

    public int saveCustomer(CustomerDTO customerRecord) {
        return customerDatabase.saveCustomer(createCustomerRecord(customerRecord));
    }

    public Map<String, String> createCustomerRecord(CustomerDTO customer) {
        Map<String, String> customerRecord = new HashMap<>();
        customerRecord.put("full_name", customer.getFullName());
        customerRecord.put("account_number", customer.getAccountNumber());
        return customerRecord;
    }
}

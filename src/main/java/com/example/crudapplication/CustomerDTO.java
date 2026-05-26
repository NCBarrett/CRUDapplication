package com.example.crudapplication;

public class CustomerDTO {

    private String accountNumber = "";
    private String fullName = "";

    public CustomerDTO(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.fullName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

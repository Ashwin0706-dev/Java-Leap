package com.example.boot1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

    @Id
    private int accountNumber;

    private String name;

    private double balance;

    // Default constructor
    public BankAccount() {
    }

    // Getters and Setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
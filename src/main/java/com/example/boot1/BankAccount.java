package com.example.boot1;

public class BankAccount {
    private Long userId;
    private String accountHolderName;
    private String accountNumber;
    private Double balance;

    // Default Constructor
    public BankAccount() {}

    // Parameterized Constructor
    public BankAccount(Long userId, String accountHolderName, String accountNumber, Double balance) {
        this.userId = userId;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
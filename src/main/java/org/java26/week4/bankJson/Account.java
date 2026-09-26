package org.java26.week4.bankJson;

public class Account {
    public String owner;
    public int accountNumber;
    public int balance;
    public int amount;
    public String  currency;
    public TransactionType type;

    public Account(){};

    public Account(String owner, int accountNumber, int balance, int amount, String currency, TransactionType type ){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
        this.currency = currency;
        this.type = type;
    }
}

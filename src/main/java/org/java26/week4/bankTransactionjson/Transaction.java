package org.java26.week4.bankTransactionjson;

public class Transaction {

    public int id;
    public int accountNumber;
    public String currency;
    public int amount;
    public TransactionTypes type;

    public Transaction(){};

    public Transaction(int id, int accountNumber, String currency, int amount, TransactionTypes type){
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.type = type;
    }

}

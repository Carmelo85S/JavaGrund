package org.java26.week4.bankTransactionjson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a Java program that manages bank transactions using Jackson and JSON.
        //
        // 1. Create Transaction and TransactionType classes.
        // 2. Create at least 3 transactions and save them to transactions.json.
        // 3. Create loadTransactions(Path path) to load the transactions.
        //    Catch IOException, print an error message, and return an empty list.
        // 4. Print the loaded transactions.
        // 5. Create calculateBalance() to calculate the balance from the transactions.


        // Create three transactions
        Transaction person1 = new Transaction(
                124354,
                42424244,
                "€",
                21900,
                TransactionTypes.DEPOSIT
        );

        Transaction person2 = new Transaction(
                123545,
                43428124,
                "NOK",
                11000,
                TransactionTypes.TRANSFER
        );

        Transaction person3 = new Transaction(
                110003,
                44502678,
                "SEK",
                20500,
                TransactionTypes.WITHDRAW
        );


        // Create the path to the JSON file
        Path path = Path.of("transactions.json");


        // Create a list and add the transactions
        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(person1);
        transactionList.add(person2);
        transactionList.add(person3);


        // Create an ObjectMapper to convert Java objects to JSON
        ObjectMapper mapper = new ObjectMapper();


        // Save the transaction list to the JSON file
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(path.toFile(), transactionList);

        }
            catch (IOException e) {
                System.out.println("Not possible to save accounts: " + path);
                e.printStackTrace();
            }
            System.out.println("Could not save transactions: " + path);



        // Load the transactions from the JSON file
        List<Transaction> transactionLoaded = loadTransactions(path);


        // Print the loaded transactions
        for (Transaction transaction : transactionLoaded) {

            System.out.printf(
                    "ID: %-10d Account: %-12d Currency: %-5s Amount: %-10d Type: %-10s%n",
                    transaction.id,
                    transaction.accountNumber,
                    transaction.currency,
                    transaction.amount,
                    transaction.type
            );
        }


        // Calculate the balance from all transactions
        double balance = calculateBalance(transactionLoaded);


        // Print the calculated balance
        System.out.println("======================");
        System.out.printf("Balance: %.2f%n", balance);
    }


    // Load transactions from the JSON file
    public static List<Transaction> loadTransactions(Path path) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            return mapper.readValue(
                    path.toFile(),
                    new TypeReference<List<Transaction>>() {}
            );

        } catch (IOException e) {

            System.out.println("Not possible to load file: " + path);

            return new ArrayList<>();
        }
    }


    // Calculate the balance from the transactions
    public static double calculateBalance(List<Transaction> transactions) {

        double balance = 0;

        for (Transaction transaction : transactions) {

            switch (transaction.type) {

                case DEPOSIT -> balance += transaction.amount;

                case WITHDRAW -> balance -= transaction.amount;

                case TRANSFER -> balance -= transaction.amount;
            }
        }

        return balance;
    }
}
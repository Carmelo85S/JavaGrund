package org.java26.week4.bankJson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("bank-transaction.json");
        ObjectMapper mapper = new ObjectMapper();
        List<Account> accountList = new ArrayList<>();
        Account person1 = new Account("Carmelo", 123456, 25000, 1800, "SEK", TransactionType.DEPOSIT);
        Account person2 = new Account("Angelica", 372145, 28900, 2500, "SEK", TransactionType.INVESTMENT);

        accountList.add(person1);
        accountList.add(person2);

        saveList(path, mapper, accountList);

        System.out.println("Person 1 :" + person1.owner);
        System.out.println(" - Account number: " + person1.accountNumber);
        System.out.println(" - Balance: " + person1.balance);
        System.out.println(" - Transaction type: " + person1.type);
        System.out.println(" - Amount: " + person1.amount);
        System.out.println("----------------------------");
        System.out.println("Available: " + (person1.balance - person1.amount));

        System.out.println();
        System.out.println();
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");

        System.out.printf(
                "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n",
                "Owner",
                "Account number",
                "Balance",
                "Type",
                "Amount",
                "Available"
        );

        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");

        System.out.printf(
                "| %-15s | %-15d | %-15d | %-15s | %-15d | %-15d |%n",
                person1.owner,
                person1.accountNumber,
                person1.balance,
                person1.type,
                person1.amount,
                person1.balance - person1.amount
        );

        System.out.printf(
                "| %-15s | %-15d | %-15d | %-15s | %-15d | %-15d |%n",
                person2.owner,
                person2.accountNumber,
                person2.balance,
                person2.type,
                person2.amount,
                person2.balance - person2.amount
        );

        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
    }


    public static void saveList(
            Path path,
            ObjectMapper mapper,
            List<Account> accountList
    ) {
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(path.toFile(), accountList);

            System.out.println("Accounts saved successfully.");
            System.out.println("----------------------------");

        } catch (IOException e) {
            System.out.println("Not possible to save to file " + path);
        }
    }

    public static List<Account> loadList(ObjectMapper mapper, Path path) {
        try {
            return mapper.readValue(path.toFile(), new TypeReference<List<Account>>() {
            });
        } catch (IOException e) {
            System.out.println("Not possible to load file " + path);
            return new ArrayList<>();
        }

    }
}

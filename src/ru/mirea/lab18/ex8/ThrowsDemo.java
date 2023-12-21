package ru.mirea.lab18.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        boolean validInput = false;

        while (!validInput) {
            try {
                Scanner myScanner = new Scanner(System.in);
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }
}


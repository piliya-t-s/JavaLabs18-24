package ru.mirea.lab18.ex7;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getKey();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

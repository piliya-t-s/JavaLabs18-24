package ru.mirea.lab18.ex4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}


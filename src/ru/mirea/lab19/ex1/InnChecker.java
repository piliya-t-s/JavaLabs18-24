package ru.mirea.lab19.ex1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class InnChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            validate(inn);
            System.out.println("ИНН действителен.");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static class InvalidInnException extends Exception {
        public InvalidInnException(String message) {
            super(message);
        }
    }

    private static void validate(String inn) throws InvalidInnException {
        String innPattern = "\\d{12}";

        Pattern pattern = Pattern.compile(innPattern);
        Matcher matcher = pattern.matcher(inn);

        if (!matcher.matches()) {
            throw new InvalidInnException("Недействительный ИНН. ИНН должен состоять из 12 цифр.");
        }
    }
}


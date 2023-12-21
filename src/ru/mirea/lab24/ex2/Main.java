package ru.mirea.lab24.ex2;

public class Main {
    public static void main(String[] args) {
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        Client client = new Client();

        Chair victorianChair = victorianChairFactory.createChair();
        Chair multifunctionalChair = multifunctionalChairFactory.createChair();
        Chair magicChair = magicChairFactory.createChair();

        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}


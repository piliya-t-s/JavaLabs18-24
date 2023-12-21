package ru.mirea.lab24.ex2;

class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

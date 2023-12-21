package ru.mirea.lab24.ex2;

class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}

package ru.mirea.lab24.ex2;

class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}

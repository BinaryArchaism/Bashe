package com.mygdx.game;


public class Human extends Gamer{
    Model model;
    private int countOfTaken;
    private int[] choised;

    public Human(Model model) {
        super(model);
    }

    @Override
    public int[] deleted() {
        return new int[0];
    }

    @Override
    public int[] choised() {
        return new int[0];
    }

    public int getCountOfTaken() {
        return countOfTaken;
    }

    public void clearTake() {
        countOfTaken = 0;
    }

    public void addChoised() {
        countOfTaken++;
    }
}

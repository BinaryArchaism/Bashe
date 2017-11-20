package com.mygdx.game;

public abstract class Gamer {
    Model model;

    public Gamer(Model model){
        this.model = model;
    }
    public abstract int[] deleted();

    public abstract int[] choised();
}

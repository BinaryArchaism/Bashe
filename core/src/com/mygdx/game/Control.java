package com.mygdx.game;

import java.util.Random;

public class Control {

    Model model;

    public Control(Model model) {
        this.model = model;
    }

    public void buttonClicked() {

    }

    public boolean isFirstHuman() {
        return (new Random()).nextBoolean();
    }

    public void queue(int[] sticks) {
        for (int i = 0; i < sticks.length; i++)
            model.delStick(i);

    }

}

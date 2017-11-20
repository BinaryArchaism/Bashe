package com.mygdx.game;

import java.util.Random;

public class Ai extends Gamer {
    Random rand;

    public Ai(Model model) {
        super(model);
        rand = new Random();
    }

    public int[] choised(){
        return model.getRandSticks(step(model.getN()));

    }

    public int[] deleted(){
        return model.getRandSticks(step(model.getN()));
    }

    private int step(int n){
        int s = n % (model.getM()+1);
        if (s != 0) return s;
        else
            return rand.nextInt(model.getM());
    }
}

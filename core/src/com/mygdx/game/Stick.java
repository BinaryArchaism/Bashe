package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Stick {
    Texture stickTex;
    private int number;

    public Stick(int num) {
        this.stickTex = new Texture(Gdx.files.internal("palochka.png"));
        number = num;
    }

    public Texture getStickTex() {
        return stickTex;
    }

    public int getNumber() {
        return number;
    }
}

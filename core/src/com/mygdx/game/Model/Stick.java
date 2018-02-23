package com.mygdx.game.Model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Stick {
    Texture stickTex;
    private Vector2 pos;
    private boolean choised;

    public Stick(int x, int y) {
        this.stickTex = new Texture(Gdx.files.internal("palochka.png"));
        pos = new Vector2(x, y);
    }

    public Vector2 getPos() {
        return pos;
    }

    public Texture getStickTex() {
        return stickTex;
    }

    public void setChoised() {
        if (choised == false) {
            this.choised = true;
            pos.y += 30;
        }
        else setDeleted();
    }
    public void setDeleted() {
        if (choised == true) {
            this.choised = false;
            pos.y -= 30;
        }
    }
    public void setConfirmed() {
            pos.y -= 400;
    }
}

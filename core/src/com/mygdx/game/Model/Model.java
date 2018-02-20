package com.mygdx.game.Model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Model {
    private Stick[] sticks;
    final int N = 16;

    public Model() {
        sticks = new Stick[N];
        for (int i = 0; i < N; i++) {
            sticks[i] = new Stick(35 + i*50, 95);
        }
    }

    public void choiseStick(int i) {
        sticks[i].setChoised();
    }

    public void render(SpriteBatch batch){
        for (int i = 0; i < N; i++) {
            batch.draw(sticks[i].getStickTex(), sticks[i].getPos().x, sticks[i].getPos().y);
        }
    }
    public int inSticks(Vector2 vect){
        for (int i = 0; i < N ; i++) {
            Vector2 v = vect.cpy().sub(sticks[i].getPos());
            if (v.x >= 0 && v.x <= sticks[i].getStickTex().getWidth() && v.y >= 0 && v.y <= sticks[i].getStickTex().getHeight())
                return i;
        }
        return -1;
    }
    public void delStick(int i) {
        sticks[i].setConfirmed();
    }
}

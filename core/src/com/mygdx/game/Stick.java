package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Stick {
    Vector2 pos;
    private static Texture stickTex;
    private boolean choised;
    private boolean deleted;

    public Stick(Vector2 pos) {
        this.pos = pos;
        choised = true;
        deleted = false;
    }

    public boolean isChoised() {
        return choised;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public static Texture getStickTex() {
        return stickTex;
    }

    public Vector2 getPos() {
        return pos;
    }

    public void choiceStick(){
        choised = !choised;
        if (!choised)
            pos.y =  pos.y - stickTex.getHeight()*1/5;
        else
            pos.y =  pos.y + stickTex.getHeight()*1/5;
    }

    public void delStick(){
        if (!choised) {
            deleted = true;
            setTexture(new Texture("fon.jpg"));
        }
    }

    public static void setTexture(Texture texture){
        Stick.stickTex = texture;
    }

    public void render(SpriteBatch batch){
        batch.draw(stickTex, pos.x, pos.y);
    }
}

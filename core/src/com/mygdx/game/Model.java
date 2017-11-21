package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Model {
    final int N;
    int n;
    int m;
    Stick [] sticks;
    int space ;
    Texture myOk;

    public Model(int n, int m) {
        this.N = n;
        this.n = n;
        this.m = m;
        sticks = new Stick[n];
        myOk = new Texture("ok2.jpg");

        space = (Gdx.graphics.getWidth() - 20)  / n;
        for (int i = 0; i < n; i++) {
            sticks[i] = new Stick(new Vector2(i * space +20,Gdx.graphics.getHeight()*1/4) );
            sticks[i].setTexture(new Texture("stick.jpg"));
        }
    }

    public Vector2 getSticks(int i) {
        return sticks[i].getPos();
    }

    public int inSticks(Vector2 vect){
        for (int i = 0; i < N ; i++) {
            Vector2 v = vect.cpy().sub(sticks[i].getPos());
            if (v.x >= 0 && v.x <= Stick.getStickTex().getWidth() && v.y >= 0 && v.y <= Stick.getStickTex().getHeight())
                return i;
        }
        return -1;
    }

    public boolean inOK(Vector2 vect) {

        
    }

    public int getN(){return n;}

    public int getM() {return m; }

    public void delSticks(int[] delStiks){
        for (int i = 0; i < delStiks.length ; i++) {
            delStick(i);
        }
    }

    public void delStick(int num){
        sticks[num].delStick();
        n--;
    }

    public void choiceSticks(int[] delStiks){
        for (int i = 0; i < delStiks.length ; i++) {
            choiceStick(i);
        }
    }

    public void choiceStick(int num){
        sticks[num].choiceStick();
    }


    public int[] getRandSticks(int count){
        Random rand = new Random();
        int []result = new int[count];
        int []indx = new int[n];

        for (int i = 0, k = 0; i < N; i++) {
            if (!sticks[i].isDeleted())
                indx[k++] = i;
        }

        int k;
        for (int i = 0; i < n; i++) {
            do {
                k = rand.nextInt(n);
            }
            while (indx[k] != -1);
            result[i] = indx[k];
            indx[k] = -1;
        }
        return result;
    }

    public void render(SpriteBatch batch){
        for (int i = 0; i < N; i++) {
            sticks[i].render(batch);
        }
        batch.draw(myOk, Gdx.graphics.getWidth()/6, Gdx.graphics.getHeight()*1/50);
    }
}

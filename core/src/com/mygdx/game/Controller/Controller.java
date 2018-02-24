package com.mygdx.game.Controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Model.Model;

public class Controller {

	Model model;

	public Controller() {
		model = new Model();
	}

	public void controllerUpdate(SpriteBatch batch) {
		model.render(batch);
		int confirmed[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		if (Gdx.input.justTouched()) {
		    int f = 0;
            if (model.inSticks(getMousepos()) != -1) {
                model.choiseStick(model.inSticks(getMousepos()));
                if (f == 0) {confirmed[model.inSticks(getMousepos())] = 1; f=1;}
                else {confirmed[model.inSticks(getMousepos())] = 0; f=0;}

            }
            if (model.isConfirm(getMousepos()) != -1) {
                Model.minusCount();
                for (int i = 0; i < 16; i++) {
                    if (confirmed[i] == 1) {
                        model.delStick(i);
                    }
                }
            }
        }
	}

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
    }	
}
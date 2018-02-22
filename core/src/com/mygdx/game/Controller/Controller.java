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
		if (Gdx.input.justTouched()) {
            if (model.inSticks(getMousepos()) != -1) {
                model.choiseStick(model.inSticks(getMousepos()));
                model.delStick(1);
            }
        }
	}

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
    }	
}
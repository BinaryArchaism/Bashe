package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Main extends ApplicationAdapter {
	Control control;
	SpriteBatch batch;
	Model model;
	Texture myFon;

	@Override
	public void create () {
		batch = new SpriteBatch();
		model = new Model(20, 4);
		myFon = new Texture("fon.jpg");
		control = new Control(model);
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(myFon, 0, 0);


		model.render(batch);
		batch.end();
	}
	public void update() {

		Vector2 v;

		if (Input.isClicked()) {
			v = Input.getMousePosition();
			if (model.inSticks(v) != -1)
			model.choiceStick(model.inSticks(v));


		}
	}
}


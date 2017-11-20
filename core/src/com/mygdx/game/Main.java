package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.sun.org.apache.xpath.internal.operations.Mod;

import java.util.Random;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Model model;
	Texture myFon;
	Texture myOk;
	Controll ctrlGame;
	//int


	@Override
	public void create () {
		batch = new SpriteBatch();
		model = new Model(20, 4);
		ctrlGame = new Controll(model);
		myFon = new Texture("fon.jpg");
		myOk = new Texture("ok2.jpg");
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(myFon, 0, 0);
		batch.draw(myOk, Gdx.graphics.getWidth()/4, Gdx.graphics.getHeight()*1/50);
		model.render(batch);

		batch.end();
	}
	public void update() {

		Vector2 v;

		if (Input.isClicked()) {
			v = Input.getMousePosition();
			v.y = Gdx.graphics.getHeight() - v.y;
			int n = model.inSticks(v);
			}
		}
	}


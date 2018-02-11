package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game {

	SpriteBatch batch;
	BitmapFont font;
	Texture fon;

	@Override
	public void create () {
		batch = new SpriteBatch();
		fon = new Texture(Gdx.files.internal("fon.jpg"));
		font = new BitmapFont();
		font.setColor(Color.RED);
		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}


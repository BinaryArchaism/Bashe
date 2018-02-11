package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game {

	SpriteBatch batch;
	BitmapFont font;

	@Override
	public void create () {

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


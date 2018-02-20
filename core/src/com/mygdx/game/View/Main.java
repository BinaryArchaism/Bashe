package com.mygdx.game.View;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.View.MenuScreen;

public class Main extends Game {

	SpriteBatch batch;
	Texture fon;
	Texture font;
	Texture ok;
	Music music;

	@Override
	public void create () {
		batch = new SpriteBatch();
		fon = new Texture(Gdx.files.internal("fon.png"));
		font = new Texture(Gdx.files.internal("font.png"));
		ok = new Texture(Gdx.files.internal("ok.png"));
		music = Gdx.audio.newMusic(Gdx.files.internal("music.mp3"));
		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	@Override
	public void dispose() {
		batch.dispose();
		fon.dispose();
		font.dispose();
		music.dispose();
	}
}


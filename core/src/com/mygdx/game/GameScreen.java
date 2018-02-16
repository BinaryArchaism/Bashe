package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameScreen implements Screen {
    final Main game;

    Stick stick;

    OrthographicCamera camera;

    public GameScreen(final Main game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 870, 480);
    }
    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0.2f,1);
        Gdx.gl.glClear((GL20.GL_COLOR_BUFFER_BIT));
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
            game.batch.draw(game.fon, 0, 0);
            game.batch.draw(game.ok, 0,-6);

            for (int i = 0; i < 16; i++) {
                stick = new Stick(i);
                game.batch.draw(stick.getStickTex(), 35+ stick.getNumber()* 50, 85);
            }
        game.batch.end();

    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

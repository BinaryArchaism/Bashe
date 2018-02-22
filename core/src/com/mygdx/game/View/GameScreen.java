package com.mygdx.game.View;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Controller.Controller;
import com.mygdx.game.Model.Model;

public class GameScreen implements Screen {
    final Main game;

    Controller controller;
    BitmapFont font;

    OrthographicCamera camera;

    public GameScreen(final Main game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 870, 480);
        controller = new Controller();
        font = new BitmapFont();
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
            
            controller.controllerUpdate(game.batch);
            font.draw(game.batch, "Count of sticks " + Model.getCountOfSticksOnScreen(), 30, 473);
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

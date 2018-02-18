package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;

public class GameScreen implements Screen {
    final Main game;

    Model model;
    Vector2 v;

    OrthographicCamera camera;

    public GameScreen(final Main game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 870, 480);
        model = new Model();
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
            model.render(game.batch);
            if (Gdx.input.justTouched()) {
                v = getMousepos();
                if (model.inSticks(v) != -1) model.choiseStick(model.inSticks(v));
            }
        game.batch.end();

    }

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
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

public class Controller {

	Model model;
	SpriteBatch batch;

	public Controller() {
		model = new Model();
		batch = GameScreen.getBatch();
	}

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
    }	
}
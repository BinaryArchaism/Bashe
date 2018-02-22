public class Controller {

	Model model;

	public Controller() {
		model = new Model();
	}

	public void controllerUpdate() {
		model.render(GameScreen.getBatch());
	}

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
    }	
}
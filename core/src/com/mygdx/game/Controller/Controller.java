public class Controller {

	Model model;

	public Controller() {
		model = new Model();
	}

	public void controllerUpdate(SpriteBatch batch) {
		model.render(batch);
		if (Gdx.input.justTouched()) {
            v = getMousepos();
            if (model.inSticks(v) != -1) {
                model.choiseStick(model.inSticks(v));
                model.delStick(1);
            }
        }
	}

    public Vector2 getMousepos() {
        return new Vector2(Gdx.input.getX(),Gdx.input.getY());
    }	
}
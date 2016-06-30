package com.mygdx.game.States;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Fernando on 2/27/2016.
 */
public class ControlsState extends States implements InputProcessor {

	private boolean clicked;

	protected ControlsState(GameStateManager gsm) {
		super(gsm);
		
	}

	@Override
	protected void handleInput() {
		gsm.set(new MenuState(gsm));
		dispose();
        

		
	}

	@Override
	protected void update(float dt) {
		if(clicked){

			handleInput();
			
		}
		
	}

	@Override
	public void render(SpriteBatch sb) {
		
		
	}

    @Override
    public void dispose() {

    }

	@Override
	public boolean keyDown(int keycode) {
		
	return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if(button == Input.Buttons.LEFT ){
			clicked = true;
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}

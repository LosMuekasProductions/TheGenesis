package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Bacteria;
import com.mygdx.game.OriginalBacteria;
import com.mygdx.game.PlayerHealth;
import java.util.Random;

public class MenuState extends States implements InputProcessor{



	private Texture background;
	private Texture playBtn;
	private Texture infoBtn;
	private Texture controlsBtn;
	private Texture exitBtn;
	private Texture title;

	private int titleX;
	private int titleY;
	private int playBtnX;
	private int playBtnY;
	private int infoBtnX;
	private int infoBtnY;
	private int controlsBtnX;
	private int controlsBtnY;
	private int	exitBtnX;
	private int	exitBtnY;

	private OriginalBacteria[] bacterias;

	private Rectangle playBtnBounds;
	private Rectangle infoBtnBounds;
	private Rectangle controlsBtnBounds;
	private Rectangle exitBtnBounds;
	private boolean clicked;
	private Vector2 click;
	private Random rand;



	public MenuState(GameStateManager gsm) {
		super(gsm);
		background = new Texture("menu/background.png");
		playBtn = new Texture("menu/play.png");
		infoBtn = new Texture("menu/info.png");
		controlsBtn = new Texture("menu/ctrl.png");
		exitBtn = new Texture("menu/exit.png");
		title = new Texture("menu/Title.png");
		rand = new Random();
		titleX = TheGenesis.WIDTH/2 - title.getWidth()/2;
		titleY = 4*(TheGenesis.HEIGHT/5) - title.getHeight()/2;
		playBtnX = (int)(TheGenesis.WIDTH / 2) - (playBtn.getWidth() / 2);
		playBtnY= (int)TheGenesis.HEIGHT / 2;
		infoBtnX =(int)(TheGenesis.WIDTH / 2) - (playBtn.getWidth() / 2);
		infoBtnY = (int)((TheGenesis.HEIGHT / 2)/ 1.5f);
		controlsBtnX = (int)(TheGenesis.WIDTH / 2) - (playBtn.getWidth() / 2);
		controlsBtnY =(int) ((TheGenesis.HEIGHT / 2) / 3.0f);
		exitBtnX = (int)(TheGenesis.WIDTH / 2) - (playBtn.getWidth() / 2);
		exitBtnY= (int) (TheGenesis.HEIGHT / 2) - 350;
		playBtnBounds = new Rectangle(playBtnX, playBtnY, playBtn.getWidth(), playBtn.getHeight());
		infoBtnBounds = new Rectangle(infoBtnX, infoBtnY, playBtn.getWidth(), playBtn.getHeight());
		controlsBtnBounds = new Rectangle(controlsBtnX, controlsBtnY, controlsBtn.getWidth(), controlsBtn.getHeight());
		exitBtnBounds = new Rectangle(exitBtnX, exitBtnY, exitBtn.getWidth(), exitBtn.getHeight());


		bacterias = new OriginalBacteria[12];
		for(int i = 0; i < 12; i++){
			bacterias[i] = new OriginalBacteria(rand.nextInt(TheGenesis.WIDTH), rand.nextInt(TheGenesis.HEIGHT));
		}

		clicked = false;
		Gdx.input.setInputProcessor(this);
	}

	@Override
	protected void handleInput() {

		if(clicked){

			if(playBtnBounds.contains(click.x, click.y )){

				gsm.set(new PlayState(gsm));
				dispose();
			}
			if(infoBtnBounds.contains(click.x, click.y )){

				gsm.set(new BacteriaInfoState(gsm));
				dispose();
			}
			if(controlsBtnBounds.contains(click.x, click.y )){

				gsm.set(new ControlsState(gsm));
				dispose();
			}
			if(exitBtnBounds.contains(click.x, click.y )){

				gsm.set(new GameOverState(gsm));
				dispose();
			}



	}

	}

    @Override
    public void dispose() {
    	background.dispose();
    	playBtn.dispose();
    	infoBtn.dispose();
    	controlsBtn.dispose();
    	exitBtn.dispose();
		title.dispose();
		for(int i = 0; i < 12; i++){
			bacterias[i].getImg().dispose();
		}

    }

    @Override
	protected void update(float dt) {

    	handleInput();

	}

	@Override
	public void render(SpriteBatch sb) {

		sb.begin();
		sb.draw(background, 0, 0, TheGenesis.WIDTH, TheGenesis.HEIGHT);
		sb.draw(playBtn, playBtnX, playBtnY);
		sb.draw(infoBtn, infoBtnX, infoBtnY);
		sb.draw(controlsBtn, controlsBtnX, controlsBtnY);
		sb.draw(exitBtn, exitBtnX, exitBtnY);
		sb.draw(title, titleX, titleY);

		for(int i = 0; i < 12; i++){
			sb.draw(bacterias[i].getImg(), bacterias[i].getX(), bacterias[i].getY());
		}



		sb.end();
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if(button == Input.Buttons.LEFT){
			click = new Vector2(Gdx.input.getX() , -(Gdx.input.getY() - Gdx.graphics.getHeight()));

			clicked = true;
		}
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}
}

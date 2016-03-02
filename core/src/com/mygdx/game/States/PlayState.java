package com.mygdx.game.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.GameOverFont;
import com.mygdx.game.PlayerHealth;
import com.mygdx.game.Score;
import com.mygdx.game.Timer;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.awt.event.KeyListener;

public class PlayState extends States implements InputProcessor{



    private PlayerHealth health;
    private Texture playStateBackground;
    private boolean clicked;
	private boolean clicked2;





    protected PlayState(GameStateManager gsm) {
        super(gsm);
        health = new PlayerHealth();
        playStateBackground = new Texture("PlayState/playstatebackground.png");
        Score.score = 0;
        Timer.resetTimer();
        Gdx.input.setInputProcessor(this);
        

    }

    @Override
    protected void handleInput() {

           gsm.set(new GameOverState(gsm));
           dispose();


    }

    @Override
    protected void update(float dt) {
        if(clicked) {
            handleInput();
            clicked = false;
        }
        if(clicked2) {
            scoreUp();
            clicked2 = false;
        }

        health.checkHealth();
        Score.updateScore();
        Timer.checkCurrentTime();
        GameOverFont.updateOverTimeAndScore();        



    }

    private void scoreUp() {
    	Score.score += 5;
	}

	@Override
    public void dispose() {
		health.getHealthPic().dispose();
		playStateBackground.dispose();
		

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(playStateBackground,0,0);
        sb.draw(health.getHealthPic(), 10, TheGenesis.HEIGHT - health.getHealthPic().getHeight()-5);
        Score.font.draw(sb, Score.layout, TheGenesis.WIDTH - 10 - Score.width , TheGenesis.HEIGHT - 10- Score.height);
        Timer.font.draw(sb, Timer.layout, TheGenesis.WIDTH/2 - Timer.width/2 , TheGenesis.HEIGHT - 10 - Timer.height);
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

        if(button == Input.Buttons.LEFT) {

            clicked = true;
        }
        if(button == Input.Buttons.RIGHT) {

            clicked2 = true;
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

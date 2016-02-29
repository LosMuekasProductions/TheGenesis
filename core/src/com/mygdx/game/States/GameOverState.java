package com.mygdx.game.States;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created by Fernando on 2/27/2016.
 */
public class GameOverState extends States implements InputProcessor{



    private Texture background;
    private Texture menuBtn;
    private Texture scoreText;
    private Texture timeText;
    private Texture playAgnBtn;

    private Vector2 click;
    private int backgroundX;
    private int backgroundY;
    private int scoreTextX;
    private int scoreTextY;
    private int timeTextX;
    private int timeTextY;
    private int menuBtnX;
    private int menuBtnY;
    private int playAgnBtnX;
    private int playAgnBtnY;
    private Rectangle backgroundBounds;
    private Rectangle menuBtnBounds;
    private Rectangle playAgnBtnBounds;
    private boolean clicked;


    public GameOverState (GameStateManager gsm){
        super(gsm);
        background = new Texture("over/background.png");
        menuBtn = new Texture("over/button1.png");
        playAgnBtn = new Texture("over/button2.png");
        scoreText = new Texture("over/ScoreText.png");
        timeText = new Texture("over/TimeText.png");

        backgroundX = 0;
        backgroundY = 0;
        scoreTextX = TheGenesis.WIDTH / 2 - scoreText.getWidth() - 10;
        scoreTextY= (TheGenesis.HEIGHT / 2) + scoreText.getHeight() + 20;
        timeTextX = TheGenesis.WIDTH / 2 - timeText.getWidth() - 10 ;
        timeTextY = (TheGenesis.HEIGHT / 2) + timeText.getHeight() - 80 ;
        menuBtnX = (TheGenesis.WIDTH - (menuBtn.getWidth() + playAgnBtn.getWidth()))/3;
        menuBtnY = TheGenesis.HEIGHT/4 - menuBtn.getHeight()/2;
        playAgnBtnX = ((TheGenesis.WIDTH - (menuBtn.getWidth() + playAgnBtn.getWidth()))/3)*3;
        playAgnBtnY = TheGenesis.HEIGHT/4 - menuBtn.getHeight()/2;
        backgroundBounds = new Rectangle(backgroundX, backgroundY, background.getWidth(), background.getHeight());
        menuBtnBounds = new Rectangle(menuBtnX, menuBtnY, menuBtn.getWidth(), menuBtn.getHeight());
        playAgnBtnBounds= new Rectangle(playAgnBtnX, playAgnBtnY, playAgnBtn.getWidth(), playAgnBtn.getHeight());
        clicked = false;
        Gdx.input.setInputProcessor(this);


    }



    @Override
    protected void handleInput() {
        if(clicked){



            if(menuBtnBounds.contains(click.x, click.y )){
                gsm.set(new MenuState(gsm));
                dispose();
            }
            if(playAgnBtnBounds.contains(click.x, click.y )){
                gsm.set(new PlayState(gsm));
                dispose();
            }
        }
    }


    @Override
    protected void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background, backgroundX, backgroundY, TheGenesis.WIDTH, TheGenesis.HEIGHT);
        sb.draw(menuBtn, menuBtnX, menuBtnY);
        sb.draw(playAgnBtn, playAgnBtnX, playAgnBtnY);
        sb.draw(scoreText, scoreTextX,scoreTextY);
        sb.draw(timeText, timeTextX, timeTextY);
        sb.end();

    }
    @Override
    public void dispose() {
        background.dispose();
        menuBtn.dispose();
        playAgnBtn.dispose();

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

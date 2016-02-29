package com.mygdx.game.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Fernando on 2/27/2016.
 */
public class GameStateManager  {

    private Stack<States> states;

    public GameStateManager(){
        states = new Stack<States>();
    }

    public void push(States state){
        states.push(state);

    }

    public void pop(){
        states.pop();
    }

    public void set(States state){
        states.pop();
        states.push(state);

    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }



}

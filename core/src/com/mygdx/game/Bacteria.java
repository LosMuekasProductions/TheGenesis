package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.Random;

public abstract class Bacteria {

    protected int posX;
    protected int posY;
    protected final int  HEALTHPICHEIGHT = 86;
    protected Random rand = new Random();
    protected int life = 0;
    protected long timeSpawned;



    public Bacteria(){

    	this.posX = posX;
    	this.posY = posY;
    	this.timeSpawned = System.currentTimeMillis();

    }
    public abstract Texture getImg();


	public void setX(int posX){
    	this.posX = posX;
    }

    public void setY(int posY){
    	this.posY = posY;
    }


    public int getX(){
    	return posX;
    }

    public int getY(){
    	return posY;
    }
	public int getLife() {
		// TODO Auto-generated method stub
		return life;
	}
	public void setLife(int i) {
		life= i;
	}
	public long getTimeSpawned() {
		return timeSpawned;
	}
	public void setTimeSpawned(long timeSpawned) {
		this.timeSpawned = timeSpawned;
	}



}

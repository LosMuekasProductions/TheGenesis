package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.Random;

public abstract class Bacteria {

    private int posX;
    private int posY;
    private float spawnRate;

    Random rand = new Random();


    public Bacteria(int posX, int posY, float spawnRate){

    	this.posX = posX;
    	this.posY = posY;
    	this.spawnRate = spawnRate;

    }

	public void setX(int posX){
    	this.posX = posX;
    }

    public void setY(int posY){
    	this.posY = posY;
    }
    
    public void setSpawnRate(float spawnRate){
    	this.spawnRate = spawnRate;
    }

    public int getX(){
    	return posX;
    }

    public int getY(){
    	return posY;
    }
    
    public float getSpawnRate(){
    	return spawnRate;
    }

}

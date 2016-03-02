package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.Random;

public abstract class Bacteria {

    protected int posX;
    protected int posY;
    protected final int  HEALTHPICHEIGHT = 86;
    protected Random rand = new Random();
  


    public Bacteria(){

    	this.posX = posX;
    	this.posY = posY;

    }

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
    
    

}

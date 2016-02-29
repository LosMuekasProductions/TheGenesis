package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

import java.util.Random;

public abstract class Bacteria {

    private int posX;
    private int posY;
    private int damage;
    private Texture img;
    //private float spawnRate;

    Random rand = new Random();


    public Bacteria(int posX, int posY, int damage, String img){

    	this.posX = posX;
    	this.posY = posY;
    	this.damage = damage;
    	setImg(img);

    }

    public void setX(int posX){
    	this.posX = posX;
    }

    public void setY(int posY){
    	this.posY = posY;
    }

    public void setDamage(int damage){
    	this.damage = damage;
    }

     public void setImg(String img){
    	this.img = new Texture(img);
    }

    public int getX(){
    	return posX;
    }

    public int getY(){
    	return posY;
    }

    public int getDamage(){
    	return damage;
    }

    public Texture getImg(){
    	return img;
    }



}

package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class OriginalBacteria extends Bacteria {
	
	public final static int DAMAGE = 5;
	private final Texture IMG = new Texture("Bacterias/bacteria.png");
	
    public OriginalBacteria(int posX, int posY, float spawnRate) {
    	
        super(posX, posY, spawnRate);

    }
    
    public Texture getImg(){
    	return IMG;
    }

   
    



}

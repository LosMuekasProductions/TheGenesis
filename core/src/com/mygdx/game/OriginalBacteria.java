package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;


public class OriginalBacteria extends Bacteria {

	public final static int DAMAGE = 5;
	private final Texture IMG = new Texture("Bacterias/bacteria.png");

    public OriginalBacteria() {

        super();
        this.posX = rand.nextInt(TheGenesis.WIDTH - getImg().getWidth());
        this.posY = rand.nextInt(TheGenesis.HEIGHT - getImg().getHeight() - HEALTHPICHEIGHT);

    }

    public Texture getImg(){
    	return IMG;
    }






}

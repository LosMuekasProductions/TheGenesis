package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Explode extends Bacteria {

	public final static int DAMAGE = 10;
	private final Texture IMG = new Texture("Bacterias/bacteria.png");

    public Explode(int posX, int posY) {
        super(posX, posY);
    }

    public Texture getImg(){
    	return IMG;
    }

}

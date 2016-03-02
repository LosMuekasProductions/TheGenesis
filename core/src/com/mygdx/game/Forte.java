package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Forte extends Bacteria {

	public final static int DAMAGE = 10;
	private final Texture IMG = new Texture("Bacterias/bacteria.png");

    public Forte() {

        super();

    }

    public Texture getImg(){
    	return IMG;
    }



}

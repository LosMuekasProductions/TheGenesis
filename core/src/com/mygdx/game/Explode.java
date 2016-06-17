package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Explode extends Bacteria {

	public final static int DAMAGE = 10;
	private final Texture IMG = new Texture("Bacterias/explode.png");
	private int life = 5;

    public Explode() {
        super();
        this.posX = rand.nextInt(TheGenesis.WIDTH - getImg().getWidth());
        this.posY = rand.nextInt(TheGenesis.HEIGHT - getImg().getHeight() - HEALTHPICHEIGHT);

    }

    public Texture getImg(){
    	return IMG;
    }
    public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

}

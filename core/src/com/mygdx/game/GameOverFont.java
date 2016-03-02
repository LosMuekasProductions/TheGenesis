package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class GameOverFont {
	
	public static BitmapFont font = new BitmapFont(Gdx.files.internal("Gameoverfont/gameOverFont.fnt"), false);;
	public static GlyphLayout layoutScoreOver = new GlyphLayout();
	public static GlyphLayout layoutTimeOver = new GlyphLayout();
	public static float widthScore = layoutScoreOver.width;
	public static float heightScore = layoutScoreOver.height;
	public static float widthTime = layoutTimeOver.width;
	public static float heightTime = layoutTimeOver.height;
	
	public static void updateOverTimeAndScore(){
		layoutScoreOver.setText(font, "Score: " + Score.score );
		layoutTimeOver.setText(font, Timer.stringTime2);
		widthScore = layoutScoreOver.width;
		heightScore = layoutScoreOver.height;
		widthTime = layoutTimeOver.width;
		heightTime = layoutTimeOver.height;
		
	}
	
	
	
	
	
}

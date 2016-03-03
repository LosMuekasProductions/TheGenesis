package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class GameOverFont {
	
	private static BitmapFont font = new BitmapFont(Gdx.files.internal("Gameoverfont/gameOverFont.fnt"), false);;
	private static GlyphLayout layoutScoreOver = new GlyphLayout();
	private static GlyphLayout layoutTimeOver = new GlyphLayout();
	private static float widthScore = layoutScoreOver.width;
	private static float heightScore = layoutScoreOver.height;
	private static float widthTime = layoutTimeOver.width;
	private static float heightTime = layoutTimeOver.height;
	
	public static void updateOverTimeAndScore(){
		layoutScoreOver.setText(font, "Score: " + Score.score );
		layoutTimeOver.setText(font, Timer.stringTime2);
		widthScore = layoutScoreOver.width;
		heightScore = layoutScoreOver.height;
		widthTime = layoutTimeOver.width;
		heightTime = layoutTimeOver.height;
		
	}
	
	
	
	
	
}

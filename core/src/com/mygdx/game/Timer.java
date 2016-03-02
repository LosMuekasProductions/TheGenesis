package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class Timer {

	
	public static long startTime;
	public static long currentTimeSeconds;
	public static long minutes;
	public static long seconds;
	public static String stringTime;
	public static BitmapFont font = new BitmapFont(Gdx.files.internal("Fonts/Font.fnt"), false);;
	public static BitmapFont gameOverFont = new BitmapFont(Gdx.files.internal("Gameoverfont/gameOverFont.fnt"), false);;


	public static String scoreString = "0";
    public static GlyphLayout layout = new GlyphLayout();
    public static GlyphLayout layout2 = new GlyphLayout();
    

    public static float width = layout.width;
    public static float height = layout.height;
    public static float width2 = layout2.width;
    public static float height2 = layout2.height;
	public static String stringTime2;
	
	
	
	public Timer(){
		
	}
	
	public static void resetTimer(){
		startTime = System.currentTimeMillis();
		minutes = 0;
		seconds = 0;
		
	}
	
	public static void checkCurrentTime(){
		
		currentTimeSeconds = (System.currentTimeMillis() - startTime)/1000;
		updateTime();
	}
	
	public static void updateTime(){
		minutes = currentTimeSeconds/60;
		seconds = currentTimeSeconds - (minutes*60);
		stringTime = String.format("%02d:%02d", minutes, seconds);
		stringTime2 = String.format("Time: %02d:%02d", minutes, seconds);
        layout.setText(Timer.font, stringTime );
        layout2.setText(Timer.font, stringTime2);
        width = layout.width;
        height = layout.height;
        width2 = layout2.width;
		height2 = layout2.height;
        
       
    }
	
	
	
}

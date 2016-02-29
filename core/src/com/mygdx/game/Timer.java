package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class Timer {

	
	public static long startTime;
	public static long currentTime;
	public static BitmapFont font = new BitmapFont(Gdx.files.internal("Fonts/Font.fnt"), false);;
    public static String scoreString = "0";
    public static GlyphLayout layout = new GlyphLayout();
    public static float width = layout.width;
    public static float height = layout.height;
	
	public Timer(){
		
	}
	
	public static void resetTimer(){
		startTime = System.currentTimeMillis();
	}
	
	public static void checkCurrentTime(){
		currentTime = (System.currentTimeMillis() - startTime)/1000;
	}
	
	public static void updateTime(){
        layout.setText(Timer.font, "Time: " + Timer.currentTime );
        width = layout.width;
        height = layout.height;
    }
	
	
	
}

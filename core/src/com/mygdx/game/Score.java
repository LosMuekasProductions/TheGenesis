package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

public class Score {

    public static int score = 0;
    public static BitmapFont font = new BitmapFont(Gdx.files.internal("Fonts/Font.fnt"), false);;
    public static String scoreString = "0";
    public static GlyphLayout layout = new GlyphLayout();
    public static float width = layout.width;
    public static float height = layout.height;

    public Score(){

    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int score) {
        Score.score = score;
    }

    public static void updateScore(){
        Score.layout.setText(Score.font, "Score: " + Score.score );
        width = layout.width;
        height = layout.height;
    }


}

package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.TheGenesis;

public class DesktopLauncher {


	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = TheGenesis.WIDTH;
		config.height = TheGenesis.HEIGHT;
		config.title = TheGenesis.TITLE;
		config.resizable = false;
		new LwjglApplication(new TheGenesis(), config);
	}
}

package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.PlayState;

public class SpawnSystem {
	private ArrayList<OriginalBacteriaSpawner> OriginalBacteriaSpawns;
	private ArrayList<ForteBacteriaSpawner> ForteBacteriaSpawns;
	private ArrayList<ExplodeBacteriaSpawner> ExplodeBacteriaSpawns;

	private float origBactSpawnerSpawnRate = 2;
	private float origBactSpawnerDespawnRate = 5;
	private float forteBactSpawnerSpawnRate = 5;
	private float forteBactSpawnerDespawnRate = 5;
	private float explodeBactSpawnerSpawnRate = 10;
	private float explodeBactSpawnerDespawnRate = 5;



	public SpawnSystem(){
		OriginalBacteriaSpawns = new ArrayList<OriginalBacteriaSpawner>();
		ForteBacteriaSpawns = new ArrayList<ForteBacteriaSpawner>();
		ExplodeBacteriaSpawns = new ArrayList<ExplodeBacteriaSpawner>();

		OriginalBacteriaSpawns.add(new OriginalBacteriaSpawner(origBactSpawnerSpawnRate, origBactSpawnerDespawnRate));
		ForteBacteriaSpawns.add(new ForteBacteriaSpawner(forteBactSpawnerSpawnRate, forteBactSpawnerDespawnRate));
		ExplodeBacteriaSpawns.add(new ExplodeBacteriaSpawner(explodeBactSpawnerSpawnRate, explodeBactSpawnerDespawnRate));


	}

	public void updateSpawns(){


	}

	public void render(SpriteBatch sb){

	}

}

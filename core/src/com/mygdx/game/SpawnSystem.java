package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.PlayState;

public class SpawnSystem {
	private ArrayList<OriginalBacteriaSpawner> OriginalBacteriaSpawners;
	private ArrayList<ForteBacteriaSpawner> ForteBacteriaSpawners;
	private ArrayList<ExplodeBacteriaSpawner> ExplodeBacteriaSpawners;

	private float origBactSpawnerSpawnRate = 2;
	private float origBactSpawnerDespawnRate = 5;
	private float forteBactSpawnerSpawnRate = 5;
	private float forteBactSpawnerDespawnRate = 5;
	private float explodeBactSpawnerSpawnRate = 10;
	private float explodeBactSpawnerDespawnRate = 5;
	private static long spawnedTemp = 0;



	public SpawnSystem(){
		OriginalBacteriaSpawners = new ArrayList<OriginalBacteriaSpawner>();
		ForteBacteriaSpawners = new ArrayList<ForteBacteriaSpawner>();
		ExplodeBacteriaSpawners = new ArrayList<ExplodeBacteriaSpawner>();
		addSpawners();


	}

	public void updateSpawners(){
		if(Timer.seconds != spawnedTemp && Timer.seconds != 0 && Timer.seconds % 3 == 0){
			//addSpawners();
		}
		for(OriginalBacteriaSpawner spawner: OriginalBacteriaSpawners){
			spawner.spawnBacteria();
		}

	}

	public void render(SpriteBatch sb){

		for(OriginalBacteriaSpawner spawner: OriginalBacteriaSpawners){
			for(OriginalBacteria bacteria: spawner.bacterias){

				sb.draw(bacteria.getImg(), bacteria.getX(), bacteria.getY());

			}
		}
	}
	public void addSpawners(){
		OriginalBacteriaSpawners.add(new OriginalBacteriaSpawner(origBactSpawnerSpawnRate, origBactSpawnerDespawnRate));
		ForteBacteriaSpawners.add(new ForteBacteriaSpawner(forteBactSpawnerSpawnRate, forteBactSpawnerDespawnRate));
		ExplodeBacteriaSpawners.add(new ExplodeBacteriaSpawner(explodeBactSpawnerSpawnRate, explodeBactSpawnerDespawnRate));

		origBactSpawnerSpawnRate += 1;
		origBactSpawnerDespawnRate -= origBactSpawnerDespawnRate*.75;
		forteBactSpawnerSpawnRate += 1;
		forteBactSpawnerDespawnRate -= forteBactSpawnerDespawnRate*.75;
		explodeBactSpawnerSpawnRate += 1;
		explodeBactSpawnerDespawnRate -= explodeBactSpawnerDespawnRate *.75;

	}

}

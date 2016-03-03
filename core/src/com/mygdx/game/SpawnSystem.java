package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.PlayState;

public class SpawnSystem {
	private OriginalBacteriaSpawner originalBacteriaSpawner;
	private ForteBacteriaSpawner forteBacteriaSpawner;
	private ExplodeBacteriaSpawner explodeBacteriaSpawner;

	private float origBactSpawnerSpawnRate = 2;
	private float origBactSpawnerDespawnRate = 5;
	private float forteBactSpawnerSpawnRate = 5;
	private float forteBactSpawnerDespawnRate = 5;
	private float explodeBactSpawnerSpawnRate = 10;
	private float explodeBactSpawnerDespawnRate = 5;
	private static long spawnedTemp = 0;



	public SpawnSystem(){
		originalBacteriaSpawner = new OriginalBacteriaSpawner(origBactSpawnerSpawnRate, origBactSpawnerDespawnRate);
		forteBacteriaSpawner = new ForteBacteriaSpawner(forteBactSpawnerSpawnRate, forteBactSpawnerDespawnRate);
		explodeBacteriaSpawner = new ExplodeBacteriaSpawner(explodeBactSpawnerSpawnRate, explodeBactSpawnerDespawnRate);
		


	}

	public void updateSpawners(){
		
		originalBacteriaSpawner.spawnBacteria();
		forteBacteriaSpawner.spawnBacteria();
		explodeBacteriaSpawner.spawnBacteria();

	}

	public void render(SpriteBatch sb){

		for(OriginalBacteria bacteria: originalBacteriaSpawner.bacterias){

			sb.draw(bacteria.getImg(), bacteria.getX(), bacteria.getY());

		}
		for(Forte bacteria: forteBacteriaSpawner.bacterias){

			sb.draw(bacteria.getImg(), bacteria.getX(), bacteria.getY());

		}
		for(Explode bacteria: explodeBacteriaSpawner.bacterias){

			sb.draw(bacteria.getImg(), bacteria.getX(), bacteria.getY());

		}
		
	}
	public void addSpawners(){
		
//		origBactSpawnerSpawnRate += 1;
//		origBactSpawnerDespawnRate -= origBactSpawnerDespawnRate*.75;
//		forteBactSpawnerSpawnRate += 1;
//		forteBactSpawnerDespawnRate -= forteBactSpawnerDespawnRate*.75;
//		explodeBactSpawnerSpawnRate += 1;
//		explodeBactSpawnerDespawnRate -= explodeBactSpawnerDespawnRate *.75;

	}

}

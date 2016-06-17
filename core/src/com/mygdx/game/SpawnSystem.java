package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.States.PlayState;

public class SpawnSystem {
	private OriginalBacteriaSpawner originalBacteriaSpawner;
	private ForteBacteriaSpawner forteBacteriaSpawner;
	private ExplodeBacteriaSpawner explodeBacteriaSpawner;

	private float origBactSpawnerSpawnRate = 2;
	private float origBactSpawnerDespawnRate = 2*1000;
	private float forteBactSpawnerSpawnRate = 5;
	private float forteBactSpawnerDespawnRate = 3*1000;
	private float explodeBactSpawnerSpawnRate = 10;
	private float explodeBactSpawnerDespawnRate = 4*1000;
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


	public ArrayList<Bacteria> getSpawnedOriginalBacterias(){
		ArrayList<Bacteria> bacterias = new ArrayList<Bacteria>();

		for(OriginalBacteria bacteria: originalBacteriaSpawner.bacterias){

			bacterias.add(bacteria);
		}
		return bacterias;

	}
	public ArrayList<Bacteria> getSpawnedForteBacterias(){
		ArrayList<Bacteria> bacterias = new ArrayList<Bacteria>();

		for(Forte bacteria: forteBacteriaSpawner.bacterias){

			bacterias.add(bacteria);

		}
		return bacterias;

	}
	public ArrayList<Bacteria> getSpawnedExplodeBacterias(){
		ArrayList<Bacteria> bacterias = new ArrayList<Bacteria>();


		for(Explode bacteria: explodeBacteriaSpawner.bacterias){

			bacterias.add(bacteria);

		}
		return bacterias;
	}

	public void removeOriginalBacteria(int i){
		originalBacteriaSpawner.bacterias.remove(i);

	}
	public void removeForteBacteria(int i){
		forteBacteriaSpawner.bacterias.remove(i);

	}
	public void removeExplodeBacteria(int i){
		explodeBacteriaSpawner.bacterias.remove(i);

	}

	public float getOrigBactSpawnerDespawnRate() {
		return origBactSpawnerDespawnRate;
	}



	public float getForteBactSpawnerDespawnRate() {
		return forteBactSpawnerDespawnRate;
	}


	public float getExplodeBactSpawnerDespawnRate() {
		return explodeBactSpawnerDespawnRate;
	}

	public void forceOriginalSpawn() {
		originalBacteriaSpawner.forceSpawnBacteria();

	}








}

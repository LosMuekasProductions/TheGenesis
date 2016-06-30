package com.mygdx.game;

import java.util.ArrayList;

public class ExplodeBacteriaSpawner {

	private float spawnRate;
	private float despawnRate;
	public float lastTimeSpawned;


	public ArrayList<Explode> bacterias;
	

	public ExplodeBacteriaSpawner(float spawnRate, float despawnRate){
		this.spawnRate = spawnRate*1000;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<Explode>();
		lastTimeSpawned = (long) this.spawnRate;

	}

	public void spawnBacteria() {
		if( Timer.currentTimeMillis != 0 && Timer.currentTimeMillis > lastTimeSpawned ){
			bacterias.add(new Explode());
			lastTimeSpawned = Timer.currentTimeMillis;
			lastTimeSpawned += spawnRate * 19/20;	
		}
	}

	
}

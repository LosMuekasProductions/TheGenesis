package com.mygdx.game;

import java.util.ArrayList;

public class OriginalBacteriaSpawner {

	private static float spawnRate;
	private float despawnRate;
	public ArrayList<OriginalBacteria> bacterias;
	public long lastTimeSpawned;
	

	public OriginalBacteriaSpawner(float spawnRate, float despawnRate) {

		this.spawnRate = spawnRate*1000;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<OriginalBacteria>();
		lastTimeSpawned = (long) this.spawnRate;

		



	}



	public void spawnBacteria() {
		
		if( Timer.currentTimeMillis != 0 && Timer.currentTimeMillis > lastTimeSpawned ){
			bacterias.add(new OriginalBacteria());
			lastTimeSpawned = Timer.currentTimeMillis;
			lastTimeSpawned += spawnRate * 19/20;
		}	
	}




}

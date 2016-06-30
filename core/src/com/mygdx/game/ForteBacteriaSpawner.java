package com.mygdx.game;

import java.util.ArrayList;

public class ForteBacteriaSpawner {
	private float spawnRate;
	private float despawnRate;
	public ArrayList<Forte> bacterias;
	

	public long lastTimeSpawned;

	public ForteBacteriaSpawner(float spawnRate, float despawnRate){
		this.spawnRate = spawnRate*1000;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<Forte>();
		lastTimeSpawned = (long) this.spawnRate;
	}

	public void spawnBacteria() {
		if( Timer.currentTimeMillis != 0 && Timer.currentTimeMillis > lastTimeSpawned ){
			bacterias.add(new Forte());
			lastTimeSpawned = Timer.currentTimeMillis;
			lastTimeSpawned += spawnRate * 19/20;		}
	}

	


}

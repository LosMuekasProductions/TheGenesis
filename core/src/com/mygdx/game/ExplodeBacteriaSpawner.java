package com.mygdx.game;

import java.util.ArrayList;

public class ExplodeBacteriaSpawner {

	private float spawnRate;
	private float despawnRate;

	public ArrayList<Explode> bacterias;
	private long spawnedTemp = 0;

	public ExplodeBacteriaSpawner(float spawnRate, float despawnRate){
		this.spawnRate = spawnRate;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<Explode>();
	}

	public void spawnBacteria() {
		if(Timer.seconds != spawnedTemp  && Timer.seconds != 0 && Timer.seconds % spawnRate == 0){
			bacterias.add(new Explode());
			spawnedTemp = Timer.seconds;
		}		
	}

}

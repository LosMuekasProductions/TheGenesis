package com.mygdx.game;

import java.util.ArrayList;

public class ForteBacteriaSpawner {
	private float spawnRate;
	private float despawnRate;
	public ArrayList<Forte> bacterias;
	private long spawnedTemp = 0;

	public ForteBacteriaSpawner(float spawnRate, float despawnRate){
		this.spawnRate = spawnRate;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<Forte>();
	}

	public void spawnBacteria() {
		if(Timer.seconds != spawnedTemp  && Timer.seconds != 0 && Timer.seconds % spawnRate == 0){
			bacterias.add(new Forte());
			spawnedTemp = Timer.seconds;
		}		
	}



}

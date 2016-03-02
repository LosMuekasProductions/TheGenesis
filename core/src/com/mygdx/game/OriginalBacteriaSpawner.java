package com.mygdx.game;

import java.util.ArrayList;

public class OriginalBacteriaSpawner {

	private float spawnRate;
	private float despawnRate;
	private static long spawnedTemp = 0;
	public ArrayList<OriginalBacteria> bacterias;

	public OriginalBacteriaSpawner(float spawnRate, float despawnRate) {

		this.spawnRate = spawnRate;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<OriginalBacteria>();

		



	}



	public void spawnBacteria() {
		
		if(Timer.seconds != spawnedTemp && Timer.seconds != 0 && Timer.seconds % spawnRate == 0){
			bacterias.add(new OriginalBacteria());
			spawnedTemp = Timer.seconds;
		}
	}




}

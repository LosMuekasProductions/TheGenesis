package com.mygdx.game;

import java.util.ArrayList;

public class OriginalBacteriaSpawner {

	private float spawnRate;
	private float despawnRate;

	public ArrayList<OriginalBacteria> bacterias;

	public OriginalBacteriaSpawner(float spawnRate, float despawnRate) {

		this.spawnRate = spawnRate;
		this.despawnRate = despawnRate;
		bacterias = new ArrayList<OriginalBacteria>();
		
		bacterias.add(new OriginalBacteria());
		
		

	}



	public void spawnBacteria() {
		if(Timer.seconds % spawnRate == 0){
			bacterias.add(new OriginalBacteria());
		}
	}




}

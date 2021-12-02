package com.jduncan.zookeeper;

public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		setEnergyLevel(100);
	}
	
	// Methods
	public int displayEnergy() {
		System.out.println("Energy level is: " + this.getEnergyLevel());
		return energyLevel;
	}
	
	//Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
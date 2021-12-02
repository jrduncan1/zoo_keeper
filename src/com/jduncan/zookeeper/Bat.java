package com.jduncan.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Wooooooooosh");
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.printf("Bat energy level: %s \n", this.getEnergyLevel());
	}
	
	public void eatHumans() {
		System.out.println("Nom nom nom nom nom");
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.printf("Bat energy level: %s \n", this.getEnergyLevel());
	}
	
	public void attackTown() {
		System.out.println("FIIIIIIIRE!");
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.printf("Bat energy level: %s \n", this.getEnergyLevel());
	}

}

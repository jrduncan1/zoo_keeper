package com.jduncan.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		
	}
	
	public void throwSomething() {
		System.out.println("Gorilla is throwing things!! DUCK!");
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.printf("Gorilla energy level is %s \n", getEnergyLevel());
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is eating bananas. Gorilla is happy.");
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.printf("Gorilla energy level is %s \n", getEnergyLevel());
	}
	
	public void climb() {
		System.out.println("Gorilla is climing a tree.");
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.printf("Gorilla energy level is %s \n", getEnergyLevel());
	}
	
}

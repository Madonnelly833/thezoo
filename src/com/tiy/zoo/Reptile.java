package com.tiy.zoo;

public class Reptile extends Tanked {

	protected int legNumber = 0;

	public Reptile(boolean isAlive, double weight, boolean isEndangered, String name, boolean fullOfWater, int tankSize,
			boolean heatElement, int legNumber) {
		super(isAlive, weight, isEndangered, name, fullOfWater, tankSize, heatElement);
		this.legNumber = legNumber;
	}

	public int getLegNumber() {
		return legNumber;
	}

	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}

	@Override
	public String toString() {

		String water = null;
		if (fullOfWater) {
			water = "a tank of water.";
		} else {
			water = "a glass tank.";
		}

		String alive = null;
		if (isAlive) {
			alive = "live";
		} else {
			alive = "dead";
		}

		String endangered = null;
		if (isEndangered) {
			endangered = "Endangered";
		} else {
			endangered = "Non-Endangered";
		}

		String heat = null;
		if (heatElement) {
			heat = "a heated";
		} else {
			heat = "an unheated";
		}

		return "I went to the zoo and saw a " + alive + " " + endangered + " " + name + ". It was in " + heat + ", "
				+ tankSize + " " + water + " It weighs " + weight + " lb(s) and has " + legNumber + "legs!";
	}
	
	@Override
	public void animalSays() {
System.out.println("It smelled like a dumpster.");		
	}

}

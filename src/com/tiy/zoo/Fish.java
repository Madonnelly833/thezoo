package com.tiy.zoo;

public class Fish extends Tanked {

	protected boolean freshWater = false;

	public Fish(boolean isAlive, double weight, boolean isEndangered, String name, boolean fullOfWater, int tankSize,
			boolean heatElement, boolean freshWater) {
		super(isAlive, weight, isEndangered, name, fullOfWater, tankSize, heatElement);
		this.freshWater = freshWater;
	}

	public boolean isFreshWater() {
		return freshWater;
	}

	public void setFreshWater(boolean freshWater) {
		this.freshWater = freshWater;
	}

	@Override
	public String toString() {
		String fresh = null;
		if (freshWater) {
			fresh = "freshwater";
		} else {
			fresh = "salt water";
		}

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
				+ fresh + ", " + tankSize + "gallon " + water + " It weighs " + weight + " lb(s)";
	}
	
	@Override
	public void animalSays() {
System.out.println("It yelled to me 'glub glub glub' ");		
	}

}

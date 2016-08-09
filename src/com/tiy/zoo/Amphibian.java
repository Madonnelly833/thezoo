package com.tiy.zoo;

public class Amphibian extends Tanked {

	protected boolean hasTail = false;

	public Amphibian(boolean isAlive, double weight, boolean isEndangered, String name, boolean fullOfWater,
			int tankSize, boolean heatElement, boolean hasTail) {
		super(isAlive, weight, isEndangered, name, fullOfWater, tankSize, heatElement);
		this.hasTail = hasTail;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	@Override
	public String toString() {
		String tail = null;
		if (hasTail) {
			tail = "has a tail!";
		} else {
			tail = "doesn't have a tail!";
		}

		String water = null;
		if (fullOfWater) {
			water = "gallon tank of water.";
		} else {
			water = "gallon glass tank.";
		}

		String alive = null;
		if (isAlive) {
			alive = "live";
		} else {
			alive = "dead";
		}

		String endangered = null;
		if (isEndangered) {
			endangered = "endangered";
		} else {
			endangered = "non-endangered";
		}

		String heat = null;
		if (heatElement) {
			heat = "a heated";
		} else {
			heat = "an unheated";
		}

		return "I went to the zoo and saw a " + alive + " " + endangered + " " + name + ". It was in " + heat + ", "
				+ tankSize + " " + water + " It weighs " + weight + " lb(s) and " + tail;
	}
	
	@Override
	public void animalSays() {
System.out.println("They taste like chicken.");		
	}

}

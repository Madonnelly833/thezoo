package com.tiy.zoo;

public class Bird extends Caged {

	protected float wingSpan = 0.0f;

	public Bird(boolean isAlive, double weight, boolean isEndangered, String name, boolean isEnclosed, int squareFeet,
			float wingSpan) {
		super(isAlive, weight, isEndangered, name, isEnclosed, squareFeet);
		this.wingSpan = wingSpan;
	}

	public float getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(float wingSpan) {
		this.wingSpan = wingSpan;
	}

	@Override
	public String toString() {
		String enclosed = null;
		if (isEnclosed) {
			enclosed = "cage.";
		} else {
			enclosed = "open space.";
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


		return "I went to the zoo and saw a " + alive + " " + endangered + " " + name + ". It was in a " + squareFeet + "sq ft. "
				+ enclosed + " It weighs " + weight + " lb(s) and has a wingspan of " + wingSpan + " feet!";
	}

	@Override
	public void animalSays() {
System.out.println("I wonder if he's cuckoo for cocoa puffs?");		
	}
	
}

package com.tiy.zoo;

public class Mammal extends Caged {

	protected String hairColor = null;

	public Mammal(boolean isAlive, double weight, boolean isEndangered, String name, boolean isEnclosed, int squareFeet,
			String hairColor) {
		super(isAlive, weight, isEndangered, name, isEnclosed, squareFeet);
		this.hairColor = hairColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
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
		+ enclosed + " It weighs " + weight + " lb(s) and has the color " + hairColor + "!";
	}

	@Override
	public void animalSays() {
System.out.println("I think it's a boy.");		
	}

}

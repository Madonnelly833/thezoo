package com.tiy.zoo;

public abstract class Animal {

	
	protected boolean isAlive = false;
	protected double weight = 0.0;
	protected boolean isEndangered = false;
	protected String name = null;

	public Animal(boolean isAlive, double weight, boolean isEndangered, String name) {
		
		this.isAlive = isAlive;
		this.weight = weight;
		this.isEndangered = isEndangered;
		this.name = name;
	}


	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isEndangered() {
		return isEndangered;
	}

	public void setEndangered(boolean isEndangered) {
		this.isEndangered = isEndangered;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract void animalSays(); 

}

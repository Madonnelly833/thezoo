package com.tiy.zoo;

public abstract class Caged extends Animal{
	
	protected boolean isEnclosed = false;
	protected int squareFeet = 0;


	public Caged(boolean isAlive, double weight, boolean isEndangered, String name, boolean isEnclosed,
			int squareFeet) {
		super(isAlive, weight, isEndangered, name);
		this.isEnclosed = isEnclosed;
		this.squareFeet = squareFeet;
	}

	public boolean isEnclosed() {
		return isEnclosed;
	}

	public void setEnclosed(boolean isEnclosed) {
		this.isEnclosed = isEnclosed;
	}

	public int getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}

	
	
	

}

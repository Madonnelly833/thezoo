package com.tiy.zoo;

public abstract class Tanked extends Animal{
	
	protected boolean fullOfWater = false;
	protected int tankSize = 0;
	protected boolean heatElement = false;
	public Tanked(boolean isAlive, double weight, boolean isEndangered, String name, boolean fullOfWater, int tankSize,
			boolean heatElement) {
		super(isAlive, weight, isEndangered, name);
		this.fullOfWater = fullOfWater;
		this.tankSize = tankSize;
		this.heatElement = heatElement;
	}
	public boolean isFullOfWater() {
		return fullOfWater;
	}
	public void setFullOfWater(boolean fullOfWater) {
		this.fullOfWater = fullOfWater;
	}
	public int getTankSize() {
		return tankSize;
	}
	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}
	public boolean isHeatElement() {
		return heatElement;
	}
	public void setHeatElement(boolean heatElement) {
		this.heatElement = heatElement;
	}
	
	
	
	

}

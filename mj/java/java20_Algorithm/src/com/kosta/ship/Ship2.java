package com.kosta.ship;

abstract public class Ship2 {

	protected int fuelTank;
	protected String shipName;

	public String toString(){
		return "  " + shipName + "\t" + fuelTank;
	}
	
	public Ship2() {
	}

	public Ship2(int fuelTank, String shipName) {
		this.fuelTank = fuelTank;
		this.shipName = shipName;
	}

	abstract public void sail(int dist);
	abstract public void refuel(int fuel);

	public int getFuelTank() {
		return fuelTank;
	}
	
	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	
	public String getShipName(){
		return shipName;
	}
}

package com.kosta.ship;

public class Boat2 extends Ship2 {

	public Boat2() {
		super();
	}

	public Boat2(int fuelTank, String shipName) {
		super(fuelTank, shipName);
	}
	
	public void sail(int dist){
		setFuelTank(getFuelTank() - (dist*10));
	}
	
	public void refuel(int fuel){
		setFuelTank(getFuelTank() - (fuel*10));
	}
}

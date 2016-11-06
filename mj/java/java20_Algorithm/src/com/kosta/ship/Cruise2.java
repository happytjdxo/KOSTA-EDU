package com.kosta.ship;

public class Cruise2 extends Ship2{
	
	public Cruise2() {
		super();
	}
	
	public Cruise2(int fuelTank, String shipName) {
		super(fuelTank, shipName);
	}
	
	public void sail(int dist) {
		setFuelTank(getFuelTank() - (dist*13));
	}
	
	public void refuel(int fuel) {
		setFuelTank(getFuelTank() + (fuel*8));
	}
	
}

package com.kosta.ship;

public class Cruise extends Ship{
	
	public Cruise(){}
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int distance) {
		int fuel = this.getFuelTank();
		fuel -= distance*13;
		this.setFuelTank(fuel);
	}
	@Override
	public void refuel(int f) {
		int fuel = this.getFuelTank();
		fuel += f*8;
		this.setFuelTank(fuel);
	}
}

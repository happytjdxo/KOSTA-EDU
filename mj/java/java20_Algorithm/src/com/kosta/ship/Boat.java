package com.kosta.ship;

public class Boat extends Ship{

	public Boat(){}
	public Boat(String shipName, int fuelTank){
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	
	@Override
	public void sail(int distance) {
		int fuel = this.getFuelTank();
		fuel -= distance*10;
		this.setFuelTank(fuel);
	}
	@Override
	public void refuel(int f) {
		int fuel = this.getFuelTank();
		fuel += f*10;
		this.setFuelTank(fuel);
	}
}

package com.kosta.test;

import java.util.Vector;

import com.kosta.ship.Boat2;
import com.kosta.ship.Cruise2;
import com.kosta.ship.Ship;
import com.kosta.ship.Ship2;

public class AbstractVehicleTest2 {
	public static void main(String[] args) {
		
	Vector<Ship2> v = new Vector<Ship2>(1,1);
	
	v.add(new Boat2(5000, "Boat01"));
	v.add(new Cruise2(1000, "Cruise01"));
	
	System.out.println("  BoatName\tCruise");
	System.out.println("-----------------------------------");
	for(int i=0; i<v.size(); i++){
		System.out.println(v.get(i));
	}
	
	System.out.println("\n10운항");
	System.out.println("  BoatName\tCruise");
	System.out.println("-----------------------------------");
	for(int i=0; i<v.size(); i++) {
		v.get(i).sail(10);
		System.out.println(v.get(i));
	}

	System.out.println("\n50주유");
	System.out.println("  BoatName\tCruise");
	System.out.println("-----------------------------------");
	for(int i=0; i<v.size(); i++) {
		v.get(i).refuel(50);
		System.out.println(v.get(i));
		}
	}
}

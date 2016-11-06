package com.kosta.test;

import java.util.Vector;

import com.kosta.ship.Boat;
import com.kosta.ship.Cruise;
import com.kosta.ship.Ship;

public class AbstractVehicleTest {
	public static void main(String[] args) {

		Vector<Ship> v1 = new Vector<Ship>();
		
		v1.add(new Boat("Boat01", 500));
		v1.add(new Cruise("Cruise01", 1000));

		System.out.println("  shipName\t fuelTank");
		System.out.println("  --------------------------");
		for(int i=0; i<v1.size(); i++){	// 여기서 size는 무엇?
			
			/*Ship ship = v1.get(i);
			System.out.println("  " + ship.getShipName() + "\t\t" + ship.getFuelTank());*/
			System.out.println("  " + v1.get(i).getShipName() + "\t\t" + v1.get(i).getFuelTank());
		}
		
		System.out.println("\n10 운항");
		System.out.println("  shipName\t fuelTank");
		System.out.println("  --------------------------");
		for(int i=0; i<v1.size(); i++){
			/*Ship ship = v1.get(i);
			ship.sail(10);
			System.out.println("  " + ship.getShipName() + "\t\t" + ship.getFuelTank());*/
			System.out.println("  " + v1.get(i).getShipName() + "\t\t" + v1.get(i).getFuelTank());
		}
		
		System.out.println("\n50 주유");
		System.out.println("  shipName\t fuelTank");
		System.out.println("  --------------------------");
		for(int i=0; i<v1.size(); i++){
			/*Ship ship = v1.get(i);
			ship.refuel(50);
			System.out.println("  " + ship.getShipName() + "\t\t" + ship.getFuelTank());*/
			System.out.println("  " + v1.get(i).getShipName() + "\t\t" + v1.get(i).getFuelTank());
		}
	}
}

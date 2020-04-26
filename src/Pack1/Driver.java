// ----------------------------------------------------- 
// Part: II
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack1;

import Pack2.Helicopter;
import Pack2.Quadcopter;
import Pack3.Multirotor;
import Pack4.UAV;
import Pack5.AgriculturalDrone;
import Pack5.MAV;

public class Driver {

	public static FlyObject[] copyFlyingObjects(FlyObject[] objArray) {
		FlyObject[] newObjArray = new FlyObject[objArray.length];
		for (int i = 0; i < objArray.length; ++i) {
			if (objArray[i] instanceof Airplane) {
				newObjArray[i] = new Airplane((Airplane)objArray[i]);
			}
			if (objArray[i] instanceof UAV) {
				newObjArray[i] = new UAV((UAV)objArray[i]);
			}
		}
		return newObjArray;
	}
	
	public static void main(String[] args) {
		
		//manually create multiple FlyObjects, and put them into an array
		final int arrayLength = 20;
		FlyObject[] objArray = new FlyObject[arrayLength];
		Airplane air1 = new Airplane();
		objArray[0] = air1;
		
		Airplane air2 = new Airplane("Bombardier", 150000.0, 15000);
		objArray[1] = air2;
		Airplane air3 = new Airplane("GE", 45000.99, 34250);
		objArray[2] = air3;
		Helicopter heli1 = new Helicopter("Boeing", 3400.89, 2000, 12, 2000, 48);
		objArray[3] = heli1;
		Helicopter heli2 = new Helicopter("AirBus", 80050.99, 5000, 12, 2012, 50);
		objArray[4] = heli2;
		Quadcopter quad1 = new Quadcopter();
		objArray[5] = quad1;
		Quadcopter quad2 = new Quadcopter("Embraer", 345678.99, 12000, 8, 2019, 39, 1200);
		objArray[6] = quad2;
		Quadcopter quad3 = new Quadcopter(quad2);
		objArray[7] = quad3;
		Multirotor multi1 = new Multirotor();
		objArray[8] = multi1;
		Multirotor multi2 = new Multirotor("GE", 23800.25, 4000, 16, 1999, 128, 4);
		objArray[9] = multi2;
		Multirotor multi3 = new Multirotor("AirBus", 38223.45, 9500, 14, 2012, 128, 9);
		objArray[10] = multi3;
		UAV uav1 = new UAV();
		objArray[11] = uav1;
		UAV uav2 = new UAV(14300.89, 150000.9);
		objArray[12] = uav2;
		AgriculturalDrone agri1 = new AgriculturalDrone(234, 2340.55, "AirCanada", 234);
		objArray[13] = agri1;
		AgriculturalDrone agri2 = new AgriculturalDrone(2542, 250000.93, "LockHeed", 3200);
		objArray[14] = agri2;
		MAV mav1 = new MAV(56728.99, 89720.3, "EA898-2010", 20.1);
		objArray[15] = mav1;
		MAV mav2 = new MAV(18000.5, 345000.0, "S800-AS", 200.5);
		objArray[16] = mav2;
		
		// Using toString() to display info about flying objects
		System.out.println("Following is the infomation for flying objects:");
		for (int i = 0; i < arrayLength; ++i) {
			if (objArray[i] != null) {
				System.out.println(objArray[i]);
			}
		}
		
		// Using equals() to compare some of the objects
		System.out.println("\nexamples of using equals() method");
		System.out.println("Is object 7 equals object 8: " + objArray[6].equals(objArray[7]));
		System.out.println("Is object 6 equals object 7: " + objArray[5].equals(objArray[6]));
		/**
		 * find two least expensive planes
		 */
		int index_f = 0;
		int index_s = 0;
		double first = objArray[0].getPrice();
		double second = objArray[0].getPrice();
		for (int i = 0; i < arrayLength; ++i) {
			if(objArray[i] != null) {
				if ((objArray[i].getPrice() < first)) {
					second = first;
					index_s = index_f;
					first = objArray[i].getPrice();
					index_f = i;
				} else if (objArray[i].getPrice() < second) {
					second = objArray[i].getPrice();
					index_s = i;
				}
			}
		}
		System.out.println("\nThe least expensive plane: " + objArray[index_f].toString());
		System.out.println("The second least expensive plane: " + objArray[index_s].toString());
		
		//call method to copy objects
		FlyObject[] newObjArray = copyFlyingObjects(objArray);
		// display copy results
		System.out.println("\nThe copying result are following: ");
		for (int i = 0; i < arrayLength; ++i) {
			if (newObjArray[i] != null) {
				System.out.println(newObjArray[i]);
			}
		}
		/*
		 * The copying is NOT successful, because that the copy constructor is not inherited by subclasses.
		 */
		System.out.println("\nThe program has ended.");
	}

}

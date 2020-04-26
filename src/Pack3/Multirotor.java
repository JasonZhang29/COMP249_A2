// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack3;
import Pack2.Helicopter;

public class Multirotor extends Helicopter {

	private int rotor;
	/**
	 * default constructor
	 */
	public Multirotor() {
		rotor = 2;
	}
	/**
	 * parameterized constructor
	 * @param brand for Brand
	 * @param price for Price
	 * @param hp for Horsepower
	 * @param cylinder for Number of cylinders
	 * @param birthYear for Creation Year
	 * @param passenger for Passenger Capacity
	 * @param rotor for Number of rotors
	 */
	public Multirotor(String brand, double price, int hp, int cylinder, int birthYear, int passenger, int rotor) {
		super(brand, price, hp, cylinder, birthYear, passenger);
		this.rotor = rotor;
	}
	/**
	 * copy constructor
	 * @param m for a Multiroter object
	 */
	public Multirotor(Multirotor m) {
		super(m);
		rotor = m.rotor;
	}
	//Accessors
	public int getRotor() {
		return rotor;
	}
	//Mutators
	public void getRotor(int rotor) {
		this.rotor = rotor;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " It has " + rotor + " rotors."; 
	}
	/**
	 * Override equals()
	 * @return boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj.getClass() != getClass()) {
			return false;
		} else {
			Multirotor m = (Multirotor)obj;
			return (super.equals(m) && m.rotor == rotor);
		}
	}
}

// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack2;
import Pack1.Airplane;

public class Helicopter extends Airplane {
	
	private int cylinder;
	private int birthYear;
	private int passenger;
	/**
	 * default constructor
	 */
	public Helicopter() {
		super();
		cylinder = 4;
		birthYear = 2000;
		passenger = 2;
	}
	/**
	 * parameterized constructor
	 * @param brand for Brand
	 * @param price for Price
	 * @param hp for Horsepower
	 * @param cylinder for Number of cylinders
	 * @param birthYear for Creation Year
	 * @param passenger for Passenger Capacity
	 */
	public Helicopter(String brand, double price, int hp, int cylinder, int birthYear, int passenger) {
		super(brand, price, hp);
		this.cylinder = cylinder;
		this.birthYear = birthYear;
		this.passenger = passenger;
	}
	/**
	 * copy constructor
	 * @param h	for an Helicopter object
	 */
	public Helicopter(Helicopter h) {
		super(h);
		cylinder = h.cylinder;
		birthYear = h.birthYear;
		passenger = h.passenger;
	}
	//Accessors
	public int getCylinder() {
		return cylinder;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public int getPassenger() {
		return passenger;
	}
	//mutators
	public void setCylinder(int c) {
		cylinder = c;
	}
	
	public void setBirthYear(int b) {
		birthYear = b;
	}
	
	public void setPassenger(int p) {
		passenger = p;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " It has " + cylinder + " cylinders. It was produced in " + birthYear
				+ " Its capacity is " + passenger + " passengers.";
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
			Helicopter h = (Helicopter)obj;
			return (super.equals(h) && h.cylinder == cylinder && h.birthYear == birthYear && h.passenger == passenger);
		}
	}
}

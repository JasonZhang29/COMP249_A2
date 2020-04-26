// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack5;
import Pack4.UAV;

public class AgriculturalDrone extends UAV {

	private String brand;
	private int capacity;
	/**
	 * default constructor
	 */
	public AgriculturalDrone() {
		super();
		brand = "GE";
		capacity = 1000;
	}
	/**
	 * parameterized constructor
	 * @param weight for Weight
	 * @param price for Price	
	 * @param brand for Brand
	 * @param capacity for CarryLoad
	 */
	public AgriculturalDrone(double weight, double price, String brand, int capacity) {
		super(weight, price);
		if (brand == null) {
			System.out.println("Null Parameter");
			return;	
		}
		this.brand = brand;
		this.capacity = capacity;
	}
	/**
	 * copy constructor
	 * @param a for an AgriculturalDrone object
	 */
	public AgriculturalDrone(AgriculturalDrone a) {
		super(a);
		brand = a.brand;
		capacity = a.capacity;
	}
	//Accessors
	public String getBrand() {
		return brand;
	}
	
	public int getCapacity() {
		return capacity;
	}
	//Mutators
	public void setBrand(String brand) {
		if (brand == null) {
			System.out.println("Null Parameter");
			return;
		}
		this.brand = brand;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " This agriculturalDrone is manufactured by " + brand + ". It has " + capacity + " carry load.";
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
			AgriculturalDrone a = (AgriculturalDrone)obj;
			return (super.equals(a) && a.brand == brand && a.capacity == capacity);
		}
	}
}

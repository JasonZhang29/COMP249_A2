// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack4;

import Pack1.FlyObject;

public class UAV extends FlyObject{

	private double weight;
	private double price;
	/**
	 * default constructor
	 */
	public UAV() {
		weight = 10000.0;
		price = 5125.99;
	}
	/**
	 * parameterized constructor
	 * @param weight for Weight
	 * @param price for Price
	 */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	/**
	 * copy constructor
	 * @param u for an UAV object
	 */
	public UAV(UAV u) {
		if (u == null) {
			System.out.println("Null Parameter");
			return;	
		}
		weight = u.weight;
		price = u.price;
	}
	//Accessors
	public double getWeight() {
		return weight;
	}
	
	public double getPrice() {
		return price;
	}
	// mutators
	public void setWeight(double w) {
		weight = w;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return "This UAV weighs " + weight + " pounds. It costs " + price + " dollars.";
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
			UAV u = (UAV)obj;
			return (u.weight == weight && u.price == price);
		}
	}

}

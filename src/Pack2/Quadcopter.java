// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack2;

public class Quadcopter extends Helicopter {

	private int speed;
	/**
	 * default constructor
	 */
	public Quadcopter() {
		super();
		speed = 1000;
	}
	/**
	 * parameterized constructor 
	 * @param brand for Brand
	 * @param price for Price
	 * @param hp for Horsepower
	 * @param cylinder for Number of cylinders
	 * @param birthYear for Creation Year
	 * @param passenger for Passenger Capacity
	 * @param speed for Speed
	 */
	public Quadcopter(String brand, double price, int hp, int cylinder, int birthYear, int passenger, int speed) {
		super(brand, price, hp, cylinder, birthYear, passenger);
		this.speed = speed;
	}
	/**
	 * copy constructor
	 * @param q for a Quadcopter object
	 */
	public Quadcopter(Quadcopter q) {
		super(q);
		speed = q.speed;
	}
	//Accessors
	public int getSpeed() {
		return speed;
	}
	//Mutators
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " Its max speed is " + speed + ".";
	}
	/**
	 * Override equals()
	 * @return boolean
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj.getClass() != getClass()) {
			return false;
		} else {
			Quadcopter q = (Quadcopter)obj;
			return (super.equals(q) && speed == q.speed);
		}
	}
}

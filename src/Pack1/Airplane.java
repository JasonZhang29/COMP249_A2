// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack1;

public class Airplane extends FlyObject {

	private String brand;
	private double price;
	private int hp;
	/**
	 * default constructor
	 */
	public Airplane() {
		brand = "Boeing";
		price = 100500.89;
		hp = 20000;
	}
	/**
	 * parameterized constructor
	 * @param brand for Brand
	 * @param price for Price
	 * @param hp for Horsepower
	 */
	public Airplane(String brand, double price, int hp) {
		if (brand == null) {
			System.out.println("Null Parameter");
			return;
		}
		this.brand = brand;
		this.price = price;
		this.hp = hp;
	}
	/**
	 * copy constructor
	 * @param a for an Airplane object
	 */
	public Airplane(Airplane a) {
		if (a == null) {
			System.out.println("Null Parameter");
			return;	
		}
		brand = a.brand;
		price = a.price;
		hp = a.hp;
	}
	//Accessors
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getHP() {
		return hp;
	}
	//mutators
	public void setBrand(String brand) {
		if (brand == null) {
			System.out.println("Null Parameter");
			return;
		} 
		this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return "This airplane is manufactured by " + brand + ". It has " + hp + " HP. It costs " + price + " dollars.";
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
			Airplane a = (Airplane)obj;
			return (a.brand == brand && a.price == price && a.hp == hp);
		}
	}
}

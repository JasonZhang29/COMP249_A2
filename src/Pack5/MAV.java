// ----------------------------------------------------- 
// Part: I
// Written by: Xin Yuan Zhang (26373127)
// ----------------------------------------------------- 
package Pack5;
import Pack4.UAV;

public class MAV extends UAV {

	private String model;
	private double size;
	/**
	 * default constructor
	 */
	public MAV() {
		super();
		model = "";
		size = 100.0;
	}
	/**
	 * parameterized constructor
	 * @param weight for Weight
	 * @param price for Price
	 * @param model for Model
	 * @param size for Size
	 */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		if (model == null) {
			System.out.println("Parameter is null");
			return;	
		}
		this.model = model;
		this.size = size;
	}
	/**
	 * copy constructor
	 * @param m for a MAV object
	 */
	public MAV(MAV m) {
		super(m);
		this.model = m.model;
		this.size = m.size;
	}
	//Accessors
	public String getModel() {
		return model;
	}
	
	public double getSize() {
		return size;
	}
	//Mutators
	public void setModel(String m) {
		if (m == null) {
			System.out.println("Null Parameter");
			return;
		}
		model = m;
	}
	
	public void setSize(double s) {
		size = s;
	}
	/**
	 * Override toString()
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " This MAV model is " + model + ". Its size is " + size + ".";
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
			MAV m = (MAV)obj;
			return (super.equals(m) && m.model == model && m.size == size);
		}
	}
}

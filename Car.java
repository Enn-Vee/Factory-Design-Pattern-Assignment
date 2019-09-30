
public class Car extends Toy{
	/**
	 * Initializes type of toy.
	 */
	public Car() {
		this.name = "Car";
	}
	/**
	 * Prints assembly steps of type Car.
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Make the body");
		System.out.println("Add the wheels");
		System.out.println("Paint the car");
	}
}

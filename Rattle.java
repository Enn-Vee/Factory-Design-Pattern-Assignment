
public class Rattle extends Toy {
	/**
	 * Initializes type of toy.
	 */
	public Rattle() {
		this.name = "Rattle";
	}
	/**
	 * Prints assembly steps of type Rattle.
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame");
		System.out.println("Add the pebbles");
		System.out.println("Secure the sides");
	}
}

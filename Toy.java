/**
 * Object Toy and its methods
 * @author Nick Bautista
 *
 */
public class Toy {
	protected String name;//Holds a variable of type String which contains the type of the toy being made.
	/**
	 * Prints string for assembly toy
	 */
	public void assemble() {
		System.out.println("Putting together a "+name);
	}
	/**
	 * Prints string for boxing toy
	 */
	public void boxToy() {
		System.out.println("Putting the "+name+" in a box");
	}
	/**
	 * Prints string for pricing toy
	 */
	public void priceToy() {
		System.out.println("Adding price on "+name);
	}
	
}

 
public class Doll extends Toy {
	/**
	 * Initializes type of toy.
	 */
	public Doll() {
		this.name = "Doll";
	}
	/**
	 * Prints assembly steps of type Doll.
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Connect all pieces");
		System.out.println("Paint the face");
		System.out.println("Add the dress");
		System.out.println("Add the shoes");
	}
}

/**
 * Class which gives the toy a type.
 * @author Nick Bautista
 *
 */
public class ToyStore {
	public Toy orderToy(String type) {
		Toy newToy;
		/**
		 *Instantiates type given by user. Also calls the three print methods.
		 */
		if(type.equalsIgnoreCase("doll")) {
			newToy = new Doll();
			newToy.assemble();
			newToy.boxToy();
			newToy.priceToy();
		}
		else if(type.equalsIgnoreCase("car")) {
			newToy = new Car();
			newToy.assemble();
			newToy.boxToy();
			newToy.priceToy();
		}
		else {
			newToy = new Rattle();
			newToy.assemble();
			newToy.boxToy();
			newToy.priceToy();
		}
		return newToy;
	}
}

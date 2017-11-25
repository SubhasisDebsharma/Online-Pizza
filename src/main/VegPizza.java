/**
 * 
 */
package main;

/**
 * @author subhasis
 *
 */
public class VegPizza extends Pizza{
	private int size; 
	private String type;
	public VegPizza(int size, String type) throws InvalidPizzaException{
		if(!validate(size, type))	throw new InvalidPizzaException("Wrong size or type");
		this.size = size;
		this.type = type;
	}
	
	@Override
	float calculatePrice() {
		switch (type) {
		case "PLAIN":
			return size * 50.0f;
			
		case "DELUXE":
			return size * 50.0f + 100;

		case "SUPREME":
			return size * 50.0f + 150;
			
		default:
			return 0.0f;
		}
	}
}

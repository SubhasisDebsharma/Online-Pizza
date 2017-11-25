/**
 * 
 */
package main;

/**
 * @author subhasis
 *
 */
public class NonVegPizza extends Pizza{
	private int size; 
	private String type;
	public NonVegPizza(int size, String type) throws InvalidPizzaException{
		if(!validate(size, type))	throw new InvalidPizzaException("Wrong size or type");
		this.size = size;
		this.type = type;
	}
	
	@Override
	float calculatePrice() {
		switch (type) {
		case "PLAIN":
			return size * 100.0f;
			
		case "DELUXE":
			return size * 100.0f + 150;

		case "SUPREME":
			return size * 100.0f + 200;
			
		default:
			return 0.0f;
		}
	}

}

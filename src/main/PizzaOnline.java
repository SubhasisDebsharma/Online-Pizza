/**
 * 
 */
package main;

/**
 * @author subhasis
 *
 */
public class PizzaOnline {

	private float totalSales;
	
	public PizzaOnline() {
		totalSales = 0.0f;
	}
	
	public static void main(String[] args) throws InvalidPizzaException {
		PizzaOnline po = new PizzaOnline();
		VegPizza vp1 = new VegPizza(9, "PLAIN");
		NonVegPizza nvp1 = new NonVegPizza(12, "DELUXE");
		VegPizza vp2 = new VegPizza(6,"SUPREME");
		//to test exception
		//VegPizza vp3 = new VegPizza(12, "NORMAL");
		Float price=po.order(vp1);
		System.out.println(price);
		price=po.order(nvp1);
		System.out.println(price);
		price=po.order(vp2);
		System.out.println(price);
		System.out.println(po.getTotalSales());
	}
	

	float order(Pizza pizza){
		float price = pizza.calculatePrice();
		totalSales += price;
		return price;
	}
	
	float getTotalSales(){
		return totalSales;
	}

}

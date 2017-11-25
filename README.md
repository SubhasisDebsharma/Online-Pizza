# Online-Pizza
There’s an online pizza order store which accepts orders for Veg-Pizza and Non-veg Pizza each in different sizes and types.

Size of Pizza are: (6,9,12 inches);
Types of Pizza are: (PLAIN, DELUXE, SUPREME).

The cost of Pizza are as follows:
  For Veg-Pizza the base price is Rs.50 multiplied by the size of pizza
for PLAIN type and extra charges are added for premium types.
(DELUXE Rs.100 extra charge and SUPREME Rs.150 extra charge)
  For NonVeg-Pizza the base price is Rs.100 multiplied by the size of
pizza for PLAIN type and extra charges are added for premium
types. (DELUXE Rs.150 extra charge and SUPREME Rs.200 extra charge)

They also wanted to calculate total sales made. There are a total of 5 classes; one abstract class Pizza, Classes VegPizza and NonVegPizza, user defined exception class – InvalidPizzaException and Main class PizzaOnline.

The classes have following properties:
## Pizza
It is an abstract class and has following methods:
* `abstract float calculatePrice()`
* `public boolean validate(int size, String type)` – This method returns
true if the valid size and type are given else returns false.
## VegPizza
This extends Pizza, and has private members `size` and `type`.(variables)
* `VegPizza(int size, String type)` – this constructor validates the size and
type of pizza by using validate method from Pizza, if the result is
false it then throws InvalidPizzaException.
Else assigns the values to instance variables size and type.
* `float calculatePrice()` – Calculates the price of Pizza for the given
size and type using the above prices.
## NonVegPizza
This extends Pizza, and has private members `size` and `type`.(variables)
* `NonVegPizza(int size, String type)` – this method validates the size
and type of pizza by using validate method from Pizza, if the result
is false it then throws InvalidPizzaException.
Else assigns the values to instance variables size and type.
* `float calculatePrice()` – Calculates the price of Pizza for the given size
and type using the above prices.

## PizzaOnline
This is the class which contains main method, contains a private float
variable `totalSales`.
Contains the following methods:
* `float order(Pizza pizza)` – calculates price of pizza
* `float getTotalSales()` – calculates the price of total sales made until now.
```java
Public static void main(String args[]) throws InvalidPizzaException{  
    PizzaOnline po = new PizzaOnline();  
    VegPizza vp1 = new VegPizza(9, "PLAIN");  
    NonVegPizza nvp1 = new NonVegPizza(12, "DELUXE");  
    VegPizza vp2 = new VegPizza(6,"SUPREME");  
    //to test exception  
    //VegPizza vp3 = new VegPizza(12, "NORMAL");  
    Float price=po.order(vp1);  
    System.out.println(price);  
    Price=po.order(nvp1);  
    System.out.println(price);  
    Price=po.order(vp2);  
    System.out.println(price);  
    System.out.println(po.getTotalSales());  
}  
```

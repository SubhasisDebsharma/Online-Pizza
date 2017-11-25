/**
 * 
 */
package main;

import java.util.Arrays;

/**
 * @author subhasis
 *
 */
public abstract class Pizza {
	abstract float calculatePrice();
	
	public boolean validate(int size, String type){
		return ((Arrays.asList(6, 9, 12).contains(size)) && (Arrays.asList("PLAIN", "DELUXE", "SUPREME").contains(type)));
	}
}

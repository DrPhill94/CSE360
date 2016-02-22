/*
 * 	Phillip Barton
 * 	120832701
 * 	CSE 360 Assignment 3
 *	Due February 22, 2016 4PM
 * 	Description: Tutorial assignment, teaches us to use GitHub repositories,
 * 	more practice with JUnit testing
 */

package cse360assign3;
 

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {	//Constructor
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {	//Returns end value after operations
		return total;
	}
	
	public void add (int value) {	//Adds parameter to existing total
		total += value;
		history += " + " + value;
	}
	
	public void subtract (int value) {	//Subtracts parameter from existing total
		total -= value;
		history += " - " + value;
	}
	
	public void multiply (int value) {	//Multiplies existing total by parameter
		total *= value;
		history += " * " + value;
	}
	
	public void divide (int value) {	//Divides existing total by parameter, assuming not 0
		if(value != 0)
			total /= value;
		else
			total = 0;
		
		history += " / " + value;
	}
	
	public String getHistory () {	//Returns empty string
		return history;
	}
}
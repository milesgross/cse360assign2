/*
 * Miles Gross
 * CSE 360 Mon 9:40
 * Assignment 2
 * This class contains and AddingMachine constructor with methods
 * to get the total, add, subtract, convert to string, and clear the machine
 */

package cse360assign2;

public class AddingMachine {
	/*
	 * @author Miles Gross
	 * @version 1.0 10/9/19
	 * @param total total of numbers being added or subtracted
	 * @param stringTotal history of operations
	 */
	private int total;
	private String stringTotal;
	
	//Constructor that sets up a total and a stringTotal to be used
	public AddingMachine () {
		total = 0;	// not needed - included for clarity
		stringTotal = "" + total;	//base string with starting total
	}
	
	public int getTotal () {
		//@return total
		return total;
	}
	
	//adds parameter to total
	public void add (int value) {
		total = total + value;	//adds value to total
		stringTotal = stringTotal + " + " + value;	//adds the addition operation and value to string
	}
	
	//subtracts parameter to total
	public void subtract (int value) {
		total = total - value;	//subs value from total
		stringTotal = stringTotal + " - " + value;	//adds the subtraction operation and value to string
	}
	
	public String toString () {
		//@return stringTotal
		return stringTotal;
	}
	
	//resets the AddingMachine
	public void clear () {
		total = 0;	//total reset to zero
		stringTotal = "" + total;	//stringTotal reset to starting total
	}
}

//Name: Jeffin Joseph
//Student ID: 1212556083
//Professor: Calliss
//Assignment #2
//Class Number: 70642
//Description: This class contains the code to
//add, subtract, and clear a function using concatination. 

package cse360assign2;

public class AddingMachine {

	private int total; // this variable holds the total amount of values

	String history = "0"; //setting string history to 0 to concatanate the total

	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}

	public int getTotal () {// this method returns the total
		return total;
	}

	//this method adds the values passed into the parameters 
	//into the total
	public void add (int value) {
		total += value;
		history = history + " + " + value ; 
	}

	//this methods= subtracts the values passed into the parameters
	//into the total
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}

	//this method returns the current string via the history
	public String toString () {
		return history;
	}

	//this method clears the history
	public void clear() {
		total = 0;
		history = "0";
	}
}

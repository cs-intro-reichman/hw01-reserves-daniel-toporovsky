/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {

		//Takes input number of cents
		int input = Integer.parseInt(args[0]);

		//The amount of cents is a reminder of division the input by 25
		int cents = input % 25;

		//The amount of quarters is input minus the reminder of division devided by 25
		int quarters = (input-cents)/25;

		//Print 
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}
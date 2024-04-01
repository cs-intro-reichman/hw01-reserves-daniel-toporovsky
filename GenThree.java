/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.io.Console;

public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		//For Math.Random let's use formula [a;b) -> ( Math.random() * (b-a) ) + a
		//For converting double to integer let's use Type Conversion - a built-in Java feature
		int r1 = (int)((Math.random())*(b-a)+a);
		int r2 = (int)((Math.random())*(b-a)+a);
		int r3 = (int)((Math.random())*(b-a)+a);

		//Use of Math.min method to detct the minimal value 
		int min = Math.min(r1, r2);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println("The minimal generated number was " + min);
	}
}

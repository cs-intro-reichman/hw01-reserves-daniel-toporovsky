/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {

		//Takes the input values of the triangle sides length
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		//Checks if sum of any two sides is greater than third
		boolean triangle;
		if ( (a+b) > c && (a+c) > b && (b+c) > a) triangle = true;
		else triangle = false;

		//Print
		System.out.printf("%d, %d, %d: %b", a, b, c, triangle);
		System.out.println();

	}
}

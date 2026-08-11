package pratice_11th_june2026;

import java.util.Scanner;

public class TriangleCircumference {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please eneter the value of A:");
		int a = s1.nextInt();
		
		System.out.println("Please eneter the value of B:");
		int b = s1.nextInt();
		
		System.out.println("Please eneter the value of C:");
		int c = s1.nextInt();

		int circumOfTriangle = a + b + c;

		System.out.println("Circumference of triangle is " + circumOfTriangle);
		s1.close();

	}

}

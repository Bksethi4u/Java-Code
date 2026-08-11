package pratice_11th_june2026;

import java.util.Scanner;

public class Add2Numbers2 {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Please eneter the value of A:");
		int a = S1.nextInt();

		System.out.println("Please eneter the value of B:");
		int b = S1.nextInt();

		//int Sum = a + b;
		int Sum = Math.addExact(a, b); // we can use math.addExact() also to add two numbers in scanner class.
		System.out.println("sum of 2 number is -->" + Sum);

		S1.close();

	}

}

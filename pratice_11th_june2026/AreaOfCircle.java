package pratice_11th_june2026;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please eneter the value of R:");
		int r = s1.nextInt();
		double AreaOfCircle = Math.PI * r * r;

		System.out.println("Aread of Circle is " + AreaOfCircle);
		s1.close();

	}

}

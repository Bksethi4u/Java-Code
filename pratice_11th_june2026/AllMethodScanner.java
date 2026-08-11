package pratice_11th_june2026;

import java.util.Scanner;

public class AllMethodScanner {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please eneter the value of name:");
		String name = S1.next();
		System.out.println("Please eneter the value of a:");
		int a = S1.nextInt();
		System.out.println("Please eneter the value of b:");
		long b = S1.nextLong();
		System.out.println("Please eneter the value of c:");
		float c = S1.nextFloat();
		System.out.println("Please eneter the value of d:");
		int d = S1.nextByte();
		System.out.println("Please eneter the value of e:");
		int e = S1.nextShort();
		System.out.println("Please eneter the value of f:");
		double f = S1.nextDouble();
		System.out.println("Please eneter the value of g:");
		boolean g = S1.nextBoolean();
		S1.close();
		

	}

}

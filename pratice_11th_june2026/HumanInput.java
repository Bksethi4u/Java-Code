package pratice_11th_june2026;

import java.util.Scanner;

public class HumanInput {

	public static void main(String[] args) {
		Scanner S1 = new Scanner (System.in);
		System.out.println("What is your name?");
		String name=S1.next();
		System.out.println("what is your age?");
		int age = S1.nextInt();
		
		S1.close();	

	}

}

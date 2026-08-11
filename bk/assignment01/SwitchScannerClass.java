package bk.assignment01;

import java.util.Scanner;

public class SwitchScannerClass {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please eneter the value of day:");
		
		int day= S1.nextInt();

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid Day");
		}
	}

}

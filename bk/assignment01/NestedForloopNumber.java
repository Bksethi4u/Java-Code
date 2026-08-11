package bk.assignment01;

public class NestedForloopNumber {

	public static void main(String[] args) {
		// Outer loop
		for (int i = 1; i <= 2; i++) {

			// Inner loop
			if (i == 1) {
				// Print 0 to 10
				for (int j = 0; j <= 10; j++) {
					System.out.print(j + " ");
				}
			} else {
				// Print 10 to 0
				for (int j = 10; j >= 0; j--) {
					System.out.print(j + " ");
				}
			}

			// Move to the next line
			System.out.println();
		}

	}

}

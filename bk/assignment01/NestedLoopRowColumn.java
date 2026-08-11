package bk.assignment01;

public class NestedLoopRowColumn {

	public static void main(String[] args) {

		// Outer loop for rows
		for (int i = 1; i <= 2; i++) {

			// Inner loop for columns
			for (int j = 1; j <= 12; j++) {
				System.out.print("* ");
			}

			// Move to the next row
			System.out.println();

		}
	}
}

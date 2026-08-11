package bk.assignment01;

public class NestedForLoop {

	public static void main(String[] args) {
		  // Outer loop: 0 to 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Move to next line

        // Inner loop: 10 to 0
        for (int j = 10; j >= 0; j--) {
            System.out.print(j + " ");
        }

	}

}

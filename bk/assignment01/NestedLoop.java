package bk.assignment01; //WAP using nested loops to print 2 rows and 12 columns.(outerloop and inner loop)

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 2; i++) {

            // Inner loop for columns
            for (int j = 1; j <= 12; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
	}

}

package bk.assignment01;

public class ContinueProgram {

	public static void main(String[] args) {

		
		for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;   // Skip when i is 5
            }

            System.out.println(i);
        }

	}
}



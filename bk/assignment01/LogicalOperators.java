package bk.assignment01;

public class LogicalOperators {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		
		// Logical AND
		//System.out.println("Logical AND (a > b && a < 50): " + (a > b && a < 50));
		if (a > b && a < 50);{
		{
			System.out.println("Statement1");
		}

	
		// Logical OR
		//System.out.println("Logical OR (a < b || a == 20): " + (a < b || a == 20));
		if (a < b || a == 20);
		{
			System.out.println("Statement2");
		}

		// Logical AND-NOT
		//System.out.println("Logical AND-NOT (a > b && !(b > 20)): " + (a > b && !(b > 20)));
		
		if (a > b && !(b > 20));
		{
			System.out.println("Statement3");
		}
		
		// Logical OR-NOT
		//System.out.println("Logical OR-NOT (a < b || !(a < b)): " + (a < b || !(a < b)));
		
		if (a < b || !(a < b));
		{
			System.out.println("Statement4");
		}
		
		}
		
	}

}

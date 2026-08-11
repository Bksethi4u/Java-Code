package bk.assignment01;

public class StaticNonStaticMethods {

	// Static Method 1
	static void add() {
		int a = 10;
		int b = 20;
		System.out.println("Addition = " + (a + b));
	}

	// Static Method 2
	static void message() {
		System.out.println("Welcome to Java Programming");
	}

	// Non-Static Method 1
	void subtract() {
		int a = 20;
		int b = 10;
		System.out.println("Subtraction = " + (a - b));
	}

	// Non-Static Method 2
	void multiply() {
		int a = 10;
		int b = 5;
		System.out.println("Multiplication = " + (a * b));
	}

	public static void main(String[] args) {

		// Calling Static Methods
		add();
		message();

		// Creating Object for Non-Static Methods
		StaticNonStaticMethods obj = new StaticNonStaticMethods();

		// Calling Non-Static Methods
		obj.subtract();
		obj.multiply();

	}

}

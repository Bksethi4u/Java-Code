package pratice_10th_june2026;

public class GlobalVariables {

	static int a = 200;// global variable
	static int b = 100;// global variable

	static void add() // Static Method
	{

		int sum = a + b;// local variable
		System.out.println("Answer is ->" + sum);
	}

	static void sub()//  Static Method
	{

		int c = b - a;
		System.out.println("Answer is ->" + c);
	}

	static void mul()//  Static Method
	{

		int c = a * b;
		System.out.println("Answer is ->" + c);
	}

	static void div()//  Static Method
	{

		int c = a / b;
		System.out.println("Answer is ->" + c);
	}

	static void mod()//  Static Method
	{

		int c = a % b;
		System.out.println("Answer is ->" + c);
	}

	public static void main(String[] args) // Main Method
	{
		add();
		sub();
		mul();
		div();
		mod();

	}

}

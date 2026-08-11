package pratice_8th_june2026;

public class ArithmeticOperators {

	static void add() // Static Method
	{
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println("Answer is ->" + sum); // if we dont print the sum we will not get the o/p
	}

	static void sub()//  Static Method
	{
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println("Answer is ->" + c);
	}

	static void mul()//  Static Method
	{
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println("Answer is ->" + c);
	}

	 void div()// Non Static Method
	{
		int a = 10;
		int b = 200;
		int c = b / a;
		System.out.println("Answer is ->" + c);
	}

	static void mod()//  Static Method
	{
		int a = 10;
		int b = 205;
		int c = b % a;
		System.out.println("Answer is ->" + c);
	}

	public static void main(String[] args) // Main Method
	{
		add();
		sub();
		mul();
		ArithmeticOperators A1=new ArithmeticOperators();
		A1.div();
		mod();

	}

}

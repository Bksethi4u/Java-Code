package pratice_10th_june2026;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
	//	sub();
	//	mul();
	//	div();
	//	mod();
	}

	static void add() // Static Method
	{
		int a = 100;// local varibale
		int b = 200;// local varibale
		int sum = a + b;// local varibale
		System.out.println("Answer is ->" + sum);
	}

	static void sub()// Static Method
	{

		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println("Answer is ->" + c);
	}

	static void mul()// Static Method
	{
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println("Answer is ->" + c);
	}

	static void div()// Static Method
	{
		int a = 10;
		int b = 200;
		int c = b / a;
		System.out.println("Answer is ->" + c);
	}

	static void mod()// Static Method
	{
		int a = 10;
		int b = 205;
		int c = b % a;
		System.out.println("Answer is ->" + c);
	}

}

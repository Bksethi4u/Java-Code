package bk.assignment01;

public class UpdateLocalVariable {

	static void add() // Static Method
	{
		int a = 100;// local variable
		int b = 200;// local variable
		a = 900;// this is how you can update the value of local variable
		int sum = a + b;// local variable
		System.out.println("Answer is ->" + sum);
	}

	public static void main(String[] args) // Main Method
	{
		add();
	}

}

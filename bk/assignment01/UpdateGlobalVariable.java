package bk.assignment01;

public class UpdateGlobalVariable {

		static int a = 200;// global variable
		static int b = 100; 
		int z1= 90;// instance variable -->are non static variable
		static void add() 
		{
			a = 300;// this is how we update the value of global variable in case it is static
			a = 400; // We can update global variable multiple time & it will take consider the latest value only.
			int sum = a + b;// local variable
			System.out.println("Answer is ->" + sum);
		}

		public static void main(String[] args) // Main Method
		{
			add();
			UpdateGlobalVariable g1 = new UpdateGlobalVariable();
			System.out.println(g1.z1);
			g1.z1 = 100;//// this is how we update the value of global variable in case it is instance
			System.out.println(g1.z1);
			g1.z1 = 200; //We can update instance variable multiple time & it will take consider the latest value only.
			System.out.println(g1.z1);
		}

	

}

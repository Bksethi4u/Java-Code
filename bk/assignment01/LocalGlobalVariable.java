package bk.assignment01;

public class LocalGlobalVariable {

	
		int d = 100;// global variables
		int p = 900;// global variables

		static void a(boolean a, String b)// Local variable-scope will be within the method
		{
			System.out.println("Method a");
	        System.out.println("Boolean value: " + a);
	        System.out.println("String value: " + b);
		}

		static void b(String a, boolean b)// Local variable-scope will be within the method
		{
			System.out.println("Method b");
	        System.out.println("String value: " + a);
	        System.out.println("Boolean value: " + b);
		}

		static void c(double a, int b)  //local variable
		{
			System.out.println("Method c");
	        System.out.println("Double value: " + a);
	        System.out.println("Boolean value: " + b);
		}

		static void d(double a, char c)  //local variable
		{
			System.out.println("Method d");
	        System.out.println("String value: " + a);
	        System.out.println("Boolean value: " + c);
		}

		static void e(char a, char b, char c)  //local variable
		{
			System.out.println("Method e");
	        System.out.println("Char value: " + a);
	        System.out.println("Char value: " + b);
	        System.out.println("Char value: " + c);
		}

		static void f(String a, String b) //local variable
		{
			System.out.println("Method f");
	        System.out.println("String value: " + a);
	        System.out.println("String value: " + b);
		}

		public static void main(String[] args)  //local variable
		{

			a(false, "hello");
			b("Bye", true);
			c(1.1, 10);
			d(1.1, 'X');
			e('A','B','C');
			f("Hello","Balkrishna");

		}


}

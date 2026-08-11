package pratice_10th_june2026;

/*how to access instance variable, Update instance variable and update global variable in case of static 
*/
public class AccessInstanceVariable {

	static int a = 200;// global varibale
	static int b = 100;// global varibale
	int z = 90;// instance variable are non static variables
	static void add() // Static Method
	{
		a = 300;// this is how u update the value of global variable in case it is static
		a = 400; // We can update global variable multiple time & it will take consider the latest value only.
		int sum = a + b;// local varibale
		System.out.println("Answer is ->" + sum);
	}

	public static void main(String[] args) // Main Method
	{
		add();
		AccessInstanceVariable g1 = new AccessInstanceVariable();
		System.out.println(g1.z);
		g1.z = 100;// this is how we update the value of global variable in case it is instance
		System.out.println(g1.z);
		g1.z = 200; //We can update instance variable multiple time & it will take consider the latest value only.
		System.out.println(g1.z);
	}

}

package pratice_5th_june2026;

public class StaticMethod2 {

	static void add()
	{
		System.out.println("static method 1");
	}
	
	static void sub()
	{
		System.out.println("static method 2");
		add();
	}
	
	public static void main(String[] args) 
	{
		sub(); // it will call sub() method and add() method and print both
		

	}

}

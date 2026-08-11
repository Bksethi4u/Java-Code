package pratice_5th_june2026;

public class NonStaticMethods {

	void add()
	{
		System.out.println("static method 1");
	}
	
	void sub()
	{
		System.out.println("static method 2");
		add();
	}
	public static void main(String[] args) {
		
		NonStaticMethods n1= new NonStaticMethods();
		n1.add();
		n1.sub();
		NonStaticMethods n2=new NonStaticMethods(); // multiple object creation will take more memory hence not recommended
		n2.add();
		n2.sub();

	}

}

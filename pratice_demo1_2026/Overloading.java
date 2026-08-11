package pratice_demo1_2026;

public class Overloading {

	
	static void add(int a, int b) 
    {
             int sum= a+b;
		System.out.println(sum);
	}
   
   static void add (int a, int b, int c) 
    {
              int addition= a+b+c;
		System.out.println(addition);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o1 = new Overloading();
        o1.sum(100,200);
        o1.addition(100,200,300);
	}

	private void sum(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}

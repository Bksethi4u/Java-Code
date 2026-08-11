package bk.assignment01;

public class NestedIfElse {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if (a == 10)// true
		{
			System.out.println("Statement 1");
				if (b == 10) 
				{
				System.out.println("Statement 2");
				} 	
				else 
				{
				System.out.println("Statement 3");
				}
				
				if (c == 30) 
				{
				System.out.println("Statement 5");
				} 	
				else 
				{
				System.out.println("Statement 6");
				}
		} 
		else 
		{
			System.out.println("Statement 4");
		}

	}


}

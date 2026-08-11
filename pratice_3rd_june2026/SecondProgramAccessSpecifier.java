package pratice_3rd_june2026;

public class SecondProgramAccessSpecifier {
	
	 public static void add()    //Access by Everyone, Non Parametrized
     {
             
     }

     protected static void sub()//Access within the same package, Non Parametrized
     {
             
     }

      static void mul()//Access only to the same package, Non Parametrized
     {
             
     }

     private static void divide()//Access only to the class, Non Parametrized
     {
             
     }

	public static void main(String[] args) //Parametrized
	{
		// TODO Auto-generated method stub
		
		 System.out.println("Mahesh");
         System.out.println("Annu");
         System.out.println("Prachi");
	}

}

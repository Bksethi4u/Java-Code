package pratice_9th_june2026;
//Constructor Overloading:Developing multiple Constructor but varition in the argument list
//is called as Constructor overloading.
//What is varition in the argument list mean?
/*
* 1. Order of argumnets should be different
* 2. Number of argumnets can also be different
* 
*/



public class ConstructorMethods 
{
	  ConstructorMethods(int a,char b)
      {
              System.out.println("1");
      }
      ConstructorMethods(String a,char b)
      {
              System.out.println("2");

      }
      ConstructorMethods(String a,String b)
      {
              System.out.println("3");

      }
      ConstructorMethods(int a,int b)
      {
              System.out.println("4");

      }
      public static void main(String[] args) 
      {
              ConstructorMethods c1=new ConstructorMethods(100,'S');
              ConstructorMethods c2=new ConstructorMethods("Hello",'S');
              ConstructorMethods c3=new ConstructorMethods("UN","PWD");
              ConstructorMethods c4=new ConstructorMethods(100,200);

              
             /* new ConstructorsMethods(100,'S');
              new ConstructorsMethods("Hello",'S');
              new ConstructorsMethods("UN","PWD");
              new ConstructorsMethods(100,200);
              */

      }

}

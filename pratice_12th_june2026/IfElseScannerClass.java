package pratice_12th_june2026;

import java.util.Scanner;

public class IfElseScannerClass {

	public static void main(String[] args) {
		  {
              Scanner s1=new Scanner(System.in);
              System.out.println("Please Enter Your Age:");
              int age=s1.nextInt();;
              if(age>=18)
              {
                      System.out.println("Person can vote");
              }
              else
              {
                      System.out.println("Can't Vote");
              }
              s1.close();

	}

	}
}

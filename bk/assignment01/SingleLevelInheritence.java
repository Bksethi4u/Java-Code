package bk.assignment01;

public class SingleLevelInheritence {


	       static void retryLogic()
	        {
	                System.out.println("RetryLogic");
	        }
	        static void excelDatafetching()
	        {
	                System.out.println("Data Fetching");

	        }
	}
	public class H1 extends SingleLevelInheritence
	{
	        static void testcase1_LoginToAMazon()
	        {
	                System.out.println("Login to Amazon with vaid data");
	        }
	        public static void main(String[] args) 
	        {
	                excelDatafetching();
	                testcase1_LoginToAMazon();
	                retryLogic();
	        }

	

}

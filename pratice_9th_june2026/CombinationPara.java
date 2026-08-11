package pratice_9th_june2026;

public class CombinationPara {

    static void a(boolean a,String b)//any variable brown in colour is Local variable-scope will be within the method
    {
            
    	System.out.println("Method a");
        System.out.println("Boolean value: " + a);
        System.out.println("String value: " + b);
    }
    static void b(String a,boolean b)//Local variable-scope will be within the method
    {
    	System.out.println("Method b");
        System.out.println("String value: " + a);
        System.out.println("Boolean value: " + b);
    
    }
    static void c(double a,int b)
    {
    	System.out.println("Method c");
        System.out.println("Double value: " + a);
        System.out.println("Integer value: " + b);
    }
    static void d(double a,char c)
    {
        System.out.println("Method d");
        System.out.println("Double value: " + a);
        System.out.println("Character value: " + c);    
    }
    static void e(char a,char b,char c)
    {
    	  System.out.println("Method e");
          System.out.println("Characters: " + a + " " + b + " " + c);    
    }
    static void f(String a,String b)
    {
    	   System.out.println("Method f");
           System.out.println("First String: " + a);
           System.out.println("Second String: " + b);
    }
    public static void main(String[] args) 
    {
            a(false,"hello");
            b("Bye",true);
            c(1.1,10);
            d(1.1,'X');
            e('A', 'B', 'C');
            f("Java", "Programming");
    
	}

}

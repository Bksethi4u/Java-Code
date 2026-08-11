package pratice_5th_june2026;

public class StaticNonStaticClass {
	

    static void add()            //Static Method, Default accessifier, Static Modifier, Non Parameterize Method
    {
            System.out.println("Static Method");
    }
     void sub()//Non Static Method, Default accessifier, Non Static Modifier,Non Parameterize Method
    {
                    System.out.println("Non Static Method");
    }
     StaticNonStaticClass()          //Constructor ,Default accessifier, Non Static Modifier,Non Parameterize Method
     {
                    System.out.println("Constructor"); 
     }
    public static void main(String[] args) //Main Method
    {
            System.out.println("Start of the main method");
            add();
            StaticNonStaticClass s1=new StaticNonStaticClass(); // Constructor will invoke once object created
            s1.sub(); // Calling non static method by creating object.
          
            /*
             * ClassName referanceVariable=new ClassName(); 
referanceVariable.nonstaticmethod(); // syntax of creating object
             */
            System.out.println("End of the main method");

	}

}

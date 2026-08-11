package pratice_9th_june2026;

public class StaticParameters {

	static void add(int a,int b)
    {
			int c=a+b;
            System.out.println(c);
    }
    static void sub(int a,int b)
    {
            int c=a-b;
            System.out.println(c);
    }
    static void mul(double a,double b) //declaration
    {
            double c=a*b; // utilization
            System.out.println(c);
    }
    public static void main(String[] args) 
    {
            add(100,200); // initialization
            sub(300,200);
            mul(12.3,12.6);

    }

}

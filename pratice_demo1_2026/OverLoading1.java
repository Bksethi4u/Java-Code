package pratice_demo1_2026;

public class OverLoading1 {

    static void add(int b,double a)
    {
            double sum=a+b;
            System.out.println(sum);
    }
    
    static void add(int a,int b, int c)
    {
            int sum=a+b+c;
            System.out.println(sum);
    }
     void add(double a,int b)
    {
            double sum=a+b;
            System.out.println(sum);
    }
    public static void main(String[] args) 
    {
            add(100,20.20);
            add(10,10,20);
            OverLoading1 d1=new OverLoading1();
            d1.add(30.2,12);
    }
}



package pratice_demo1_2026;

public class ConstructorOverLoading {

	{
        System.out.println("1");
}
	ConstructorOverLoading(String a,char b)
{
        System.out.println("2");

}
	ConstructorOverLoading(String a,String b)
{
        System.out.println("3");

}
	ConstructorOverLoading(int a,int b)
{
        System.out.println("4");

}
public static void main(String[] args) 
{
        ConstructorOverLoading c1=new ConstructorOverLoading (100,'B');
        ConstructorOverLoading c2=new ConstructorOverLoading("World",'S');
        ConstructorOverLoading c3=new ConstructorOverLoading("ARC","PWD");
        ConstructorOverLoading c4=new ConstructorOverLoading(500,200);

        
}


	}


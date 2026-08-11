package pratice_19th_june2026;
class ParentClass1
{
        ParentClass1()
        {
                System.out.println("Parent Const");
        }
}
public class InheritanceConstructorSuperCalling extends ParentClass1{
	
	InheritanceConstructorSuperCalling()
	{
		super();
		System.out.println("Child Const");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InheritanceConstructorSuperCalling();
	}

}

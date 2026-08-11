package pratice_19th_june2026;

public class ChildClass extends ParentClass
{

		 static void tc_AddingTheProductToCart()
	        {
	                System.out.println("AddingTheProductToCart");
	        }
	        public static void main(String[] args) 
	        {
	                loinCode();
	                tc_AddingTheProductToCart();
	                
	                ChildClass c1=new ChildClass();//WIth the help of this we can access the
	                //non static methods of parent as well of your child
	                //with this help we can also access instance variables of parent as well as
	                //of your child class
	                c1.screenShot();
	                System.out.println(a);
	                
	        }

}

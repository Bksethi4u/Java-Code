package bk.assignment01;

public class Employee {

	public static void main(String[] args) {
		System.out.println(TestEmployee.Company); //syntax -->ClassName.variableName of another class
		// access static variable of another class
		
		TestEmployee emp = new TestEmployee();
		System.out.println(emp.empid); // Access non Static Global variable of different class
		// Syntax ClassName objectName = new ClassName();,S.O.P(objectName.variableName);
		

	}

}

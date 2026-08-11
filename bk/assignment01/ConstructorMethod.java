package bk.assignment01;

public class ConstructorMethod {

	ConstructorMethod(int a, char b) {
		System.out.println("1");
	}

	ConstructorMethod(String a, char b) {
		System.out.println("2");

	}

	ConstructorMethod(String a, String b) {
		System.out.println("3");

	}

	ConstructorMethod(int a, int b) {
		System.out.println("4");

	}

	public static void main(String[] args) {

		/*
		 * ConstructorMethod c1=new ConstructorMethod(100,'S'); ConstructorMethod c2=new
		 * ConstructorMethod("Hello",'S'); ConstructorMethod c3=new
		 * ConstructorMethod("UN","PWD"); ConstructorMethod c4=new
		 * ConstructorMethod(100,200);
		 */

		new ConstructorMethod(100, 'S');
		new ConstructorMethod("Hello", 'S');
		new ConstructorMethod("UN", "PWD");
		new ConstructorMethod(100, 200);

	}

}

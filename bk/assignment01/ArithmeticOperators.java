package bk.assignment01;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int a = 20;
		int b = 40;
		System.out.println("a+b :" + (a + b));
		System.out.println("a-b :" + (a - b));
		System.out.println("a-b :" + (b - a));
		System.out.println("a*b :" + (a * b));
		System.out.println("a+b :" + (a / b));
		System.out.println("a/b :" + (b / a));
		System.out.println("b%a :" + (b % a));
		System.out.println("a%b :" + (a % b));
		System.out.println(a++); // return 20 as it will print value of a
		System.out.println(a); // return 21 increment value of a
		System.out.println(++a); // return 22 as value of a is 21
		System.out.println(b--); // return 40 as it will print value if b
		System.out.println(b); // return 39 , decrement from valueb of b
		System.out.println(--b); // return 38, decrement from value of b i.e. 39

	}

}

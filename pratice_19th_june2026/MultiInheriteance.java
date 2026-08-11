package pratice_19th_june2026;

class C3 {
	static void house() {
		System.out.println("House");
	}
}

class C2 extends C3 {
	static void car()

	{
		System.out.println("Car");

	}
}

public class MultiInheriteance extends C2

{
	static void gold() {
		System.out.println("Gold");
	}

	public static void main(String[] args) {
		house();
		car();
		gold();

	}

}

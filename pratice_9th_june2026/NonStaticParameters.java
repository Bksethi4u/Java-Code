package pratice_9th_june2026;

public class NonStaticParameters {

	void add(int a, int b) // non Static Methods
	{
		int c = a + b;
		System.out.println(c);
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	void mul(double a, double b) // declaration
	{
		double c = a * b; // utilization
		System.out.println(c);
	}

	public static void main(String[] args) {
		NonStaticParameters N1 = new NonStaticParameters();
		N1.add(100, 200); // initialization
		N1.sub(300, 200);
		N1.mul(12.02, 12.6);

	}

}

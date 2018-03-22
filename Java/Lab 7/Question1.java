
public class Question1 {

	// (a)
	public static double divide(double a, double b) {
		if (b == 0) {
			IllegalArgumentException exception = new IllegalArgumentException("b is zero.");
			throw exception;
		}
		return a / b;
	}
	
	// (b)
	public static void printQuotient(double a, double b) {
		try {
	     System.out.println(divide(a, b));
		}
		catch(IllegalArgumentException e) {
			System.out.println("The divisor is zero.");
		}
	 }
}

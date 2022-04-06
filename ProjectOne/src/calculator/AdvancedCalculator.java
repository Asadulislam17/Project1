package calculator;

public class AdvancedCalculator extends AddAndSubCalculator {
	
	public void add(int num1, int num2, int mun3) {
		
		System.out.println("Sum Value is: "+ (num1 + num2 + mun3) );
	}
	
	public void sub(double num1, double num2) {
		
		System.out.println("Sub Value is: "+ (num1 - num2) );
	}

	public static void multiply(int num1, int num2) {
		
		System.out.println( num1 * num2 );
	}
	
	public static void div(double num1, double num2) {
		
		System.out.println( num1 / num2 );
	}
}

// WAP in java to perform all the Arithmetic operations(+,-,*,/,%)
package corejava;

public class ArithmeticManual {

	public static void main(String[] args) {
		
		int a, b, add, sub, mul, div, mod; // Declaration
		
		a = 9 ; // Initialization
	    b = 3 ; // Initialization
	    
	    add = a + b;
	    sub = a - b;
	    mul = a * b;
	    div = a / b;
	    mod = a % b;
	    
	    System.out.println("Addition of two numbers = " + add); // Printing Results
	    System.out.println("Subtraction of two numbers = " + sub);
	    System.out.println("Multiplication of two numbers = " + mul);
	    System.out.println("Division of two numbers = " + div);
	    System.out.println("Modulus of two numbers = " + mod);
	}

}
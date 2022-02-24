package class08_TypeCasting;

public class Method_Quiz {
	
	public static void main(String[] args) {
		//Calculator
		//addition
		//Subtraction
		//multiplication
		//division
		
		//add two numbers
		addition(2.5,5);
		
		//subtract Two numbers
		subtraction(6.5, 3.5);
		
		//multiply two numbers
		multiplication(5,3);
		
		//divide two number
		division(6,2);
		
		//one method can handle all calculation +-*/
		calculator(2,4, '+');
		calculator(5,3, '-');
		calculator(6,2, '/');
		calculator(6,2, '*');
		calculator(6,2, '#');
		

	}//main
	
	public static void calculator(double a, double b, char operator ) {
		double result = 0;
		
		switch (operator) {
		case '+':
			System.out.println("calculator " + (a+b));
			break;
		case '-':
			result = a-b;
			System.out.println("calculator " + result);
			break;
		case '*':
			result = a*b;
			System.out.println("calculator " + result);
			break;
		case '/':
			result = a/b;
			System.out.println("calculator " + result);
			break;
			default:
			System.out.println("Unknown operator");
		}//switch
	
//		if (operator == '+') {
//			result = a+b;
//			System.out.println("calculator " + result);
//		}	
//		else if (operator == '-') {
//			result = a-b;
//			System.out.println("calculator " + result);
//		}	
//		else if (operator == '*') {
//			result = a*b;
//			System.out.println("calculator " + result);
//		}	
//		else if (operator == '/') {
//			result = a/b;
//			System.out.println("calculator " + result);
//		}	
//		else
//			System.out.println("Unknown operator");
		
		
	}//calculator

	public static void addition(double a, double b) {
		double result = a+b;
		System.out.println("addition of " + a + " and "+ b + " is "+result);	
	}//addition
	
	public static void subtraction(double a, double b) {
		double result = a-b;
		System.out.println("subtraction of " + a + " and "+ b + " is "+result);		
	}//subtraction
	
	public static void multiplication(double a, double b) {
		double result = a*b;
		System.out.println("multiplication of " + a + " and "+ b + " is "+result);
	}//multiplication
	
	public static void division(double a, double b) {
		double result = a/b;
		System.out.println("division of " + a + " and "+ b + " is "+result);
	}//division

}//class

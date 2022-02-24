package class08_TypeCasting;

public class TypeCastingExample {

	public static void main(String[] args) {
		
		//implicit type casting
		int a;
		double b;	
		a = 5;
		b = a;	
		System.out.println(b);
		
		
		//Explicit type casting
		int x;
		double y;
		y = 3.5;
		x=(int) y;	
		System.out.println(x);
		
		
		//Type Conversion
		String age = "45";
		//Convert from String to int
		int newAge = Integer.parseInt(age);
		System.out.println(newAge);
		
		String salary = "55.99";
		//Convert from String to int
		double newSalary = Double.parseDouble(salary);
		System.out.println(newSalary);
				
		
		
		
		
		

	}//main

}//class

package class08_TypeCasting;

public class GlobalAndLocalVariable {
	static int a =4;	//global variable

	public static void main(String[] args) {
		int a = 5;	//local variable
		
		System.out.println(a);
		test();

	}//main
	
	public static void test() {
		a=a*3;
		System.out.println(a);
	}//test

}//class

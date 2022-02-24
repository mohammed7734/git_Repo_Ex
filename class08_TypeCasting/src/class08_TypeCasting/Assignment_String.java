package class08_TypeCasting;

public class Assignment_String {

	public static void main(String[] args) {
		//Req: Determine gender by name
		
		String name = "John";
		char ec = name.charAt(name.length()-1);
		
		if (ec == 'a'||ec == 'e'||ec == 'i'||ec == 'o'||ec == 'u'||ec == 'A'||ec == 'E'||ec == 'I'||ec == 'O'||ec == 'U')
			System.out.println("Gender: Female");
		else
			System.out.println("Gender: Male");
		
		System.out.println("=============================================");
		
		
		//Req: Separate street, apt, city and zip code from address
		
		//2nd Attempt
		String address = "3118 Al Lipscomb Way, Suite 127, Dallas, TX 75215";
		//String address = "123 testr dr, Albany, TX 75215";
		System.out.println(address+'\n');
		
		int c1 = address.indexOf(',');				
		int c2 = address.indexOf (',', address.indexOf(',')+1);
		System.out.println(c2);
		int c3 = address.lastIndexOf(',');
		
		
		String street = address.substring(0, c1);
		System.out.println("Street: "+street);
		
		String apt = address.substring((c1+2),c2);
		System.out.println("Apt/Suite: "+apt);
		
		String city = address.substring((c2+2), c3);
		System.out.println("City: "+city);
		
		String state = address.substring((c3+2),(address.lastIndexOf(" ")));
		System.out.println("State: "+state);
		
		String zipcode = address.substring((c3+5),(address.lastIndexOf("")));
		System.out.println("Zipcode: "+zipcode);
		
		System.out.println("==========================================");
		
		
		//1st attempt
//		String y = "3866 Garvin St, Apt 144, Detroit, TX 48212";
//		int zipIndex = y.lastIndexOf("")-5;
//		//System.out.println(zipIndex);
//		String zipcode2 = y.substring(zipIndex);
//		System.out.println("Zipcode: "+zipcode);
//		
//		int stateIndex = zipIndex -3;
//		String state2 = y.substring(stateIndex,zipIndex);
//		System.out.println("State: "+state);
//		
//		int streetBegin = 0;
//		int streetEnd = y.indexOf(',');
//		String street2 = y.substring(streetBegin,streetEnd);
//		System.out.println("Street address: "+street);
//	
//		int aptIndex = y.indexOf(',', y.indexOf(',')+1);
//		System.out.println(aptIndex);
//		String apt2 = y.substring(streetEnd+6,aptIndex);
//		System.out.println("Apt/Suite: "+apt);
//		
//		String city2 = y.substring(aptIndex+2,stateIndex-2);
//		System.out.println(city);
//		
		
	

	}//main
	

}//class

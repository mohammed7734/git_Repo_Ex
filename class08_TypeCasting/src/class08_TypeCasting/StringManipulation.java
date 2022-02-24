 package class08_TypeCasting;

public class StringManipulation {

	public static void main(String[] args) {
		//primitive data type: byte short int long float double char boolean
		
		String name; //here, NAME is non primitive variable
		
		//1.	Length of String
		name = "karim Ali";		
		int lengthOfName = name.length();		
		System.out.println("Length of name is " + lengthOfName);		
		System.out.println("====================================");
		
		//2.	find char by index number
		char c = name.charAt(0);
		System.out.println("the char which index 4, is " +c);
		System.out.println("====================================");
		
		//3.	find index number using char
		int indexOfA = name.indexOf('A');
		System.out.println("A index is " + indexOfA);
		System.out.println("====================================");
		
		//4.	Concat another string
		String newName = name.concat("USA");
		System.out.println(newName);
		System.out.println("====================================");
		
		//5.	Replace chars
		String replacedName = name.replace('i', 'e');
		System.out.println(replacedName);
		System.out.println("====================================");
		
		//6.	substring
		name = "karim Ali Bhyiyan";
		String partOfName = name.substring(6);
		System.out.println(partOfName);
		System.out.println("====================================");
		
		//7.	substring(begin, end)
		//				  012345678901234567890123456789012
		String address = "1234 Test Drive, Jamaica, NY 11432";
		String city = address.substring(17,24);
		System.out.println(city);
		System.out.println("====================================");
		
		//8.	starts with 
		boolean value = name.startsWith("K");
		System.out.println(value);
		System.out.println("====================================");
		
		//9.	ends with
		boolean value2 = name.endsWith("yxan");
		System.out.println(value2);
		System.out.println("====================================");
		
		name = "karim Ali Bhyiyan";
		//10.	remove space
		String n = name.replace(" ","");
		System.out.println(n);
		System.out.println("====================================");
		
		//Home Assignment: determine male or female by name
		//a, e, i, o, u -> it is female name
		//else male name
		
		//11.	isBlank()
		String s = ""; //for empty string
		System.out.println("is blank with empty " + s.isBlank());		
		//name.isBlank()
		 s = "   "; //for empty string
		System.out.println("is blank with white space  " + s.isBlank() );

		
		//12.	isEmpty()
		s = "";
		System.out.println("length with Empty String " + s.length() );
		System.out.println("length with Empty String " + s.length()  );
		s = "  ";
		System.out.println("is empty with white space " + s.isEmpty() );
		
		
		//13.	trim()
		s = " TX USA  "; //trim remove leading and trailing spaces
		System.out.println(">>>" + s + "<<<");
		System.out.println(">>>" + s.trim() + "<<<");
		
		
		//14.	contains(s)
		 s = "1234 Test Drive, Jamaica, NY 11432";
		boolean b = s.contains("NY");
		System.out.println("s string contains NY: " + b);
		
		//15.	compareTo(s)
		s = "Dallas";
		System.out.println("s String compare to 'Dallas' " + s.compareTo("Dallas") );
		
		//16.	compareToIgnoreCase(s)
		s = "Dallas";
		System.out.println("s String compare to 'Dallas' " + s.compareToIgnoreCase("Dallas") );
		
		//17.	lastIndexOf
		//	01234567
		s = "abcdef";
		System.out.println("Last occurance of C is " + s.lastIndexOf('c') );
		System.out.println("Last occurance of C is " + s.lastIndexOf('c') );
		
		//18.	s.toLowerCase()		homework
		//s.toUpperCase()		homework
		
		//19.	toString()
		//20.	s.toString() //toString method converts anything to String
		
		
		//21.	s.split(s)
		s = "1,11111111111,Belal,NY,11432";
		s = "1,11111111111,Joe,PA,51424";
		
	
		//Real life example
		//city zip extraction
		//String a = "1234 Test Drive, Irving, TX 75062";
		//String cityName = a.substring(17,23);
		//System.out.println("City: "+cityName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main

}//class

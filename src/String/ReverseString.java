package String;

//String is non premitive datatype as well as string is a class
//Hence, String s="" ; s.-> can call all methods of string class.
//InterviewQ1 q1 = new InterviewQ1();
//String str = new String("technocredits"); // save in Heap memory
//String str= "technocredits"; //String constant pool 
//char charAt(int index)
//String toLowerCase()
public class ReverseString {

	String reverseName(String name) {
		// If you want to use local name first you need to initialize else it gives
		// error

		String revName = " ";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	String oddPlaceString(String name) {
		char[] c = name.toCharArray();
		String odd = "";
		for (int i = 0; i <= c.length - 1; i++) {
			if (i % 2 != 0) {
				odd = odd + c[i];
			}
		}
		return odd;
	}

	String evenPlaceString(String name) {
		char[] c = name.toCharArray();
		String even = "";
		for (int i = 0; i <= c.length - 1; i++) {
			if (i % 2 == 0) {
				even = even + c[i];
			}
		}
		return even;
	}
//Most Asked Qution in interview sum of didgits in String 
	int getDigitCount(String name) {
		int count = 0;
		int s = 0;
		char[] c = name.toCharArray();
		for (int i = 1; i <= c.length - 1; i++) {
			if (Character.isDigit(name.charAt(i))) {
				count++;
				s = s + Character.getNumericValue(name.charAt(i));

			}

		}
		System.out.println(s);
		return count;

	}

	public static void main(String[] args) {
		ReverseString rev = new ReverseString();
		String odd = "";
		// #REVERSE
		String output = rev.reverseName("Sagar");
		System.out.println("Reverse String is :" + output);
		System.out.println("Character at index 2 is " + output.charAt(2));
		// String is class so on class you can call any string method like below we call
		// length method

		System.out.println("length of the string is " + output.length());
		// we cannot call anything further length method because length method return
		// int value and we can't call any method with datatype
		// datatype.method not allowed
		boolean isDigitFlag = Character.isDigit('r');
		System.out.println(isDigitFlag);

		System.out.println("String contains " + rev.getDigitCount("Sagar2patil4") + " digits.");
		odd = rev.oddPlaceString("technocredits");

		System.out.println("String design by odd place character " + rev.oddPlaceString("technocredits"));
		System.out.println("String design by odd place character and reversed it " + rev.reverseName(odd));
		System.out.println("String design by even  place character " + rev.evenPlaceString("technocredits"));

	}

}

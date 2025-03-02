package String;

//Character is a predefined class in java.
//1) boolean isDigit(char ch)
//2) boolean isLetter(char ch)
//3) boolean isLowerCase(char ch)
//4) boolean isUpperCase(char ch)
//5) int getNumericValue(char ch)
//6)char toLowerCase(char ch)
//7)char toUpperCase(char ch)
//Note :- All above methods are static methods.
//Exception always come on rntime only
//Programme for the String separated by numeric Digit and letter 

//String str="";
//sop(str.length()); //0
//String str= null;
//sop(str.length());  //nullPointerException

//String str = "null";
//sop(str.length());//4

public class CharacterMethods {

	static String rearrangeString(String name) {

		String str1 = " ";
		String str2 = " ";
		//char ch[] = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
		
			if (Character.isLetter(name.charAt(i))) {
				str1 = str1 + name.charAt(i);
			} else if (Character.isDigit(name.charAt(i))) {
				str2 = str2 + name.charAt(i);
			}

		}

		return str2+str1;
	}
	


	public static void main(String[] args) {

		String result = CharacterMethods.rearrangeString("Sagar1patil23  hello22world11");

		System.out.println(result);

	}

}

package String;

public class SplitStringMethod {
	
//video 26.1
	public static void main(String[] args) {
		
//**************************************		
//Split is the method where we need to pass after what thing we need to break statement
//As below we pass in split method  whitespace " " so it will get whitespace it break that part and put in array at the last final it return an array
//you can pass parameters as per your requirement like 
// input.split("_/$/*/")	any thing as you required	
//Split method come in picture when you doing any operation on word only 
//	String [] sarr=src.split(" ");
//	for(String a:sarr)
//       System.out.println(a);
		
//**************************************	
		 String src = "Sagar is the good boy sagargg";
		 String srcD="Good1 Sa2gar is goo4od boy5 hari ";
		SplitStringMethod token = new SplitStringMethod();
		System.out.println(token.higestWordFromString(src));
		token.printWordHavingDigits(srcD);
		System.out.println(" ***********");
		token.printWordNotHavingDigitsANDUppercase(srcD);

	}
//Find higest word from the string 
	String higestWordFromString(String str) {
		String strarr[] = str.split(" ");
		String maxlengthString = strarr[1];
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].length() > maxlengthString.length()) {
				maxlengthString = strarr[i];
			}
		}
		return maxlengthString;
	}
	
//Find word from string the digit is present or not 	
private	boolean isWordContainsDigit(String word) {
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return  false;
	}

void printWordHavingDigits(String input) {
	String strarr[] = input.split(" ");
	for(int j=0;j<strarr.length;j++) {
		boolean flag = isWordContainsDigit(strarr[j]);
		if(flag) {
			System.out.println(strarr[j]);
		}
			
		
	}
}

//Find word from string the digit is present or not 	
private	boolean isWordContainsDigitANDUppercase(String word) {
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(Character.isDigit(ch)||Character.isUpperCase(ch)) {
				return false;
			}
		}
		return  true;
	}

void printWordNotHavingDigitsANDUppercase(String input) {
	String strarr[] = input.split(" ");
	for(int j=0;j<strarr.length;j++) {
		boolean flag = isWordContainsDigitANDUppercase(strarr[j]);
		if(flag) {
			System.out.println(strarr[j]);
		}
			
		
	}
} 
	

	
	
	 
	

}

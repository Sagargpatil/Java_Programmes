package String;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelsCount v = new VowelsCount();

		// When you have hardcoded value you can initialize array as below
		String name[] = { "Sagar", "Patil", "Mayur", "Manjiri", "Shweta", "Suraywansham" };
		// If you are planning to get value from user then you need to initialize array
		// as below
		// String []value= new String[10];
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " String content vowels " + v.countVowels(name[i]));
		}

		System.out.println("Max length of string is " + v.maxLengthString(name));
		v.freqOfChar("Gujjar");

	}

// Find the frequency of characters without using any predefine function and collections 
	void freqOfChar(String name) {
		char Holder[] = new char[10];
		boolean flag = false;
		// int value[] = new int[10];
		int count = 0;
		char[] arr = name.toCharArray();
		int l = arr.length;
		//char Holder[] = new char[l]; //if caller ask you want to define size dynamically then use this 
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k <= i; k++) {
				if (Holder[k] == arr[i]) {

					flag = true;

					break;
				}

			}

			for (int j = 0; j < arr.length; j++) {
				if (flag == true) {
					break;
				}
				Holder[i] = arr[i];
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count > 0) {
				System.out.println(arr[i] + "  " + count);
				count = 0;

			}
			flag = false;
			

		}
	}

	// Below method return max length string

	String maxLengthString(String[] name) {
		String s = " ";
		for (int i = 0; i < name.length - 1; i++) {
			if (name[i].length() > name[i + 1].length()) {

				s = name[i];
			} else {
				s = name[i + 1];
			}
		}
		return s;
	}

	// Find the vowels count in string

	int countVowels(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o') {

				count++;
			}

		}
		return count;
	}

}

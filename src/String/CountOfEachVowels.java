package String;

public class CountOfEachVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfEachVowels countvowel = new CountOfEachVowels();
		countvowel.countofVowel("Hari shankar tamame");
		countvowel.printEachStringVowelsCount();
	}
//Function to get vowels of each element in array 
	void printEachStringVowelsCount() {
		String names[] = { "Sagar", "Rahul", "Hari", "Shanker" };
		for (int i = 0; i < names.length; i++) {
			countofVowel(names[i]);
		}
	}
	
//Function to get each vowel count from String 
	void countofVowel(String name) {
		String str = name.toLowerCase();
		int vowelsCount[] = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {

			case 'a':
			case 'A':
				vowelsCount[0]++;
				break;
			case 'e':
			case 'E':
				vowelsCount[1]++;
				break;
			case 'i':
			case 'I':
				vowelsCount[2]++;
				break;
			case 'o':
			case 'O':
				vowelsCount[3]++;
				break;
			case 'u':
			case 'U':
				vowelsCount[4]++;
				break;

			default:
				break;

			}

		}
		System.out.println(" ");
		System.out.println(name + "  containes below vowels -------");
		System.out.println(" ");
		if (vowelsCount[0] > 0) {
			System.out.println('a' + "-----" + vowelsCount[0]);
		}
		if (vowelsCount[1] > 0) {
			System.out.println('e' + "-----" + vowelsCount[1]);
		}
		if (vowelsCount[2] > 0) {
			System.out.println('i' + "-----" + vowelsCount[2]);
		}
		if (vowelsCount[3] > 0) {
			System.out.println('o' + "-----" + vowelsCount[3]);
		}
		if (vowelsCount[4] > 0) {
			System.out.println('u' + "-----" + vowelsCount[4]);
		}

	}

}

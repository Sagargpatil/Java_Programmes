package String;

public class NumericContentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str = "Sar44oj Mauli2k sagar pat4il";
  new NumericContentWord().printWordHavingDigitFromArray(str);
  
	}
	void printWordHavingDigit(String word) {
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.println(word);
				break;
			}
		}
	}
	
	void printWordHavingDigitFromArray(String input) {
		String [] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			String word = arr[index];
			printWordHavingDigit(word);
		}
	}

}

package String;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromString pal = new PalindromString();
		//System.out.println(pal.CheckPalindrom("naman"));
		if(pal.CheckPalindrom("naman")) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not a Palindrom");
		}
			
		

	}
	
	boolean CheckPalindrom(String str) {
		//StringBuilder newstr = new StringBuilder();
		String reverse="";
		for(int i=0;i<str.length();i++) {
			reverse=str.charAt(i) + reverse ;
		}
		System.out.println(reverse);
		if(str.equals(reverse)) {
			return true;
		}
		else {
		return	false;}
	}

}

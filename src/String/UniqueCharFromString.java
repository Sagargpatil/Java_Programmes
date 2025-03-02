package String;

public class UniqueCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniqueCharFromString unq = new UniqueCharFromString();
		unq.getUniqueChar("Sagar");
		unq.getFirstUniqueChar("harihar");

	}
	
	void getUniqueChar(String str) {
		
		for(int i=0;i<str.length();i++ ) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				System.out.println(" Unique character from the given String is "+ str.charAt(i));
			}
		}
	}
	
void getFirstUniqueChar(String str) {
		
		for(int i=0;i<str.length();i++ ) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				System.out.println("First unique character from the given String is "+str.charAt(i));
				break;
			}
		}
	}

}

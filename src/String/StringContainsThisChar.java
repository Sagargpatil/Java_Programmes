package String;

public class StringContainsThisChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringContainsThisChar obj = new StringContainsThisChar();
		System.out.println(obj.checkContains("Sagar"));
	}
	
	boolean checkContains(String str) {
		
		return str.contains("ar");
	}

}

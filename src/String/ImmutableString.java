package String;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hi"); // create object and store on other memory location  but in both case are i Heap only 
		String str2 = "Hi"; //storing in string constant pool
		System.out.println(str1 == str2); // false
		System.out.println(str1.equals(str2));
		System.out.println(str2 = str1 + " Hello");
	}

}

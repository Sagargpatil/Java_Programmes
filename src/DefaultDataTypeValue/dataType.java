package DefaultDataTypeValue;

public class dataType {

// Below instance variable value default value get assign 
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char ch;
	boolean flag;

	void printDefaultValues() {
		
//Local variable never assign default value we need to initialize before use local value 
		
//		byte b;
//		short s;
//		int i;
//		long l;
//		
//		float f;
//		double d;
//		
//		char ch;
//		boolean flag;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(flag);
		
	}
	
	public static void main(String[] args) {
		dataType df =new  dataType();
		df.printDefaultValues();
	}
	
}

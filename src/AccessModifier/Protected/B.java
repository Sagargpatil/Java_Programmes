package AccessModifier.Protected;

public class B extends A {
	
	void processData() {
		System.out.println(x);
		System.out.println(y);
		
		m1();
		m3();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1= new B();
b1.processData();
	}

}

package OOPS.Inheritance;
//CASE-1
public class A {
	
	int x=10;
	int y=20 ;
	
	void m1() {
		System.out.println("A m1");
	}
	
	void m2() {
		System.out.println("A m2");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj= new A();
		obj.m1();
		obj.m2();
	}

}

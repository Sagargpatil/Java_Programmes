package Constructordemo;

public class ConstructorExample {
 
	
	//Constructor 
	//Constructor don't have return type if we put return type then it behave like normal method 
	public ConstructorExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Techno");
	}
	
	String m1() {
		System.out.println("Hi");
		return "Hi";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Hello");
            // Constructor call implicitly(automatically) it never call explicitly(manual)
            //Without calling constructor we cannot create any object 
            ConstructorExample con = new ConstructorExample();
          //methods we need to call explicitly it never call automatic 
            System.out.println("Credits");
            String temp = con.m1();
            System.out.println("end");
	}

}

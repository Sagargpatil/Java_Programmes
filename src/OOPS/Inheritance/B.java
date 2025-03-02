package OOPS.Inheritance;

//---> compile time to runtime behavior get changed and behaviour means method 
//----> properties are not changed from compile time to runtime means variable are not changed
//Here it take all things what exist in class A and print thing which are not present it child class like m1 method remaining it takes all from same class like m2 method x,y value 

public class B  extends A {
	
	int x=11;
	int y=15;
	int z=12;

	void m2() {
		System.out.println("B m2");
	}
	
	void m3() {
		System.out.println("B m3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CASE-2
		B obj= new B();
		obj.m1();
		obj.m2();
		
//Case 3
		//when programme run compiler see left hand side only no matter what is on right hand side
		//compile time compiler give guarantee for the methods and variable 
		//present in Reference class only (LHS) and you can access those 
		//thing only which are guaranteed by compiler it won't be allow you to call object created all methods which are not present in reference class  even object all things load in memory but you can't access  
		//e.g z not present in A class you can't call
		//--> a1 can call everything which is there in class A (reference type)
		A a1= new B();
		//----> properties are not changed from compile time to runtime means variable are not changed
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z);  compilation error
		//Dynamic Polymorphism compile time guarantee of class A and run time behavior of class B
		//Why Dynamic come in picture when you want to update method then you create new class and extend parent class  d'not modify current running parent class 
       //  and in case you write some extra methods other than current business requirement then we create object with parent class reference So it will call only what parent class have 
		a1.m1();
		
//CASE 4
		
	//	B b1 =new A() ; //Compilation error parent cannot store in child class 
	}
	
	

}

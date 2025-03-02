package OOPS_Polymrphism;

public class MethodHidingStaticMethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child.parent();

	}

	//We are declaring method as static when we don't want to rewrite that method in future and everyone should access 
	//it's from static area no need to go inside object  
	static void parent() {
		System.out.println("Parent static  method we can access it directly without creating object ");
	}
}

 class Child extends MethodHidingStaticMethodOverride{
	//this method is not getting override it treated as  its own other method 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Child.parent();

		}
	 static void parent() {
		
		System.out.println("Parent static  method from child class");
	}
	
}

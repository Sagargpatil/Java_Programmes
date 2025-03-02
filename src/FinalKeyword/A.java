package FinalKeyword;

//If class is final it cannot be extend if you check class B there it should give error 
//final public class A {
 public class A {

	final String name = "Sagar";
	int num = 10;
	
	void m2() {
		final int id=123;
		//id =555; //CE within method scope you can't change the value
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

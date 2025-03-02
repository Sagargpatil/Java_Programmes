package OOPS.Inheritance;

public class Child2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parent parent = Parent.getObject();
      Child1 child1= (Child1)parent; // type casting parent adjusting in child object
      child1.m1();	
      }

}

package FinalKeyword;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Class A is final we can't extends here 
public class B extends A {

	void display() {
		A a1 = new A();
		System.out.println(a1.name);
		String name = a1.name;
		//a1.name = "Hi"; //you can't reassign value
	}
	
	String m2(int x) {
		return "Hi";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

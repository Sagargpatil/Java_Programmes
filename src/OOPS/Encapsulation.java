package OOPS;
import OOPS_Polymrphism.Overriding;

public class Encapsulation extends Overriding {
	
	private int x=100;

	int  getX() {
		return x;
	}
	
	void setX(int x) {
		this.x=x;
	}
//Below method is default we are trying to override it from other package class but it through compilation error method is not visible 	
//   	void m1() {
//		System.out.println("Hi");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Encapsulation encp=new Encapsulation();
//    Overriding obj = new Encapsulation();
//    obj.m1();
    encp.setX(80);
   System.out.println(encp.getX());
	}

}

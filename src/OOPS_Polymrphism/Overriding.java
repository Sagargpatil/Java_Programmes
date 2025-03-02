package OOPS_Polymrphism;

public class Overriding extends Overloading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding obj =new Overriding();
		HDFC r1 =new HDFC();
		SBI r2 = new SBI();
		System.out.println(" BANK rate of interest is "+obj.getRateOfInterest());
		System.out.println("HDFC BANK rate of interest is "+r1.getRateOfInterest());
		System.out.println("SBI BANK rate of interest is "+r2.getRateOfInterest());

	}
	
	// we are overriding getRateOfInterest method and return value getting change from 0 to 8
	int getRateOfInterest() {
		return 8;
	}
	//Below method is default method so you cannot override this method in other package class because it is not visible there it's compilation error  
  	void m1() {
		System.out.println("HELLO");
	}

}

 class Bank{
	int getRateOfInterest() {
		return 0;
	}
	
}

class HDFC extends Bank{
	int getRateOfInterest() {
		return 4;
	}
}

class SBI extends Bank{
	int getRateOfInterest() {
		return 6;
	}
}
class ICICI extends Bank{
	int getRateOfInterest() {
	return 2;
}
}

//When you are writing same method signature as parent class only return type is different its not allowed 
//it is a compilation error you say our class is different return type is different so what is problem ?
//but when you extends parent class that time all methods invisibly available in child class so you can't write same signature method it absolutely error 

//class Axis extends Bank{
//	//Invisible but available there 
////	int getRateOfInterest() {
////		return 2;
////	}
//	Double getRateOfInterest() {
//		return 2;
//	}
//}

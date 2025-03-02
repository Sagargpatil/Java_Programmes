package OOPS_Polymrphism;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj = new Overloading();
         System.out.println(obj.Add(10, 20));
         System.out.println(obj.Add(10, 20,30));
         System.out.println(obj.Add(10, 2.200));
	}
	// case-1 Number of parameters should be different 
	//case-2 Type of param must be different 
	//case-3 sequence of param should be different 
	int Add(int x , int y) {
		return x+y;
	}
	
	double Add(int x , double y) {
		return x+y;
	}
	
	int Add(int x , int y, int z) {
		return x+y+z;
	}
	
	int getRateOfInterest() {
		return 0;
	}
	
	

}

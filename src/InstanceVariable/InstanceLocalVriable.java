package InstanceVariable;

public class InstanceLocalVriable {
	
	//Instance variable which declare inside classs outside method scope within whole class
	int accNumber= 123;
	  String name="HDFC";
	  
	  
	  void processData(){
		  //Local variable 
	  String name = "Sagar";
	  int accNumber =432;
	  
	  }
	  
	  void printInfo(){
	  System.out.println(name);
	  // here it gives compilatione error because it not able to find name 
	  //and we cannot acccess name of processData variable
	  
	  System.out.println(accNumber);
	  }
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object work as datatype InstanceLocalVriable and object name as refrrance variable 
		InstanceLocalVriable example= new InstanceLocalVriable();
		  example.processData();
		  example.printInfo();
	}

}

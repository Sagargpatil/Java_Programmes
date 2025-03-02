package multipleObject;

public class BankDetails {
	
	int bal= 1000;
	// if we put static here for bal variable then it show copy of variable is one 
	// and value will be modify 
	//static int bal = 1000;
	//Its nothing but same and use for instance variable and it store in static memory
	
	void debit() {
		bal=bal- 500;
	}
	
	void credit() {
		bal = bal + 500;
	}
	
	void display() {
		System.out.println("Your current balance is" + bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankDetails bankDetails1 = new BankDetails();
		bankDetails1.debit();
		bankDetails1.display();
		
		BankDetails bankDetails2 = new BankDetails();
		bankDetails2.credit();
		bankDetails2.display();

	}

}

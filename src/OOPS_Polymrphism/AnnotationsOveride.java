package OOPS_Polymrphism;

public class AnnotationsOveride extends Bank {

	//Overide annotation means we are just informing compiler below method is getting override 
	//Don't miss lead after write @Override your method directly override it just to inform compiler
	@Override
	 int getRateOfInterest() {
		return 15;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationsOveride obj =new AnnotationsOveride();
		
		System.out.println(" BANK rate of interest is "+obj.getRateOfInterest());


	}
	
	

}

 



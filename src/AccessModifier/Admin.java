package AccessModifier;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void m1() {
		// As local variable already private we cannot declare it as private and
		// variable we can access within that method block only
		// private int x; //not allowed
		int x;
	}

	void processAdmission(String fname, String lname, String address, char hscGrade, char sscGrade, String Stream,
			boolean isMale) {
		// Insert Firstname into DB
		// Insert lname into DB
		// Insert address into DB
		// Insert hscGrade into DB
		// Insert sscGrade into DB
		// Insert stream into DB
		// Insert Gender into DB
		// lets assume above each function have 20-25 lines of code and if you want to
		// remove or modify any function that time we need to update all
		// lines so what we do write method of each function so it will be convenient to
		// add or remove functionality
		
		Admin admin= new Admin();
		admin.inserStudentBasicDetails(fname, lname);
		admin.inserStudentaddress(address);
		admin.inserStudentGrade(sscGrade, hscGrade);
		admin.inserStudentstream(Stream);
		admin.inserStudentGender(Stream);
		//Now what will happen from above code we don't need to update 20-25 line only by coment out method call in this method so that method wil not work
	//and each method directly user are not accessing beacuse calling through other method like processAdmission
		

	}

	//Below all method not access directly by user it will be access by indirect through processAdmission  
	private void inserStudentBasicDetails(String fname,String lname) {
		
	}
	
	private void inserStudentaddress(String address) {
		
	}
	
	private void inserStudentGrade(char sscGrade,char hscGrade) {
		
	}
	
	private void inserStudentstream(String Stream) {
		
	}
	
	private void inserStudentGender(String isMale) {
		
	}
	
	
}

package StaticKeyword;


// from static method  you can call directly another static method  m1--> m3
// from non-static to call another non-static method it ok we can do it
//from non-static we can call static method it will be work
//from static we cannot call another non-static method without create an object 
//If you check m4 you directly call m3 you will get error for clearification check once 
public class StaticKeyword {
	int num1 = 10;
	//Here num get generic place to store static field so it will be single for whole class not create everytime 
	//when object create like num1 will alocate space everytime when new object will be create 
	static int num2=20;
	
	void processData() {
		num1++;
		num2 = num2 + num1;
	}
	
	void displayData() {
		System.out.println(num1+"  "+num2);
	}
	

	void m1() {
		
		System.out.println("3");
		//m2(); //if you callm2 here loop will be infinite 
	}
	static void m2() {
		
		System.out.println("1");
		m4();
	}
	void m3() {
		
		System.out.println("2");
		m1();
	}
	 static void m4() {
		StaticKeyword sk =new StaticKeyword();
		 sk.m3();
		System.out.println("4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              m2(); 
              StaticKeyword sum1 =new StaticKeyword(); 
              sum1.processData();
              
              StaticKeyword sum2 =new StaticKeyword(); 
              sum2.processData();
              
              sum1.displayData();
              sum2.displayData();
              
              
	}

}

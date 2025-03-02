package java8_Features;

interface R {

	void show();

}

public class LambadaExpression  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//When you don't want to use that class again then directly use Anonymous inner class to implement interface at time create object
		//as given below
		//Anonymous Inner Class 
//		R obj =new R (){ public void show() {
//			System.out.println("Hello");
//			}};

		//Lambda Expression 
		R obj = () -> System.out.println("Hello");
		obj.show();

	}

	
	}

	//Generally we are following this method but please check using lambda expression
//	public void show() {
//		System.out.println("Hello");
//	}



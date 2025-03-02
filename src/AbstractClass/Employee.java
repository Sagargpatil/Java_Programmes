package AbstractClass;

// 
public class Employee implements Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp =new Employee();
		emp.m1("Sagar");
		
	}

	@Override //writing annotation override mean it not overriding your method but it indicates compiler
	//please follow overriding rules for the below method 
	public void m1(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	@Override
	public String m2(boolean flag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	

}

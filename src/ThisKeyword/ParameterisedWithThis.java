package ThisKeyword;

public class ParameterisedWithThis {
	
	
	//When instance varaible and local variable values is same and you want to use instance variable value you should use this. keyword
	
	
	String name;
	int rno;
	
	void setData(String name,int rno) {
		
		// now I want to set value of local value to instance variable 
		//let me try
		//name = name;
		//rno = rno;
		// out print for this progrrame 
		//Student name is null
		//Student rno is 0
		//becaause copiler not sure which name it talng about so it save value to near scope variable local variable
		//Now you want to set local variable value to instance then you should use "this" keyword
		
		this.name=name;
		this.rno=rno;
		
	}
	
	void display() {
		
		System.out.println("Student name is "+ name);
		System.out.println("Student rno is "+ rno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedWithThis obj = new ParameterisedWithThis();
		obj.setData("Rahul", 1);
		obj.display();
		

	}

}

// out print for this progrrame 
//Student name is null
//Student rno is 0


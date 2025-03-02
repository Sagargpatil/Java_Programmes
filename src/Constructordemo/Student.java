package Constructordemo;

public class Student {

	public Student(int rno, String name) {
		super();
		// Here we indicating this.rno is a instance variable we are assigning local
		// variable to instance variable
		this.rno = rno;
		this.name = name;
	}
	// default constructor you can't access it outside of the package
	Student(int rno) {
		this.rno = rno;
		this.name = " ";
	}
	
	private Student() {
		rno =1;
		name="";
	}

	int rno;
	String name;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(rno + " - " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I am trying to restrict without passing this two value no
		// one able to create object of my class

		Student std = new Student(1, "Sagar");
		std.display();
	}

}

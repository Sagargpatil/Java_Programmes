package Constructordemo;

public class Child extends Parent{

	String nickName;
	int rno;
	Child(int id,String name){
		super(id,name);
		this.nickName="bittu";
		this.rno=1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child child = new Child(10,"Techno");
	}

}

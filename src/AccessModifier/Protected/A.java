package AccessModifier.Protected;

public class A {
	
	public int x=10;
	protected int y =20;
	int z=30;
	private int id=10;
	
	public void m1() {
		
		System.out.println("A m1");
	}
	
	void m2() {
		System.out.println("A m2");
	}
	
	protected void m3() {
		System.out.println("A m3");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

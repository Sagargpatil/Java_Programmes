package Multihreding;

public class MThreading extends Thread {

	public void run() {
		System.out.println("Thread running........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThreading t1 =new MThreading();
		t1.start();
		t1.setPriority(MAX_PRIORITY);
	System.out.println(t1.getPriority());	

	}

}

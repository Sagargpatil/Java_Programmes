
public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromNumber obj = new PalindromNumber();
		obj.reverse(12113);
	}
	
	void reverse(int num) {
		int revNum = 0;
		while(num > 0 ) {
			revNum=num%10+revNum*10;
			num=num/10;
			
		}
		System.out.println(revNum);
	}

}


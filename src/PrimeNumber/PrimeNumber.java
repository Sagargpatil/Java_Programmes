package PrimeNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new PrimeNumber().printNPrimeNumber(5);
		}
	void printNPrimeNumber(int n) {
		int count =0;
		int num =2;
		while(count!=n) {
			boolean flag=true;
			for(int index=2;index<=num/2;index++) {
				if(num%index==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(num);
				count++;
			} 
			num++;

	}

}
}

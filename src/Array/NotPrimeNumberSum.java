package Array;

public class NotPrimeNumberSum {

//Method for non-prime number addition from array
	int notPrimeNumber(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j <= 9; j++) {
				if (arr[i] % j == 0) {

					sum = sum + arr[i];
					break;

				}
			}
		}
		return sum;
	}

//Method for non-prime number addition with number should divisible by 5 & 7
	int exceptPrimeNumber(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j <= 9; j++) {
				if (arr[i] % j == 0) {
					if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
						sum = sum + arr[i];
						break;
					}
				}
			}
		}
		return sum;

	}

//Sum of all even numbers
	int evenNumberSum(int[] arr) {
		int evensum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				evensum = evensum + arr[i];

			}
		}
		return evensum;

	}
	
	//Sum of all odd numbers
		int oddNumberSum(int[] arr) {
			int oddsum = 0;

			for (int i = 0; i < arr.length; i++) {

				if (arr[i] % 2 != 0) {

					oddsum = oddsum + arr[i];

				}
			}
			return oddsum;

		}
		
//Difference of odd and even numbers  		
		
		int differenceOddEven(int x, int y) {
			if(x>y) {
				return x-y;
			}
			else return y-x;
		}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 44, 13, 17, 105, 35 };
		int x,y;
		NotPrimeNumberSum sum = new NotPrimeNumberSum();
		System.out.println("From the Array sum of not prime numbers " + sum.notPrimeNumber(arr));
		System.out.println("Sum of not prime numbers which are divisible by 5 and 7 " + sum.exceptPrimeNumber(arr));
		
		x=sum.evenNumberSum(arr);
		System.out.println("Sum of all even numbers " +x );
		y=sum.oddNumberSum(arr);
		System.out.println("Sum of all odd numbers " + y);
		
		System.out.println("Difference between even and odd numbers is  " + sum.differenceOddEven(x,y));
	}

}

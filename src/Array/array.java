package Array;

import java.util.Arrays;
//If we want to use class from another package so we need to import that package 
//as you can see above import package_name.file_name;
//e.g import java.util.Arrays;
//int []arr= {10,20,22};
//int []arr= {10,20,22};
//int [] arr= {10,20,22};
//int arr[]= {10,20,22};
//length is property in Array and in string is method
// ARRAY IS CONCEPT CAN BE PREMITIVE NON-PREMETIVE DATATYPE can hold multiple values
//String  []name =["",""]

//Arrays --> is a predefined class
//toString is static method of Arrays class --|__>import java.util.Arrys
public class array {

	void printName() {
		String name[] = { "Sagar", "Mohan", "Sadguru", "Hari" };

		// To print array to ways one using for loop
//		for(String naam:name) {
//			System.out.println(naam);
//		}
		// 2nd way by using Arrays method
		System.out.println(Arrays.toString(name));
	}

	// Array addition
	int arrayadd(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum = sum + a;
		}
		return sum;
	}

	// Max number in array
	int max(int[] e) {
		int maxx = 0;
		for (int i = 0; i < e.length; i++) {
			if (maxx < e[i]) {
				maxx = e[i];
			}
		}
		return maxx;
	}

	//Find minimum number programme 
	int min(int[] e) {
		int minn = e[4];
		for (int i = 0; i < e.length; i++) {
			if (minn > e[i]) {
				minn = e[i];
			}
		}
		return minn;
	}

	//Write programme to find How many trees are visible to the user 
	int visibleTrees(int[] arrT) {

		int maxH = 0;
		int count = 0;
		for (int i = 0; i < arrT.length; i++) {

			if (maxH < arrT[i]) {
				maxH = arrT[i];
			}
			if (arrT[i] >= maxH) {

				count++;
			}

		}
		return count;
	}
	
//Find secound Highest number from string 	
	int secoundHighestNumber(int []arr) {
		int max=arr[0];
		int smax=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i]<max) {
				smax=arr[i];
			}
		}
		return smax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array a = new array();
		a.printName();
		int[] e = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int r[] = { 3, 5, 4 };
		int w[]= {2,4,1,5,2,8,3,10};
		int f[] = { 3, 5, 11, 9, 10, 13 };
		
		System.out.println(a.arrayadd(e));
		System.out.println(a.max(e));

		System.out.println(a.min(e));
		// We can print array using loop and also directly by using Arrays method
		System.out.println(Arrays.toString(e));
		System.out.println("Trees are visible " + a.visibleTrees(r));
		System.out.println("Trees are visible " + a.visibleTrees(f));
		System.out.println("Trees are visible " + a.visibleTrees(w));
		System.out.println("Second max number in array is  " + a.secoundHighestNumber(f));
	}

}

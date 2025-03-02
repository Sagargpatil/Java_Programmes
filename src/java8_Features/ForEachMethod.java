package java8_Features;


import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(4,5,6,7,8,9);
		//Enhance for loop
//		for(int i : values) {
//			System.out.println(i);
//		}
//		
		//Using forEach loop
		
		values.forEach(i->System.out.println(i));

	}

}

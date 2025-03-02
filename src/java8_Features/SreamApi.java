package java8_Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inititatlize stream as list
  List<String> list = Arrays.asList("apple","banana","cherry");
  Stream<String> myStream = list.stream();
  
  //Initialize stream as array
  String[] array = {"apple","banana","cherry"};
  Stream<String> Stream = Arrays.stream(array);
  
 List<Integer> numberList = Arrays.asList(2,3,24,25,6,8,34,56,99);
 
 //By using map and filter and collect to list all items 
 List<Integer> filteredlist =numberList.stream().filter(x -> x % 2 == 0).map(x -> x/2).collect(Collectors.toList());
  System.out.println(filteredlist);
 

  
	}
	

}

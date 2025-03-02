package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayListColl {

	public static void main(String[] args) {
		String str = "Sagar";
		int count = 0;
		Map<Character, Integer> freq = new HashMap<>();
		str=str.toLowerCase();
		char[] strr = str.toCharArray();
		for (char s : strr) {
			freq.put(s, count);
			if (freq.containsKey(strr)) {

				freq.put(s, freq.getOrDefault(strr,0) + 1);

			}

		}
		System.out.println(freq);
		// TODO Auto-generated method stub
		// if you want to store any type of value string int double
		// ArrayList<Object> list= new ArrayList<Object>();
		ArrayList<String> list = new ArrayList<String>();// For generic value like only want to store String

		list.add("Sagar");
		list.add("Patil");
		list.add("Gujar");
		list.add("Maulik");
		list.add("Sagar");
		Set<String> lists = new HashSet<String>();
		lists.add("Sagar");
		lists.add("Patil");
		lists.add("Gujar");
		lists.add("Maulik");
		lists.add("Sagar");

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Sagar");
		map.put(2, "Gujar");
		System.out.println(map.get(2));

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list); // Printing Arraylist //here by compiler .tostring() method added that why it
									// print using iterator
		System.out.println(lists); // Printing Set eliminated
		System.out.println(list.contains("Hari"));
		System.out.println(list.lastIndexOf("Sagar"));
		System.out.println(list.remove("Sagar")); // remove using object and index both you can give what you want
		System.out.println(list.indexOf("Sagar"));

		System.out.println(list.get(0).toUpperCase());
		System.out.println(list.size()); // return length of arraylist

	}

}

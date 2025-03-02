package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class CharacterFrequency {
	int getCountOfTargetChar(String input, char targetChar) {
		input = input.toLowerCase(); // sagar //method called on string
		targetChar = Character.toLowerCase(targetChar);
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (targetChar == input.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	// find count of character from string by using HashMap
	public void charCount(String str) {

		char s[] = str.toCharArray();
		TreeMap<Character, Integer> wordCount = new TreeMap<>();

		for (char word : s) {
			// Normalize the word to lowercase to avoid case sensitivity
			// word = word.toLowerCase();
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		System.out.println(wordCount);

	}
	
//By using string method replace
	void getCountOfChar(String str) {
		while (str.length() > 0) {

			String ch = String.valueOf(str.charAt(0));
			int originalLength = str.length();
			str = str.replace(ch, "");

			int newLength = str.length();
			System.out.println(ch + " " + (originalLength - newLength));
		}

	}

	public static void main(String[] args) {
		CharacterFrequency c = new CharacterFrequency();
		System.out.println(c.getCountOfTargetChar("Sagar", 'r'));
		c.getCountOfChar("Sagar");
		c.charCount("DamodarNarayanRathi");

	}

}

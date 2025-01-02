package codingQ;

import java.util.*;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		String str = "abbcccddddas";

		Map<Character, Integer> ocr = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (ocr.containsKey(str.charAt(i))) {

				ocr.put(str.charAt(i), ocr.get(str.charAt(i)) + 1);
			}

			else {

				ocr.put(str.charAt(i), 1);
			}
		}

		System.out.println(ocr);
	}

}

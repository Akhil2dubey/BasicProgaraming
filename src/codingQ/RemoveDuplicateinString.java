package codingQ;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateinString {

	public static void main(String[] args) {

		String str1 = "abbacccdedde";

		Set<Character> set = new HashSet<>();

		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {

			if (!(set.contains(str1.charAt(i)))) {

				set.add(str1.charAt(i));
				str2 = str2 + str1.charAt(i);

			}
		}

		System.out.println(str2);

	}

}

package codingQ;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 5, 4, 6, 7, 5, 4, 2 };

		HashSet<Integer> unique = new HashSet<>();
		ArrayList<Integer> Al = new ArrayList<>();

		for (int num : array) {
			if (unique.add(num)) {
				Al.add(num);
			}
		}

		System.out.println(Al);
	}

}

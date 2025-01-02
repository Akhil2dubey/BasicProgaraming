package codingQ;

//reverse the word "akhil"

public class ReverseWord {
	public static void main(String[] args) {
		String word = "akhil";
		System.out.println("Original word: " + word);

		// Call the function to swap characters
		String reversew = reverseStrings(word);

		System.out.println("reverse " + reversew);

	}

	public static String reverseStrings(String word) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();

	}

}

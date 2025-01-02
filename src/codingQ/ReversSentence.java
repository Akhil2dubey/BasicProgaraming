package codingQ;

public class ReversSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "my name is akhil";

		System.out.println(sentence);

		String[] word = sentence.split(" ");

		for (int i = 0, j = word.length - 1; i < j; i++, j--) {

			String r = word[i];
			word[i] = word[j];
			word[j] = r;

		}

		String e = sentence.join(" ", word);

		System.out.println(e);

	}

}

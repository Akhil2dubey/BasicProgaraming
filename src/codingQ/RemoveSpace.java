package codingQ;

public class RemoveSpace {

	public static void main(String[] args) {
		String str = "my  name is akhil"; // The input string containing spaces

		StringBuilder sb = new StringBuilder();

		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			sb = sb.append(arr[i]);
		}

		System.out.println(sb.toString());
	}
}

package codingQ;

public class FindoddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = { 1, 2, 3, 4, 5 };

		for (int n = 0; n < i.length; n++) {

			if(i[n]%2==0) {
				System.out.println("even number " + i[n]);
			} 
			else{
				System.out.println("odd numbers " + i[n]);
			}
		}

	}
}

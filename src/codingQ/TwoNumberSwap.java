package codingQ;

//How do you swap two numbers without using a third variable in Java?

public class TwoNumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		System.out.println("a is "+ a + " b is "+ b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap" + " a is "+ a + "   b is a " + b);
	}

}

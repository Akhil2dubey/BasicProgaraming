package codingQ;

//Write a Java program to check if the given number is a prime number.
//prime number - a number that can be divided exactly only by itself and 1, for example 7, 17 and 41
public class PrimeNumber {

public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println(isPrime(19)); // true
//		System.out.println(isPrime(49)); // false
//	}
//
//	public static boolean isPrime(int n) {
//		if (n == 0 || n == 1) {
//			return false;
//		}
//		if (n == 2) {
//			return true;
//		}
//		for (int i = 2; i <= n / 2; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//
//		return true;
//

//		int n=20;
//		for (int i = 1; i <= n; i++) {
//			if (i==1 && i == 0 ) {
//				System.out.println(" PRIME_NUMBER");
//				break;
//			}
//			else if ( i % 2 == 0) {
//				System.out.println(i + " is not a prime number");
//			}
//
//			else {
//				System.out.println(i + " PRIME_NUMBER");
//			}
//
//		}
//	}
	
	
//	// Function to print all the
//    // prime numbers till N
//    static void prime_N(int N)
//    {
//        // Declaring the variables
//        int x, y, flg;
//
//        // Printing display message
//        System.out.println(
//            "All the Prime numbers within 1 and " + N
//            + " are:");
//
//        // Using for loop for traversing all
//        // the numbers from 1 to N
//        for (x = 1; x <= N; x++) {
//
//            // Omit 0 and 1 as they are
//            // neither prime nor composite
//            if (x == 1 || x == 0)
//                continue;
//
//            // Using flag variable to check
//            // if x is prime or not
//            flg = 1;
//
//            for (y = 2; y <= x / 2; ++y) {
//                if (x % y == 0) {
//                    flg = 0;
//                    break;
//                }
//            }
//
//            // If flag is 1 then x is prime but
//            // if flag is 0 then x is not prime
//            if (flg == 1)
//                System.out.print(x + " ");
//        }
//    }
//
//    // The Driver code
//    public static void main(String[] args)
//    {
//        int N = 45;
//
//        prime_N(N);
	
	int n = 25;
	int x;
	int y;
	int flag;

	for (x = 1; x <= n; x++) {

		if (x == 1 || x == 0)
			continue;
		flag = 1;
		for (y = 2; y <= x / y; y++) {
			if (x % y == 0) {
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println(x);
		}
	}

    }

}

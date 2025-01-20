package codingQ;

import java.util.Scanner;
//In Java, radix refers to the base of a numeral system (e.g., base 2 for binary,
//base 8 for octal, base 10 for decimal, and base 16 for hexadecimal).
public class BinaryConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose an option:");
		System.out.println("1. Convert Decimal to Binary");
		System.out.println("2. Convert Binary to Decimal");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter a decimal number: ");
			int decimal = scanner.nextInt();
			String binary = Integer.toBinaryString(decimal);
			System.out.println("Binary representation: " + binary);
			break;

		case 2:
			System.out.print("Enter a binary number: ");
			String binaryInput = scanner.next();
			try {
				int decimalValue = Integer.parseInt(binaryInput, 2);
				System.out.println("Decimal representation: " + decimalValue);
			} catch (NumberFormatException e) {
				System.out.println("Invalid binary number.");
			}
			break;

		default:
			System.out.println("Invalid choice. Please select 1 or 2.");
		}

		scanner.close();
	}
}

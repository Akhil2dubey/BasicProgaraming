package codingQ;

import java.util.Scanner;

//Write a Java program to check if a vowel is present in a string.

public class VowelisPresent {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(stringContainsVowels("Hello")); // true
//		System.out.println(stringContainsVowels("TV")); // false
//	}
//
//	public static boolean stringContainsVowels(String input) {
//		return input.toLowerCase().matches(".*[aeiou].*");
//				toLowerCase().
//				matches(".*[aeiou].*");
//	
		
		System.out.println("please enter the name");
		Scanner s=new Scanner(System.in);
		
		String Name=s.next();

//		String j="hello";
		String regex=".*[aeiou].*";
		if(Name.matches(regex)) {
			System.out.println("vowel present in sentence");}
			else {
				System.out.println("no vowel present in sentence ");
				
		
			}
		}
		
	}
// both scenario is right

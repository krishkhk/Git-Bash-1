package Strings;

import java.util.Scanner;

public class StringPolindromeOrNot {

	static String reverseStr = "";

	static void isPolindrome(String str) {
		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome ");
		} else {
			System.err.println(str + " is not a Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Statement: ");
		String str = sc.nextLine();
		isPolindrome(str);
		

	}

}

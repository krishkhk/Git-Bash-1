package Arrays;

import java.util.Scanner;

public class ArrayContainsSpecificValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = { 1, 2, 3, 4, 5 };

		int toFind = 3;

		boolean found = false;

		for (int n : num) {
			if (n == toFind) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(toFind + " is found.");
		else
			System.out.println(toFind + " is not found.");
	}

}

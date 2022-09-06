package Basic;

import java.util.Scanner;

/**
 * 
 * @author Hari In case of an Armstrong number of 3 digits, the sum of cubes of
 *         each digits is equal to the number itself.
 *
 */
public class Armstrong {

	public static void main(String[] args) {
		int orginal, reminder, result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		orginal = num;
		while (orginal != 0) {
			reminder = orginal % 10;
			result += Math.pow(reminder,3);
			orginal /= 10;
		}
		if(result==num) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number Not Armstrong");
		}

	}

}

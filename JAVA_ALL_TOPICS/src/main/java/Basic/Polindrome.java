package Basic;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		int rev=0,reminder=0;
		System.out.println("Enter A number");

		int num=Sc.nextInt();
		
		int orginal=num;
		while(num!=0) {
			reminder=num%10;
			rev=rev * 10 +reminder;
			num /= 10;
		}
		if(orginal==rev) {
			System.out.println("Number is Polindrome");
		}else{
				System.out.println("Number Is Not Polindrome");
			}
		
	}

}

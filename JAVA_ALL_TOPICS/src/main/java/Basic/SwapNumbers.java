package Basic;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int x=sc.nextInt();
		System.out.println("Enter b number");
		int y=sc.nextInt();
		
		System.out.println("---Before Swap "+x+"is"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping "+x+ "is" +y);

	}

}

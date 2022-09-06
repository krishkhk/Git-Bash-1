package Basic;

import java.util.Scanner;

public class SwapFourNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		System.out.println("Enter C");
		int c=sc.nextInt();
		System.out.println("Enter D");
		int d=sc.nextInt();
		System.out.println("Before Swapping "+a+"\t"+b+"\t"+c+"\t"+d);
		int temp=a;
		a=b;
		b=c;
		c=d;
		d=temp;
		
		System.out.println("Before Swapping "+a+"\t"+b+"\t"+c+"\t"+d);
		
		

	}

}

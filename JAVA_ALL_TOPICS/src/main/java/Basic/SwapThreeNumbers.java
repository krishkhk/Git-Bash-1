package Basic;

import java.util.Scanner;

public class SwapThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C value");
		int c=sc.nextInt();
		System.out.println("Before Values Swapping " +a+"\t"+b+"\t"+c);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println("After Values Swapping " +a+"\t"+b+"\t"+c);

	}

}

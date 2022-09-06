package Basic;

import java.util.Scanner;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int x=sc.nextInt();
		System.out.println("ENter B number");
		int y=sc.nextInt();
		System.out.println("Enter C number");
		int z=sc.nextInt();
		System.out.println("Enter D number");
		int w=sc.nextInt();
		//System.out.println("Before Swapping " +a+" "+b+" "+c+""+d);
		/*int temp=a;
		a=b;
		b=c;
		c=d;
		d=temp;
		System.out.println("After Swapping " +a+" "+b+" "+c+" "+d);*/
		System.out.println("befor Swapping " +x+" "+y+" "+z+" "+w);
		x=x+y;
        y=x-y;
        x=x-y;

        y=y+z;
        z=y-z;
        y=y-z;

        z=z+w;
        w=z-w;
        z=z-w;
		System.out.println("After Swapping " +x+" "+y+" "+z+" "+w);
	}

}

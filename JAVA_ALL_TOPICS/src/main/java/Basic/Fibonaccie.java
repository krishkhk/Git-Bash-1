package Basic;

import java.util.Scanner;

/**
 * 
 * @author hari
 * Starting with 0 and 1, each new number in the Fibonacci Series is simply the sum of the two before it. For example, 
 * starting with 0 and 1, the first 5 numbers in the sequence would be 0, 1, 1, 2, 3 and so on.
 * using for & while loop
 *
 */
public class Fibonaccie {

	public static void main(String[] args) {
		
		int n,first=0,next=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many fibonaccies");
		n=sc.nextInt();
		System.out.println("The"+n +"Fibonacies are:");
		System.out.print(first +" "+next);
		int i=1;
		while(i<n-1) {
			int sum=first+next;
			first=next;
			next=sum;
			System.out.println(" "+sum);
			i++;
			
		}

	}

}

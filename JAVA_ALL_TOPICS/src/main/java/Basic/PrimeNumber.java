package Basic;

import java.util.Scanner;

/**
 * 
 * @author hari
 * 
 * number divide by itself
 *2,3,5,7,11,13.
 */
public class PrimeNumber {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<n;++i) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("The Given" +n+ "Is Prime");
		}else {
			System.out.println("The Given"+n+"Not Prime");
		}
		
	}

}

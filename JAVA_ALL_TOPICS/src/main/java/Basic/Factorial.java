package Basic;

import java.util.Scanner;

public class Factorial {
	public void fact(){

		int i;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value to know the factorial.....");
		  int num= sc.nextInt(); 
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println(fact);    
	}
	

	public static void main(String[] args) {
		Factorial obj=new Factorial();
		obj.fact();
	}

}

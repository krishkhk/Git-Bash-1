package Basic;

import java.util.Scanner;

public class polindrom {

	public static void main(String[] args) {
		
		int rev=0,temp,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int orginal=num;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orginal==rev){
			System.out.println("Number is polindrom"+orginal);
		}else{
			System.out.println("number not plindrom"+orginal);
		}

	}

}

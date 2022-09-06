package Strings;

import java.util.Scanner;

public class StringRever {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String here!");
		String key=sc.nextLine();
		//Method1
		StringBuilder in=new StringBuilder();
		in.append(key);
		in.reverse();
		System.out.println("after reverse: " +in);

		//Method2
		StringBuffer input=new StringBuffer(key);
		input.reverse();
		System.out.println("adter reverse stringbuffer :"+input);
		
	}

}

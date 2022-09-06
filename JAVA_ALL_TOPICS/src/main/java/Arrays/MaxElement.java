package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		int [] arr={10,20,30,40,500};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("Largest element:"+max);
	}

}

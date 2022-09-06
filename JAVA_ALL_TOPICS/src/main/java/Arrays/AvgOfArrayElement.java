package Arrays;

public class AvgOfArrayElement {

	public static void main(String[] args) {
		int sum=0;
		int[] arr={10,25,34,36,8,48,95,75};
		
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		double avg=sum/arr.length;
		System.out.println("Average of Array Element " +avg);


		
	}

}

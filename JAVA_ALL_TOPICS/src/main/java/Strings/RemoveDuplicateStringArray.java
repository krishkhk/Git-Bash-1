package Strings;

public class RemoveDuplicateStringArray {

	public static void main(String[] args) {
		
		String [] arr= {"hari","krishna","krishna","hari","hkl","hk1","hkrishna"};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])&&(i!=j)) {
					System.out.println("Duplicate String is "+arr[j]);
				}
			}
		}

	}

}

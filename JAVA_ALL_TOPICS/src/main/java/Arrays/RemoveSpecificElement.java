package Arrays;

import java.util.Arrays;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		
			   int[] m = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
			   
			   System.out.println("Original Array : "+Arrays.toString(m));     
			   
			 
			   int removeIndex = 1;

			   for(int i = removeIndex; i < m.length -1; i++){
			       m[i] = m[i + 1];
	
			   }
			
			    System.out.println("After removing the second element: "+Arrays.toString(m));
			 }
}
	



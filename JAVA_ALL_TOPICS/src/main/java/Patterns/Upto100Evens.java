package Patterns;

public class Upto100Evens {

	public static void main(String[] args) {
	
		int k=1;
		for(int i=0;i<6;i++){
			for(int j=0;j<i;++j){
				System.out.print("*" +" ");
				k++;
			}
			System.out.println();
		}
	}

}

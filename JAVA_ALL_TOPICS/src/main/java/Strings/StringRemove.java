package Strings;

public class StringRemove {

	public static void main(String[] args) {
		
		String[] str={"hari","naga","naga","hari","krishna","hari"};
		
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;++j){
				
				if(str[i].equals(str[j])){
					
					System.out.println("string " +str[j]);
				}
			}
			
			
		}

	}

}

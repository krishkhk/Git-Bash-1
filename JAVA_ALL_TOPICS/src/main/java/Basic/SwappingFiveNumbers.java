package Basic;

public class SwappingFiveNumbers {

	public static void main(String[] args) {
	
		int a=2;
		int b=3;
		int c=4;
		int d=5;
		int e=6;
		System.out.println("Before " +a+" "+b+" "+c+" "+d+" "+e);
		a=a+b+c+d+e;
		b=a-(b+c+d+e);
		c=a-(b+c+d+e);
		d=a-(b+c+d+e);
		e=a-(b+c+d+e);
		a=a-(b+c+d+e);
		System.out.println(+a+" "+b+" "+c+" "+d+" "+e);
				
	}

}

package SingleTonJavaClass;
/**
 * 
 * @author hk21398
 *a singleton class is a class that can have only one object (an instance of the class) at a time.
 *Make private Constructor.
 *static method.
 *
 */
public class SingletonClass {

	private static SingletonClass singleobj;
	private SingletonClass() {
	}
	
	public static SingletonClass getInstance(){
		if(singleobj==null){ //it checks obj is null or already exist
			singleobj=new SingletonClass();
		}
		return singleobj;
	}
	public void contactDetails(){
		System.out.println("Single Object datils");
	}

	public static void main(String[] args) {

		SingletonClass sc=SingletonClass.getInstance();
		System.out.println(sc);
		SingletonClass sc1=SingletonClass.getInstance();
		System.out.println(sc1);
		SingletonClass sc2=SingletonClass.getInstance();
		System.out.println(sc2);
		
	}

}

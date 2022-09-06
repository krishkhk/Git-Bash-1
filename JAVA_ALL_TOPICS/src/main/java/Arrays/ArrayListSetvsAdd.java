package Arrays;
/**
 * The set() method adds a new element at the specified position by replacing the older element at that position.
The add() method adds a new element at the specified position by shifting the older element towards the right position.
 */
import java.util.ArrayList;

public class ArrayListSetvsAdd {

	public static void main(String[] args) {

		ArrayList<String> courses=new ArrayList<>();
		courses.add("python");
		courses.add("java");
		courses.add("springboot");
		courses.add("Microservices");
		
		//Another ArrayList
		
		ArrayList<String> list=new ArrayList<>();
		list.addAll(courses);
		System.out.println("2nd Arraylist" +list);
		
		//use of set()
		
		list.set(2, "Webservice");
		System.out.println("set method "+list);
		
		//use of add().
		
		list.add(0, "php");
		System.out.println("Add method "+list);
		
		

	}

}

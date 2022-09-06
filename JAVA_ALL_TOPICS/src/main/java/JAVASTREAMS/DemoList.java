package JAVASTREAMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DemoList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,25,24,1,5,4,8);
	
		System.out.println(list);
		
		list.forEach(i-> System.out.println(i));
		
		Collections.sort(list);
		System.out.println("----------");
		System.out.println(list);
	
		
		List<Integer> even=list.stream().filter(i->(i%2==0)).collect(Collectors.toList());
		
		for(Integer e:even) {
			System.out.println(e);
		}
	}

}

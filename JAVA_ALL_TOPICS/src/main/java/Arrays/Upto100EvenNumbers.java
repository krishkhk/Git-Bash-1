package Arrays;

import java.awt.image.RescaleOp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Upto100EvenNumbers {

	public static void main(String[] args) {

		int num = 100;

		System.out.println("List of Even numbers of 1 to " + num + "are :");
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}

		// using java8 streams.

		List<Integer> numbers = Arrays.asList(1, 4, 8, 40, 46, 56, 11, 22, 33, 99);
		List<Integer> list = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

		// using Array

		int[] arr = { 10, 11, 22, 41, 51, 75, 33, 25, 65, 45 };
		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach(System.out::println);

		// print both odd and even numbers

		System.out.println("Both Even or odd numbers");
		Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(result);

	}

}

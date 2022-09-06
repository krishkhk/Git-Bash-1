package Arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementArray {

	public static void main(String[] args) {

		java.util.List<Integer> numbers = (java.util.List) Arrays.asList(1, 2, 1, 3, 4, 4);

		Set<Integer> duplicate = numbers.stream().filter(n -> numbers.stream().filter(x -> x == n).count() > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicate);
	}

}

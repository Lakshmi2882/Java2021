package Naveen;

import java.util.Arrays;
import java.util.List;

public class PrintaverageStream {

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(1,2,3,4);
	double Average=numbers.stream().map(e->e).mapToInt(e->e).average().getAsDouble();
	System.out.println(Average);

	}

}

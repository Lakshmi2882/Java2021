package Naveen;

import java.util.Arrays;
import java.util.List;

public class SumofnumberStream {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
	int sum=	numbers.stream().map(e->e).mapToInt(e->e).sum();
	System.out.println(sum);

	}

}

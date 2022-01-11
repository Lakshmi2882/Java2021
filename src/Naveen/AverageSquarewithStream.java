package Naveen;

import java.util.Arrays;
import java.util.List;


public class AverageSquarewithStream {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4);
	double average=	numbers.stream().filter(e->e>1).map(e->e*e).mapToInt(e->e).average().getAsDouble();
	System.out.println(average);
	
	

	}

}

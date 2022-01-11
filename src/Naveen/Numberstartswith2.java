package Naveen;

import java.util.Arrays;
import java.util.List;

public class Numberstartswith2 {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(2,22,34,345,234,567,345,22222);
	List<Integer> prefix2=	numbers.stream().filter(e->e.toString().startsWith("2")).toList();
	List<Integer> prefix3=numbers.stream().filter(e->e.toString().startsWith("3")).toList();
	System.out.println(prefix2);
	System.out.println(prefix3);
		

	}

}

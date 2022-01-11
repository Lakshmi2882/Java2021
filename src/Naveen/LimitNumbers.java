package Naveen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
	List<Integer> List=Arrays.asList(2,3,23,34,45,56,67,78,89,90);
	List<Integer> list5=List.stream().limit(5).collect(Collectors.toList());
	System.out.println(list5);
int total=	list5.stream().reduce((p,q)->p+q).get();
System.out.println(total);

	}

}

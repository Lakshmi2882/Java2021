package Naveen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenandoddwithStream {

	public static void main(String[] args) {
		List<Integer>number=Arrays.asList(2,34,45,56,67,78,89,90);
    List<Integer>evennumbers=  number.stream()
      .filter(e->e%2==0)
      .collect(Collectors.toList());
    System.out.println(evennumbers);
  List<Integer>oddnumbers=  number.stream()
    .filter(e->e%2!=0)
    .collect(Collectors.toList());
  System.out.println(oddnumbers);
    
	}

}

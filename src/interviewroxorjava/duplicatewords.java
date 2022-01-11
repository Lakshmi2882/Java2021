package interviewroxorjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicatewords {

	public static void main(String[] args) {
ArrayList<String> array= new ArrayList<String>(Arrays.asList("ruby","ruby","python","python"));
List<String> arraydu= array.stream().distinct().collect(Collectors.toList());
System.out.println(arraydu);

	}

}

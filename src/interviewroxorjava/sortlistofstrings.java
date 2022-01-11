package interviewroxorjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortlistofstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list= new ArrayList<String>(Arrays.asList("Lakshmi","Radhika","Swaraj","Bharadwaj","Raghu","Naveen","Latha"));
List<String>sortedlist=list.stream().sorted().collect(Collectors.toList());
for(String e: sortedlist)
{
	System.out.println(e);
}
 
	

}
}
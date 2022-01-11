package octoberjavainterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayoddnumber {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		list.removeIf(list1->list1%2==0);
		System.out.println(list);
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("Naveen","Lakshmi","krishna","Raghu","Lakshmi","Krishna"));
		System.out.println(names);
		names.retainAll(Collections.singleton("Lakshmi"));
		System.out.println(names);
		

	}

}

package interviewroxorjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeduplicateelementsinanarray {

	public static void main(String[] args) {
//	ArrayList<Integer>list= new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,5,5,4,6,7));
//	System.out.println(list);
//	LinkedHashSet<Integer>hashset=new LinkedHashSet<Integer>(list);
//	ArrayList<Integer>listwithoutduplicate=new ArrayList<Integer>(hashset);
//	System.out.println(listwithoutduplicate);
		ArrayList<Integer>marks=new ArrayList<Integer>(Arrays.asList(26,89,45,34,34,45));
	List<Integer>marksunique=	marks.stream().distinct().collect(Collectors.toList());
	System.out.println(marksunique);

	}

}

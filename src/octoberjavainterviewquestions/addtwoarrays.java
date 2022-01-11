package octoberjavainterviewquestions;

import java.util.ArrayList;

public class addtwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> list1=new ArrayList<String>();
		list1.add("Radhika");
		list1.add("Lakshmi");
		list1.add("Eddanapudi");
		System.out.println("list1 is: "+list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Raghu");
		list2.add("Ram");
		list2.add("Eddanapudi");
		System.out.println("list2 is: "+list2);
		list1.addAll(list2);
		System.out.println(list1);
		

}
}


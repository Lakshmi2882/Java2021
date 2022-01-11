package SoftTestingHelpPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		list1.add(600);
		for(int i=0;i<=list1.size()-1;i++)
		{
			System.out.println(list1.get(i));
		}
 Iterator<Integer> it=list1.iterator();
 while(it.hasNext())
 {
	 System.out.println(it.next());
 }
	}

}

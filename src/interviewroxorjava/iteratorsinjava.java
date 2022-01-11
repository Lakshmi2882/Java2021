package interviewroxorjava;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Radhika");
		list.add("Raghu");
		list.add("Swaraj");
		list.add("Bharadwaj");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

package javaprograms;

import java.util.HashSet;
import java.util.Set;

public class duplicateelementsarray {

	public static void main(String[] args) {
		String[] names= {"Radhika","Rasiga","Rajani","Ranjani","lakshmi","Rajani","Rasiga","raji","rani","raji","rani","rani"};
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
						{
					System.out.println(names[i]);
						}
			}
		}
		System.out.println("using Hashset");
		Set<String> data=new HashSet<String> ();//1.Set is an interface
		//Hashset is a class
		//set does not store duplicate values
		for(String e:names)
		{ if(data.add(e)==false)
		{
			System.out.println(e);
		}
		

	}

}
}

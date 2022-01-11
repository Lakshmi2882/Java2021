package pavan;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumberArray {

	public static void main(String[] args) {
		List<Integer>ArrayList=Arrays.asList(2,4,5,3,4,34,56,45,34);
		int Ecount=0;
		int Ocount=0;
		for(int i=0;i<ArrayList.size();i++)
		{
			if(ArrayList.get(i)%2==0)
			{
				Ecount=Ecount+1;
			}
			else
			{
				Ocount=Ocount+1;
			}
		}
		
System.out.println("even numbers count:"+Ecount);
System.out.println("odd numbers count:"+Ocount);
	}

}

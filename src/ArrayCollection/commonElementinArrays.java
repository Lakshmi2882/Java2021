package ArrayCollection;

import java.util.Arrays;
import java.util.List;

public class commonElementinArrays {

	public static void main(String[] args) {
	List<Integer> A1= Arrays.asList(11,12,3,4);	
		List<Integer> A2=Arrays.asList(1,2,3,4);
			
		for(int i=0;i<A1.size();i++)
		{
			for(int j=0;j<A2.size();j++)
			{
				if(A1.get(i)==A2.get(j))
				{
			System.out.println(A1.get(i));
				}
			}

	}

	}
}

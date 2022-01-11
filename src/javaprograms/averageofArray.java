package javaprograms;

import java.util.Arrays;
import java.util.OptionalDouble;

public class averageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,3,5,6,7,8,9};
		int l=num.length;
		double av;
		int total=0;
		for(int i=0;i<num.length;i++)
		{
			total=(total+num[i]);
		}
System.out.println(total);
System.out.println(av=total/l);
//java 8 stream
OptionalDouble average= Arrays.stream(num).average();
System.out.println(average.getAsDouble());
	}

}

package Naveen;

import java.util.Arrays;
import java.util.List;

public class commonlongestprefix {

	public static void main(String[] args) {
List<String> list=Arrays.asList("flower","flow","fliw");

for(int i=0;i<list.size();i++)
{
for(int j=0;j<=i;j++)
{
	if(list.get(i).charAt(j)==list.get(i+1).charAt(j))
	{
		System.out.println(list.get(i).charAt(j));
	}
}
}


	}

}

package ArrayCollection;

import java.util.ArrayList;

public class ReverseElement {

	public static void main(String[] args) {
		ArrayList<String> Element=new ArrayList<String>();

		Element.add("Yellow");
		Element.add("Green");
		Element.add("Blue");
		Element.add("Orange");
		
	for(int i=0;i<Element.size();i++)
	{String rev="";
		for(int j=Element.get(i).length()-1;j>=0;j--)
		{
			rev=rev+Element.get(i).charAt(j);
		}
		System.out.println(rev);
	}
	}

}

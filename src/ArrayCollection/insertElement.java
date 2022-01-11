package ArrayCollection;

import java.util.ArrayList;

public class insertElement {

	public static void main(String[] args) {
		ArrayList<String> elements=new ArrayList<String>();
		elements.add("Red");
		elements.add("orange");
		elements.add(elements.size(),"Yellow");
		elements.add(0,"Green");
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i));
		}
		

	}

}

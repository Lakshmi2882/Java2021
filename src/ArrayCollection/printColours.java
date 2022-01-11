package ArrayCollection;

import java.util.ArrayList;

public class printColours {

	public static void main(String[] args) {
		ArrayList<String> colours=new ArrayList<String>();
		colours.add("Red");
		colours.add("Orange");
		colours.add("Green");
	//	System.out.println(colours);
		for(int i=0;i<colours.size();i++)
		{
			System.out.println(colours.get(i));
		}

	}

}

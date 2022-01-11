package ArrayCollection;

import java.util.ArrayList;

public class Updatebygivenelement {

	public static void main(String[] args) {
		
		ArrayList<String>update=new ArrayList<String>();
		update.add("Yellow");
		update.add("Green");
		update.add("Pink");
		update.add("Grey");
		update.add("White");
		update.add(3, "Red");
		update.set(4, "Purple");
		for(int i=0;i<update.size();i++)
		{
			System.out.println(update.get(i));
		}
		
			}

}

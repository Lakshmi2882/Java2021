package ArrayCollection;

import java.util.ArrayList;

public class EmptyanArrayList {

	public static void main(String[] args) {
		ArrayList<String> Element=new ArrayList<String>();
		Element.add("Yellow");
		Element.add("Green");
		Element.add("Blue");
		Element.add("Red");
		Element.add("Pink");
	boolean b=	Element.removeAll(Element);
System.out.println(b);
	}

}

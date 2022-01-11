package ArrayCollection;

import java.util.ArrayList;

public class SearchElment {

	public static void main(String[] args) {
		ArrayList<String> Element=new ArrayList<String>();
		Element.add("London");
		Element.add("Scotland");
		Element.add("Manchester");
		Element.add("Bristol");
	System.out.println(Element.get(3));
boolean b=	Element.contains("Dublin");
System.out.println(b);
	}

}

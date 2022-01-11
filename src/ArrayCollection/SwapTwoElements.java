package ArrayCollection;

import java.util.ArrayList;

public class SwapTwoElements {

	public static void main(String[] args) {
		ArrayList<String> Element=new ArrayList<String>();
		Element.add("Yellow");
		Element.add("Green");
		System.out.println(Element);
		String temp=Element.get(0);
		Element.set(0, Element.get(1));
		Element.set(1, temp);
		System.out.println(Element);
		

	}

}

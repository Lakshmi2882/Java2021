package ArrayCollection;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<String> Month=new ArrayList<String>();
		Month.add("January");
		Month.add("February");
		Month.add("March");
		Month.add("April");
		Month.add("May");
		Month.add("June");
		Month.add("July");
		Month.remove(3);
		System.out.println(Month);

	}

}

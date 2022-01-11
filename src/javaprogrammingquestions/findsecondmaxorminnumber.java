package javaprogrammingquestions;

import java.util.Arrays;

public class findsecondmaxorminnumber {

	public static void main(String[] args) {
		int num[]= {23,456,34,45,67};
		Arrays.sort(num);//23,34,45,67,456
		System.out.println(num.length);
		System.out.println(num[2]);

}
}
package ArrayCollection;

import java.util.HashSet;

public class IntersectionofArrays {

	public static void main(String[] args) {
		int arr1[]= {2,3,4,5};
		int arr2[]= {3,4,5};
		Intersection(arr1,arr2);

	}
 public static void Intersection(int arr1[],int arr2[])
 {
	 HashSet<Integer> hs=new HashSet<>();
	 for(int i=0;i<arr1.length;i++)
	 {
		 hs.add(arr1[i]);
	 }
	 for(int i=0;i<arr2.length;i++)
	 {
		if( hs.contains(arr2[i]))
		{
			System.out.println(arr2[i]);
		}
	 }
 }
}

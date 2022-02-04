import java.util.ArrayList;

public class plusOne {

	public static void main(String[] args) {
		int[] num= {6,8,9};
		int k=num.length-1;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+(int)Math.pow(10, k)*num[i];
			k=k-1;
			
		}
		System.out.println(sum);
		int newsum=sum+1;
		String conv=String.valueOf(newsum);//"124"
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<conv.length();i++)
		{ 
		Integer j = conv.charAt(i) - '0'; //'1' - '0' //54-48=6
	list.add(j);
		}
System.out.println(list);
		}
		
		

}

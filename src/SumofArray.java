import java.util.Arrays;
import java.util.List;


public class SumofArray 
{

	public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(2,3,4,5);
	int sum=0;
	for(int i=0;i<numbers.size();i++)
	{
		sum=sum+numbers.get(i);
	}
	System.out.println(sum);
	
	
	
}
}
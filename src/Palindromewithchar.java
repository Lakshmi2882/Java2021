
public class Palindromewithchar {

	public static void main(String[] args) {
		
	
System.out.println(isPalindrome("abcdcb"));
	}
	public static boolean isPalindrome(String str)
	{
		int leftIndex=0;
		int rightIndex=str.length()-1;
		while(leftIndex<rightIndex)
		{
		if(	str.charAt(leftIndex)!=str.charAt(rightIndex))
				{
			return false;
				}
		leftIndex=leftIndex+1;
		rightIndex=rightIndex-1;
		}
		return true;
	}
	
	}



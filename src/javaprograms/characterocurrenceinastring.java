package javaprograms;

public class characterocurrenceinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="my name is Radhika and I am doing java program ";
System.out.println(characteroccurence(name,'i'));
	}
	public static long characteroccurence(String name,char c)
	{
		long count= name.chars().filter(e->(char)e == 'a'||(char)e == c).count();
		return count;
	}

}

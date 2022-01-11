
public class removeduplicatesfromastring {

	public static void main(String[] args) {
		String name="automation";
		String nodup="";
		for(char ch:name.toCharArray())
		{
			if(!nodup.contains(name.valueOf(ch)))
			{ 
				nodup= nodup+ch;
			}
			
		}
		System.out.println(nodup);
		

	}

}

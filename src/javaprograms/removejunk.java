package javaprograms;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="%%%%%radhika-----";
		String name=" ";
		for(int i=s.length()-1;i>=0;i--)
		{    char ch=s.charAt(i);
			if(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')))
			{
				ch=Character.toLowerCase(ch);
				name=name+ch;
			}
		}
        System.out.println(name);
	}

}

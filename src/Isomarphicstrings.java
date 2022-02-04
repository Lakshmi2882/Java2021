import java.util.HashMap;

public class Isomarphicstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="foos";
		String t="baru";
		HashMap<Character,Character> hs=new HashMap<Character,Character>();
	char[] c1=   s.toCharArray();
    char[] c2=t.toCharArray();
    if(s.length()==t.length())
    {
    for(int i=0;i<s.length();i++)
    {
        if(!hs.containsKey(c1[i]))
        {
            hs.put(c1[i],c2[i]);//(a,e),(d,g)
        }
    }
    
   System.out.println(hs);
  
    
		}
           
}
}
	
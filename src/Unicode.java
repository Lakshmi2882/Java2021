public class Unicode {

	public static void main(String[] args) {
	printunicode("xyz",2);
	}
		
		public static void printunicode(String str,int key)
		{ char   uni;
			 int newlettercode;
			 String c="";
		for(int i=0;i<str.length();i++)
		{ 
			String v=Integer.toHexString(str.charAt(i));
			try
			{
   newlettercode=Integer.parseInt(v)+key;
   
   if(newlettercode<=122)
   {
uni= (char)newlettercode;
 c=c+String.valueOf(uni);
   }
   else
uni=	 (char)(96+(newlettercode%122));
   c=c+String.valueOf(uni);
	
	}
		
			catch(Exception e)
			{
				e.printStackTrace();
			}
	   
		
		 System.out.println(c);
		}
		}
}



	



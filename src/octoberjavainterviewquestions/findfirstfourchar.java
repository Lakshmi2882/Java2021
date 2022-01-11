package octoberjavainterviewquestions;

public class findfirstfourchar {

	public static void main(String[] args) {
		String str="www.eurostar.com";
String firstfour=	str.substring(0, 4);
System.out.println(firstfour);

String lastfour=str.substring(str.length()-4,str.length());
System.out.println(lastfour);
int index=str.indexOf(".");
System.out.println(index);
int lastindex=str.lastIndexOf(".");
System.out.println(lastindex);
String str1= str.substring(index+1,lastindex);
System.out.println(str1);

	}

}

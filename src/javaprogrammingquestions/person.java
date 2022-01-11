package javaprogrammingquestions;

public class person {
String name;
int age;
static String address;
	public static void main(String[] args) {
	person employee1=new person();
	employee1.age=39;
	employee1.name="Radhika";
	person.address="67 juniper court";
	System.out.println(employee1.age);
	System.out.println(employee1.name);
	System.out.println(person.address);
	person employee2=new person();
	
	System.out.println(employee2.age);
	System.out.println(employee2.name);
	System.out.println(person.address);
	}
	

}

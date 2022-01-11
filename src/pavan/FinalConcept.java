package pavan;

public class FinalConcept {

	public static void main(String[] args) {
		final int a=20;
	//	System.out.println(a++);1. you can not modify the value if the variable is final
		//it provides constant values
		final int days=7;
		System.out.println(days);
		int salary=2000;
		int perdaysalary=salary/days;
		System.out.println(perdaysalary);
		//if method is final , method can not be overridden
		//if class is final, class can not be parent class of other classes

	}

}

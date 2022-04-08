package access_specifier;

public class AS1_Study {

	public static void main(String[] args) 
	{
		AS_study a1=new AS_study();
		a1.addition();//call public method in different class (scope is in project)
		a1.sub();// default method its scope is within package
		a1.mul();//protected method scope is in package and outside the package with help of inheritance operation
		//a1.div(); not possible because scope of private is inside a class only
		
		System.out.println("calling public variable in different class "+a1.a);//scope is throughout project
		System.out.println("calling default in different class "+a1.b);//scope is within class only
		System.out.println("calling protected in different class "+a1.c);//scope is in package ,with inheritance we have access outside package
		//System.out.println("calling private in different class "+a1.d);not possible because scope is in the class only
	}

}

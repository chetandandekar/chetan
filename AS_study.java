package access_specifier;

public class AS_study 
{
	public int a=100; // global variable of public type
	int b=200; // global variable of default type
	protected int c=300; // global variable of protected type
	private int d=400; // global variable of private type

	
	public static void main(String[] args) 
	{
		AS_study aa=new AS_study(); // creating object
		aa.addition();// calling public method in same class (scope is throughout the project)
		aa.sub();//calling default method (scope is within package)
		aa.mul();//calling protected method(scope is within package, for outside package we have to follow inheritance operation)
		aa.div();// calling private method (scope is within class)
		System.out.println("calling public variable in same class"+aa.a);//scope throughout project
		System.out.println("calling default variable in same class"+aa.b);//scope within a package
		System.out.println("Calling protected in same class "+aa.c);//scope within a package and outside package with inheritance oiperation
		System.out.println("Calling private in same class"+aa.d);//scope only in a class
	}

	
	public void addition ()
	{
		int a=400;
		int sum=100+a;
		System.out.println("Addition is "+sum);
	}
	
	void sub()
	{
		int a=200;
		int b=500;
		System.out.println("Substraction is "+(b-a));
	}
	
	
	protected void mul()
	{
		int a=12;
		int b=13;
		int mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	
	private void div()
	{
		float f=514;
		float d=24;
		float sub=f/d;
		System.out.println("Division is "+sub);
	}
}




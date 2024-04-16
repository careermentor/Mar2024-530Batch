package basicJava;

public class Calculations //extends FileHandleing
{
	
	
	
	public Calculations()
	{
		System.out.println("this is constructor");
		
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	
	public Calculations(int a, int b)
	{
		System.out.println("this is constructor with parameter");
		int c = a+b;
		System.out.println(c);
	}
	

	public int sum()   //method without input/argument/parameter
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println(c);
		
		System.out.println("this is sum method");
		System.out.println(10);
		
		System.out.println("this is sum a&b: " + c); //concatnate
		System.out.println(10+20);
		
		System.out.println("this is test1" + "this is test2");  //concatnate
		return c;
		
	}
	
	
	
	public int add(int a, int b)  //method with input/arguments/parameters
	{
		int c = a+b;
		
		
		System.out.println("addition of a&b: " + c);
		
		return c;
		//10+20+30
		//x = 10+20
		//x+30
		
	}
	
	
	public static void main(String[] args)
	{
	
		Calculations cal = new Calculations();  //constructor is getting called automatically
		
		Calculations cal1 = new Calculations(20,30);
		
		cal1.sum();
		
		int x = cal.add(10, 20);
		cal.add(x, 30);
		
		cal.add(40, 80);
		cal.add(50, 90);
	
		
		
	}
	
}

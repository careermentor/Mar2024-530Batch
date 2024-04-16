package basicJava;

public class FirstClass
{
	int a = 10; //global variable
	//a=50;
	
	float b = 10.5f;
	
	char c = 'X';
	String d = "Java";
	
	boolean e = true;
	
	public void printdata()
	{
		final int a = 20;  //local variable
		//a=30;
		System.out.println(a); //20
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
	}
	
	public void var()
	{
		System.out.println(a); //10
	}
	
	
	
	
	public static void main(String[] args) 
	{
		FirstClass abc = new FirstClass();  //to create object of the class
		abc.printdata();
		abc.var();
	}
	
	
	
	
	
	
}

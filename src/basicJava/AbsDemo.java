package basicJava;

public abstract class AbsDemo 
{
	int a = 20;
	

	public void meth1()
	{
		int b = 20;
		b=40;
		System.out.println("this is method1");
		System.out.println(b);
	}
	
	public abstract void meth2();
	
	public static void main(String[] args)
	{
	
		//AbsDemo ad = new AbsDemo();
		//ad.meth1();
		
	}
	
}

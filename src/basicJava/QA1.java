package basicJava;

public  class QA1 
{
	///overloading

	static int x = 100;
	
	public static void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		System.out.println(x);
	}
	
	public  void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: " + d);
	}
	
	public final void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	
	public static void main(String[] args) 
	{
		QA1.sum(20, 30);
		
	}
	
}

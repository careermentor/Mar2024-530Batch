package basicJava;

public class QA2 extends QA1
{

	int x = 20;
	
	
	public void qa2m() 
	{
		System.out.println("this is qa2 method");
		
	}
	
	
	
	
	
	/*public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
		
		
		System.out.println(x);  //20
		//System.out.println(super.x); //100
	}*/
	
	public void sum(int a, int b, int c)
	{
		int d = a*a+b*b+c*c;
		System.out.println("sum of a&b&c: " + d);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		q2.sum(20, 30);
		//q2.calloriginalsum();
		
		
	}

	

	
	
	
}

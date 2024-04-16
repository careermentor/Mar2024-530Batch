package basicJava;

public class ImplemnetIterface implements DemoInterface
{
	

	
	public void mymeth()
	{
		System.out.println("this is my own method");
	}
	
	public void meth3() {
		System.out.println("this is method3");
		
	}

	
	public void meth4() {
		
		System.out.println("this is method4");
		System.out.println(a+5);  //50
	
	}

	
	public void meth5() {
		System.out.println("this is method5");
		
	}
	
	public static void main(String[] args) {
		ImplemnetIterface ie = new ImplemnetIterface();
		ie.meth3();
		ie.meth4();
		ie.meth5();
	}

	
}

package basicJava;

public class CallAbsDemo extends AbsDemo 
{

	
	public void meth2() {
		System.out.println("this is my credential");
		System.out.println(a);
	}

	public static void main(String[] args) {
		CallAbsDemo cad = new CallAbsDemo();
		cad.meth1();
		cad.meth2();
	}
	
}

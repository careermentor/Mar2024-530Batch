package basicJava;

public class QA4 implements QA1I, QA3I
{

	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a&b: " + c);
	}
	
	public static void main(String[] args) {
		QA4 q4 = new QA4();
		//q4.mul(20, 30);
		//q4.sub(20, 30);
		//q4.sum(20, 30);
		q4.div(20, 10);
		
		q4.QA1IM();
		q4.QA3IM();
		
		
	}

	
	public void QA3IM() {
		System.out.println("this is method of QA3I");		
	}

	public void QA1IM() {
		// TODO Auto-generated method stub
		
	}
	
}

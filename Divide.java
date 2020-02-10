
public class Divide extends Calculator{
	private int a,b;
	private float p,q;
	public Divide(float p, float q) {
		super(p, q);
	}
	
	public Divide(int a, int b) {
		super(a, b);
	}
	
	void div(int a,int b) {
		if(b==0) {
			System.out.println("Division by zero is not permitted !");
			return;
		}
		else
			System.out.println("The division of given integers is "+(a/b));
	}
	
	void div(float a,float b) {
		if(b==0) {
			System.out.println("Division by zero is not permitted !");
			return;
			
		}
		else
			System.out.println("The division of given floats is "+(a/b));
	}
}

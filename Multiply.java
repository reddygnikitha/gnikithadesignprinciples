
public class Multiply extends Calculator{
	private int a,b;
	private float p,q;
	public Multiply(float p, float q) {
		super(p, q);
	}
	
	public Multiply(int a, int b) {
		super(a, b);
	}
	
	void mul(int a,int b) {
		System.out.println("The product of given integers is "+(a*b));
	}
	
	void mul(float a,float b) {
		System.out.println("The product of given floats is "+(a*b));
	}
}

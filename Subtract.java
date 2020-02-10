
public class Subtract extends Calculator{
	private int a,b;
	private float p,q;
	public Subtract(float p, float q) {
		super(p, q);
	}
	
	public Subtract(int a, int b) {
		super(a, b);
	}
	
	void sub(int a,int b) {
		System.out.println("The difference of given integers is "+(a-b));
	}
	
	void sub(float a,float b) {
		System.out.println("The difference of given floats is "+(a-b));
	}
}

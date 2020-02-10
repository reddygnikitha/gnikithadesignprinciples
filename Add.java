
public class Add extends Calculator{
	private int a,b;
	private float p,q;
	public Add(float p, float q) {
		super(p, q);
	}
	
	public Add(int a, int b) {
		super(a, b);
	}
	
	void add(int a,int b) {
		System.out.println("The sum of given integers is "+(a+b));
	}
	
	void add(float a,float b) {
		System.out.println("The sum of given floats is "+(a+b));
	}
}

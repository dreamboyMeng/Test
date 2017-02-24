
public class B extends A{
	public B() {
		System.out.println("Constructor of B is called");
	}
	
	public void m(int v) {
		setF(v * 2);
	}
	
	public static void main(String[] args) {
		B y  = new B();
	}
}

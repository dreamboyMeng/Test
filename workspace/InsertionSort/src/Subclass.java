
public class Subclass extends Superclass {
	public Subclass() {
		System.out.println("Subclass local constructor");
	}
	
	public Subclass (int arg1, int arg2, int arg3) {
		super(arg1, arg2, arg3);
	}
	
	public void printMethod() {
		super.printMethod();
		System.out.println("Printed in Subclass");
	}
	
	public static void main(String[] args) {
		Subclass s = new Subclass(2,3,4);
		s.printMethod();
	}
}
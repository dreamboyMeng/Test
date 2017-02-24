
public final class Test {
	final int a = 110;
	
	public final void method() {
		System.out.println("Test - A");
		a = 100;
	}
	
	public static void method(int a) {
		System.out.println("Test - B");
	}
}

public class TestSub extends Test {
	public void method() {
		System.out.println("TestSub");
	}
	
	public static void main(String[] args) {
		Test obj = new TestSub();
		obj.method();
	}
}

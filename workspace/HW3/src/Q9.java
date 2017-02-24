// confirmed with TA
// assumptions

public class Q9 {
	public static void main (String[] args)
	{
		ClassA x = new ClassA(); 
		x.m();
	}
}

class ClassA 
{
	public ClassA() {}
	
	public double m()
	{
		ClassB b = new ClassB();
		return b.method1();
	}
}

class ClassB 
{
	public ClassB() {
		System.out.println("A new object of class B is constructed");
	}
	
	public double method1() 
	{
		System.out.println("Method1 in ClassB is called");
		return ClassC.method2();
	}
}

class ClassC
{
	public ClassC() {}
	public static double method2() {
		System.out.println("Method2 in ClassC is called");
		return 3;
	} 
}
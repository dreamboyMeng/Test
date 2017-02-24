import javax.rmi.CORBA.ClassDesc;

// confirmed with TA
// add assumptions

public class Q10 {
	public static void main(String[] args) {
		ClassB10 x = new ClassB10(); 
		x.m();
	}
}

class ClassA10 {
	public static void M1() {
		System.out.println("M1 in A");
	}
}

class ClassB10 {
	public void m() {
		ClassC10.M2();
		ClassC10.M3();
		ClassA10.M1();
	}
}

class ClassC10 {
	public static void M2() {
		System.out.println("M2 in C");
		ClassD10.M4();
	}
	
	public static void M3() {
		System.out.println("M3 in C");
		ClassD10.M5();
	}
}

class ClassD10 {
	public static void M4() {
		System.out.println("M4 in D");
	}
	public static void M5() {
		System.out.println("M5 in D");
	}
}
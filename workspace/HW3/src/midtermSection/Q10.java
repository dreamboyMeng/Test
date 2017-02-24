package midtermSection;

public class Q10 {
	public static void main(String[] args) {
		ClassB x = new ClassB(); 
		x.m();
	}
}

class ClassA {
	public static void M1() {
		System.out.println("M1 in A");
	}
}

class ClassB {
	public void m() {
		ClassC.M2();
		ClassC.M3();
		ClassA.M1();
	}
}

class ClassC {
	public static void M2() {
		System.out.println("M2 in C");
		ClassD.M4();
	}
	
	public static void M3() {
		System.out.println("M3 in C");
		ClassD.M5();
	}
}

class ClassD {
	public static void M4() {
		System.out.println("M4 in D");
	}
	public static void M5() {
		System.out.println("M5 in D");
	}
}


public class Test1 {

}

class Mammal {
	public void run(){
		System.out.println("run");
	}
}

class Elephant extends Mammal {
	protected void run() {
		System.out.println("run!");
	}
}
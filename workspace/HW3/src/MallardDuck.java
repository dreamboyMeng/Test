
public class MallardDuck extends FlyingDuck{
	public MallardDuck() {
		super();
		System.out.println("A new Mallard duck is created.");
	}
	
	public static void main(String[] args) {
		FlyingDuck aDuck = new FlyingDuck();
		FlyingDuck bDuck = new MallardDuck();
	}
}

class FlyingDuck {
	public FlyingDuck() {
		System.out.println("A new flying duck.");
	}
}					

public class Q3Test {
	public static void main(String[] args) {
		Quadrilateral Q = new Quadrilateral(0,1,1,0,3,1,1,2);
		Trapezoid T = new Trapezoid(0,1,3,1,2,2,1,2);
		System.out.println(T.Area());
		
		Parallelogram P = new Parallelogram(0,0,3,0,4,2,1,2);
		System.out.println(P.Area());
		
		Rectangle R = new Rectangle(0,0,4,0,4,2,0,2);
		System.out.println(R.Area());
		
		Square S = new Square(0,0,2,0,2,2,0,2);
		System.out.println(S.Area());
   	}	
}
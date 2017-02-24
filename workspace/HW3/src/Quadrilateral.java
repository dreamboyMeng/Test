import java.awt.geom.Area;

public class Quadrilateral {
	private Point QuadrilateralPointA;
	private Point QuadrilateralPointB;
	private Point QuadrilateralPointC;
	private Point QuadrilateralPointD;
	
	public Quadrilateral() {}
	
	public Quadrilateral(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		QuadrilateralPointA = new Point(ax, ay);
		QuadrilateralPointB = new Point(bx, by);
		QuadrilateralPointC = new Point(cx, cy);
		QuadrilateralPointD = new Point(dx, dy);
	}                   
	
	public Point getA() {
		return QuadrilateralPointA;
	}
	public Point getB() {
		return QuadrilateralPointB;
	}
	public Point getC() {
		return QuadrilateralPointC;
	}
	public Point getD() {
		return QuadrilateralPointD;
	}
	
	public static double Area(Point A, Point B, Point C, Point D) {
		// Assume points are given counterclockwisely
		// Applying the shoelace formula for calculating the area of a 
		// quadrilateral when the four points are given.
		
		double area = 1/2.0 * Math.abs(A.getX()*B.getY() + B.getX()*C.getY() + 
					  				   C.getX()*D.getY() + D.getX()*A.getY() -
					  				   A.getY()*B.getX() - B.getY()*C.getX() - 
					  				   C.getY()*D.getX() - D.getY()*A.getX());
		return area;	
	}
}

class Trapezoid extends Quadrilateral {
	private Point TrapezoidPointA;
	private Point TrapezoidPointB;
	private Point TrapezoidPointC;
	private Point TrapezoidPointD;
	
	public Trapezoid() {}
	
	public Trapezoid(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		TrapezoidPointA = new Point(ax, ay);
		TrapezoidPointB = new Point(bx, by);
		TrapezoidPointC = new Point(cx, cy);
		TrapezoidPointD = new Point(dx, dy);
	}
	
	public double Area() {
		return Quadrilateral.Area(TrapezoidPointA, TrapezoidPointB, TrapezoidPointC, TrapezoidPointD);
	}
}

class Parallelogram extends Quadrilateral {
	private Point PPointA;
	private Point PPointB;
	private Point PPointC;
	private Point PPointD;
	
	public Parallelogram() {}
	
	public Parallelogram(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		PPointA = new Point(ax, ay);
		PPointB = new Point(bx, by);
		PPointC = new Point(cx, cy);
		PPointD = new Point(dx, dy);
	}
	
	public double Area() {
		return Quadrilateral.Area(PPointA, PPointB, PPointC, PPointD);
	}
}

class Rectangle extends Parallelogram {
	private Point RPointA;
	private Point RPointB;
	private Point RPointC;
	private Point RPointD;
	
	public Rectangle() {}
	
	public Rectangle(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		RPointA = new Point(ax, ay);
		RPointB = new Point(bx, by);
		RPointC = new Point(cx, cy);
		RPointD = new Point(dx, dy);
	}
	
	public double Area() {
		return Quadrilateral.Area(RPointA, RPointB, RPointC, RPointD);
	}
}

class Square extends Rectangle {
	private Point SPointA;
	private Point SPointB;
	private Point SPointC;
	private Point SPointD;
	
	public Square() {}
	
	public Square(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
		SPointA = new Point(ax, ay);
		SPointB = new Point(bx, by);
		SPointC = new Point(cx, cy);
		SPointD = new Point(dx, dy);
	}
	
	public double Area() {
		return Quadrilateral.Area(SPointA, SPointB, SPointC, SPointD);
	}
}

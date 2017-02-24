
public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		realPart = 0;
		imaginaryPart = 0;
	}
	
	public Complex (double real, double imaginary) {
		realPart = real;
		imaginaryPart = imaginary;
	} 
	
	public double getRealPart() {
		return realPart;
	}
	
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public void setRealPart(double newValue) {
		realPart = newValue;
	}
	
	public void setImaginaryPart(double newValue) {
		imaginaryPart = newValue;
	}
	
	// I want to call the Add and Multiply method without creating a new object. 
	// Hence I make the methods static
	
	public static Complex Add (Complex num1, Complex num2) {
		Complex sum = new Complex();
		sum.setRealPart(num1.getRealPart() + num2.getRealPart());
		sum.setImaginaryPart(num1.getImaginaryPart() + num2.getImaginaryPart());
		return sum;
	}
	
	public static Complex Multiply (Complex num1, Complex num2) {
		Complex product = new Complex();
		product.setRealPart(num1.getRealPart() * num2.getRealPart() - num1.getImaginaryPart() * num2.getImaginaryPart());
		product.setImaginaryPart(num1.getRealPart() * num2.getImaginaryPart() + num1.getImaginaryPart() * num2.getRealPart());
		return product;
	}
	
	public static void print(Complex num) {
		System.out.printf("(%f, %f)\n", num.realPart, num.imaginaryPart);
	}
}


public class ComplexTest {
	public static void main(String[] args) {
		Complex a = new Complex(1,2);
		Complex b = new Complex(3,4);
		Complex sum = Complex.Add(a, b);
		Complex product = Complex.Multiply(a, b);
		Complex.print(sum);
		Complex.print(product);
	}
}

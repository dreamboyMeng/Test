import javax.lang.model.type.TypeVisitor;

public class MyReport {
	public int sum(int [] intArray, int x) {
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			intArray[i] = 0;
		}
		x = 10;
		return sum;
	}
	
	public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		MyReport t = new MyReport();
		System.out.printf("The total is %d\n", t.sum(a, a.length));
		System.out.printf("One value is %d\n", a[1]);
		System.out.printf("The count is %d\n", a.length);
	}
}

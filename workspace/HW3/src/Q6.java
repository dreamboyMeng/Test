import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Q6 {
	public int secondLargest(int[] x) {
		int Largest = 0;
		int sL = 0;
		
		if(x[0] < x[1]) {
			Largest = x[1];
			sL = x[0];
		} else {
			Largest = x[0];
			sL = x[1];
		}
		
		for (int i : x) {
			if (i > Largest) {
				sL = Largest;
				Largest = i;
			} else if (i > sL){
				sL = i;
			}
		}
		
		return sL;
	}
	
	public static void main(String[] args) {
		int[] a = {6, 8, 19, 2, 5, 7, 20, 22};
		Q6 aQ6 = new Q6();
		int x = aQ6.secondLargest(a);
		System.out.println(x);
	}
}

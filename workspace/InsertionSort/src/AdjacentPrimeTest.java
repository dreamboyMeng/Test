class AdjacentPrime1 {

	public int PrevPrime(int num) {

		if (num <= 2) 

			return -1;

		

		num--;

		while (isPrime(num) == false) 

			num--;

		

		return num;

 	}

	

	public int NextPrime(int num) {

		if (num <= 0) 

			num = 1;

		

		num++;

		while (isPrime(num) == false)

			num++;

		return num;

	}

	

	public int PrevGap(int num) {

		if (PrevPrime(num) == -1)

			return -1;

		else 

			return (num - PrevPrime(num));

	}

	

	public int NextGap(int num) {

		return (NextPrime(num) - num);

	}

	

	public int PrevPrime(int num, int index) {

		for (int i = 1; i <= index; i++) {

			if (PrevPrime(num) == -1) 

				return -1;

			else 

				num = PrevPrime(num);

		}

		return num;

	}

	

	public int NextPrime(int num, int index) {

		for (int i = 1; i <= index; i++) {

			num = NextPrime(num);

		}

		return num;

	}

	

	private boolean isPrime(int num) {

		boolean flag = true;

		for (int i = 2; i <= Math.floor(Math.sqrt(num)); i++) {

			if (num % i == 0) {

				flag = false;

				break;

			}

		}

		return flag;

	}
}

public class AdjacentPrimeTest {
	public static void main(String [] args) {
		AdjacentPrime1 j = new AdjacentPrime1();
		System.out.println(j.NextPrime(3, 5));
	}
}
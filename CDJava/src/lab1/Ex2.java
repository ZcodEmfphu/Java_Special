package lab1;

public class Ex2 {

	public int countDigits(int n) {
		if (n < 10) {
			return 1;
		} else {
			return 1 + countDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();

		System.out.println(ex2.countDigits(0));
	}
}

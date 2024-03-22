package lab1;

public class Ex3 {

	public int reverseNumber(int n) {
		return reverseHelper(n, 0);
	}

	private int reverseHelper(int n, int reversed) {
		if (n == 0) {
			return reversed;
		}
		return reverseHelper(n / 10, reversed * 10 + n % 10);
	}

	public static void main(String[] args) {

		Ex3 ex3 = new Ex3();
		ex3.reverseNumber(12345);
		System.out.println(ex3.reverseNumber(12345));
	}
}

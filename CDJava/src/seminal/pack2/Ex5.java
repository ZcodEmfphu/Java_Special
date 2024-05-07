package seminal.pack2;

public class Ex5 {
	public static void main(String[] args) {
		int number = 0;
		try {
			number = Integer.parseInt("invalid");
		} catch (NumberFormatException e) {
			number = 0;
		} finally {
			System.out.println("number = " + number);
		}

	}
}

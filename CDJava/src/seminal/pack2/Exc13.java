package seminal.pack2;

public class Exc13 {
	public static void main(String[] args) {
		int i = 0, j = 5;
		do {
			if (++i < j--)
				continue;
		} while (i > 5);
		System.out.println("i = " + i + " and j = " + j);

	}
}

package seminal.pack1;

public class Ex2_Loop {

	public static void main(String[] args) {
		int i = 1, j = 10;
		do {
			if (i++ > --j) {
				continue;
			}
		} while (i < 5);
		System.out.println("i = " + i + " and j = " + j);
	}
}

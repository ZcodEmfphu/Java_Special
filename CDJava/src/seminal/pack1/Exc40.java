package seminal.pack1;

public class Exc40 {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		int i = 0;
		for (; i < 5;) {
			System.out.print(intArray[++i] + " ");
			i--;
		}

	}
}

package seminal.pack1;

public class Exc20_OOP {
	private static int a = 1;

	public static void modify(int a) {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
		modify(a);
		System.out.println(a);
	}

}

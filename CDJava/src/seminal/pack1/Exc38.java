package seminal.pack1;

public class Exc38 {

	static int i = 10;

	public Exc38() {
		System.out.print("Outer:");
	}

	static class Inner {
		Inner() {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		new Exc38.Inner();
	}

}

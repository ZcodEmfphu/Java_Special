package final_3;

public class Test3 {
	static boolean check;

	static void test1() {
		float pi = new Float(3.14);
		if (pi < 3)
			System.out.print("pi < 3 ");
		if (pi > 3)
			System.out.print("pi > 3 ");
		else
			System.out.print("pi = 3 ");

	}

	public static void main(String[] args) {
		test1();
		int i;
		if (check = true)
			i = 1;
		else
			i = 2;
		if (i = 2)
			i = i + 2;
		else
			i = i + 4;
		System.out.println(i);

	}
}

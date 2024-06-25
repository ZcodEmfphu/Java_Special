package final_1;

public class Test2_duplicate {
	static int y = 2;

	public Test2_duplicate(int x) {
		this();
		y *= 3;
	}

	public Test2_duplicate() {
		y += 5;
	}

	public static void main(String[] args) {
		new Test2_2();
		Test2_2 test2_2 = new Test2_2();
		System.out.println(test2_2.toString());
		System.out.println("Test");
	}
}

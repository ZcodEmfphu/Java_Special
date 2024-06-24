package final_1;

public class Test1 {
	static int i; // test6
	private int a = 'c'; // test30

	public static void test1() {
		int i, j, k;
		for (i = 0; i < 3; i++) {
			for (j = 1; j < 4; j++) {
				for (k = 2; k < 5; k++) {
					if ((i == j) && (j == k))
						System.out.println(j);

				}
			}
		}
	}

	public static void test2() {
		int arr[][] = new int[5][5];
		int[] arr1[] = new int[5][5];
		int[][] arr2 = new int[5][5];
		int[][] arr3[];
		int arr4[] = new int[5];

		int[][] scores1 = { { 2, 4, 5 }, { 9, 3, 2 } };

	}

	public static void test3() {
		int i, j, k, l = 0;
		k = l++; // after:k=0, l=1 before: k =0, l = 1
		j = ++k; // after:k=1, j=1 before: k =0, j =0
		i = j++; // after:i=1, j=2 before: i =0, j =1
		System.out.println(k + " " + j + " " + i + " " + l);
	}

	public static void test4() {
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t || ((i++) == 0));
		b = (f || ((i += 2) > 0));
		System.out.println(i);
	}

	public static void test5() {
		for (int i = 1; i < 4; i++)
			for (int j = 1; j < 4; j++)
				if (i < j)
					assert i != j : i;

	}

	public static void test6() {
		while (i < 0) {
			i--;
		}
		System.out.println("test6 " + i);

	}

	public static void test7() {
		do {
			i++;
		} while (i < 0);

		System.out.println("test7 " + i);

	}

	public static void test8() {
		String test = "abc";
		test = test + test;
		System.out.println(test);

	}

	public static void main(String args[]) {
		test1();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
	}

}

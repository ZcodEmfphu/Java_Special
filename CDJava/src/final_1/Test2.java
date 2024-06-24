package final_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	static int i = 7; // ko quan trọng lắm

	private static int x = getValue();
	private static final int y = 4;

	public enum Alphabet { // important
		E, D, C
	}

	public enum MyEnum {
		A, B, C, D
	};

	public Test2() {
		this(1);
	}

	public Test2(int i) {
		this.i = i;
	}

	public static void test1() {
		String test = "1a2b3c4d5";
		String[] tokens = test.split("c");
		System.out.println(Arrays.toString(tokens));
	}

	public static void test2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key12", 3); // Bị ghi đè
		map.put("key99", 1);
		map.put("key8", 2);
		map.put("key12", 1);
		Collection<Integer> values = map.values();
		System.out.println(values);
	}

	public void modify3() {
		this.i--;
		System.out.println(i);
	}

	public static void test3() {
		int i = 12; // ưu tiên ở ngoài gần nó
		Test2 test2 = new Test2(i);
		test2.modify3();
		System.out.println(i);
	}

	public static void test4() { // => false thì k in
		boolean bool = true; // 1. bool = true
		if (bool = false) // 2. bool = false
			System.out.print("c ");
		if (bool) // 3. bool = false
			System.out.print("b ");
		if (!bool) // 4. bool = true => in a
			System.out.print("a ");
		System.out.print("d "); // 5. => in d
	}

	public static void test5() {
		Set<Alphabet> set = new TreeSet<Alphabet>();
		set.add(Alphabet.E);
		set.add(Alphabet.C);
		set.add(Alphabet.D);
		System.out.println(set);

	}

	public static void test6() {
		MyEnum myEnum = MyEnum.A;
		switch (myEnum) {
		case C:
			System.out.print("C ");
		case D:
			System.out.print("D ");
		default:
			System.out.print("B ");
		case A:
			System.out.print("A ");
		}
	}

	private static int getValue() { // câu 10
		return y;
	}

	public static List test7(List list) {
		Collections.reverse(list);
		return list;
	}

	public static void test8() {
		LinkedList list = new LinkedList();
		list.add("Dai hoc");
		list.add("Nong Lam");
		list.add("TP.HCM");
		System.out.println(list.get(1));
	}

	public static byte test9() {
		return 1;
	}

	public static void test10() {
		for (int i = 10; i < 10; i++)
			System.out.println(1);

	}

	public static void test11() {
		Integer i = 40;
		String s = (i > 40) ? "life" : (i > 50) ? "universe" : "everything";
		System.out.println(s);

	}

	public static void test12() {
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		List<Integer> list = Arrays.asList(array);
	}

	public static void test13() {
		for (int i = 9; i > 4; i -= 3)
			System.out.print(i + "  ");

	}

	public static void test14() {
		int x = 3;
		int y = 1;
		if (x == y)
			System.out.println("x = " + x);
	}

	public static void test15() {
		int i = 0, j = 5;
		do {
			if (i++ < --j)
				continue;
		} while (j > 5);
		System.out.println("i = " + i + " and j = " + j);

	}

	public static void test16() {
		int number = 0;
		try {
			number = Integer.parseInt("123");
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("number = " + number);
		}
	}

	public static void test17() {
		String s1 = new String("hello");
		String s2 = new String("Hello");
		Double d = 9.0;
		Float f = 9.0F;
		System.out.print(d.equals(f) + " ");
		System.out.print(s1 = s2 + " ");
		System.out.print(s1.equals(s2) + "");

	}

	public static void test18() {
		float pi = new Float(3.14);
		if (pi < 3)
			System.out.print("pi < 3 ");
		else
			System.out.print("pi = 3 ");
		if (pi > 3)
			System.out.print("pi > 3 ");

	}

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test8();
		test10();
		test11();
		test12();
		test18();

	}

}

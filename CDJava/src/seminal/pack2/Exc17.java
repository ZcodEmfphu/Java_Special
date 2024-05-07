package seminal.pack2;

public class Exc17 {
	
	public static void add3(Integer i) {
		int val = i.intValue();
		val += 3;
		i = new Integer(val);
	}

	public static void main(String args[]) {
		int i = 0;
		add3(i);
		System.out.println(i);
	}

}

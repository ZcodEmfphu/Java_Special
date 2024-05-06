package seminal.pack1;

public class Exc21_OOP2 extends Exc21_OOP {

	Exc21_OOP2() {
		super(y);
		y = y + 3;
	}

	public static void main(String[] args) {
		new Exc21_OOP2();
		System.out.println(y);
	}

}

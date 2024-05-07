package seminal.pack2;

public class Exc15 {
	private int a;

	public Exc15(int a) {
		this.a = a;
	}

	public void modify() {
		this.a--;
	}

	public static void main(String[] args) {
		int a = 10;
		Exc15 d = new Exc15(a);
		d.modify();
		System.out.println("a = " + a);
	}

}

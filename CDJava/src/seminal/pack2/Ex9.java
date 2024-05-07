package seminal.pack2;

public class Ex9 {
	int x = 1;

	public void method(int x) {
		x -= this.x;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Ex9 t = new Ex9();
		t.method(10);
	}
}

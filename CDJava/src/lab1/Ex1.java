package lab1;

public class Ex1 {

	public void dec2bin(int n) {
        if (n <= 1) {
            System.out.print(n);
            return;
        }

        dec2bin(n / 2);
        System.out.print(n % 2);
    }

	public static void main(String[] args) {
		Ex1 ex = new Ex1();
		ex.dec2bin(6);
	}
}

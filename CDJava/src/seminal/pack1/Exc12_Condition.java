package seminal.pack1;

public class Exc12_Condition {

	public static void main(String[] args) {
		float f1 = new Float("12");
		int f = (int) f1;

		switch (f) {
		case 12:
			System.out.println("Twelve");
		case 0:
			System.out.println("Zero");
		default:
			System.out.println("Default");
		}
	}
}

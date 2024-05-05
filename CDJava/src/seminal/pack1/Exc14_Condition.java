package seminal.pack1;

public class Exc14_Condition {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				break;
			case 1:
				System.out.println("one ");
			case 2:
				System.out.println("two ");
			case 3:
				System.out.println("three ");
			}
		}
		System.out.println("done");
	}
}

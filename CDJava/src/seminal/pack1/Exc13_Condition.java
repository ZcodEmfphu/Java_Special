package seminal.pack1;

public class Exc13_Condition {

	public static void main(String[] args) {
		int i = 1, j = -1;
		switch (i) {
		case 0, 1:
			j = 1;
		case 2:
			j = 2;
		default:
			j = 0;
		}
		System.out.println("j= " + j);
	}
}

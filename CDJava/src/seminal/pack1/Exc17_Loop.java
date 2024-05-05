package seminal.pack1;

public class Exc17_Loop {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
		   if(i == 4) {
		      break;
		   }
		   ++i;
		}
		System.out.println("i=" + i);

	}
}

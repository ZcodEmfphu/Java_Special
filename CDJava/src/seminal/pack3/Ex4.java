package seminal.pack3;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		for (int i = 1; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				assert i != j;
				{
					System.out.println(i);
				}
			}

		}

	}

}

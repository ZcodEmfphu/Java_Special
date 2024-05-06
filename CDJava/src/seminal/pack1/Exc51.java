package seminal.pack1;

import java.util.ArrayList;
import java.util.Collections;

public class Exc51 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Dog");
		strings.add("Monkey");
		strings.add("Cat");
		strings.add("Lion");
		Collections.sort(strings);
		for (String s : strings) {
			System.out.println(s + " ");
		}
	}

}

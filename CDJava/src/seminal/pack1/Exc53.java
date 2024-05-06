package seminal.pack1;

import java.util.Arrays;

public class Exc53 {

	public static void main(String[] args) {
		Object[] myObjects = { new Integer(12), new String("Foo"), new Integer(5), new Boolean(true) };
		Arrays.sort(myObjects);
		for (int i = 0; i < myObjects.length; i++) {
			System.out.println(myObjects[i].toString() + " ");
		}

	}

}

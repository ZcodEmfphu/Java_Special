package lab7;

import java.util.ArrayList;
import java.util.List;

public class MyStringTokenizer {

	String line;
	private String input;
	private String delimeter;
	private int currentPosition;

	public MyStringTokenizer(String line, String delimeter) {

		this.line = line;
		this.delimeter = delimeter;
//		this.currentPosition = 0;
		removeDelimeter();
	}

	public void removeDelimeter() {
		// Chung nao co delimeter
		while (line.startsWith(delimeter)) {
			line = line.substring(delimeter.length());
		}
	}

	public boolean hasMoreToken() {
//		return currentPosition < input.length();
		return !line.isEmpty();

	}

	public String nextToken() {

		String token;

//		int startIndex = currentPosition;
		int index = line.indexOf(delimeter);
		if (index < 0) {
			token = line;
			line = "";
		} else {
			token = line.substring(0, index);
			line = line.substring(index);
			removeDelimeter();
		}

//		token = input.substring(startIndex, endIndex);

		return token;
	}

	public static void main(String[] args) {
		String line = "abcabc";
		String delimeter = "abc";

		MyStringTokenizer myStringTokenizer = new MyStringTokenizer(line, delimeter);
//
//		List<String> listToken = new ArrayList<>();
//
		while (myStringTokenizer.hasMoreToken()) {
			String token = myStringTokenizer.nextToken();
			System.out.println(token);
		}

//		for (String items : listToken) {
//			System.out.print(items);
//		}

	}

}

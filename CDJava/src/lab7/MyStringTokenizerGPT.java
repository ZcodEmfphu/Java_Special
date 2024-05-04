package lab7;

import java.util.ArrayList;
import java.util.List;

public class MyStringTokenizerGPT {

	private String input;
	private String delimiter;
	private int currentPosition;

	public MyStringTokenizerGPT(String input, String delimiter) {
		this.input = input;
		this.delimiter = delimiter;
		this.currentPosition = 0;
	}

	public boolean hasMoreTokens() {
		return currentPosition <= input.length();
	}

	public String nextToken() {
		if (!hasMoreTokens()) {
			return null;
		}

		int startIndex = currentPosition;
		int endIndex = findDelimiterIndex();

		if (endIndex == -1) {
			endIndex = input.length();
		}

		String token = input.substring(startIndex, endIndex);
		currentPosition = endIndex + delimiter.length();
		return token;
	}

	private int findDelimiterIndex() {
		if (delimiter.length() == 1) {
			return input.indexOf(delimiter, currentPosition);
		} else {
			for (int i = currentPosition; i <= input.length() - delimiter.length(); i++) {
				if (input.substring(i, i + delimiter.length()).equalsIgnoreCase(delimiter)) {
					return i;
				}
			}
			return input.length();
		}
	}

	public static void main(String[] args) {
		String input = "123Abcabc789";
		String delimiter = "abc";

		MyStringTokenizerGPT tokenizer = new MyStringTokenizerGPT(input, delimiter);

		List<String> tokens = new ArrayList<>();

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			tokens.add(token);
		}

		for (String items : tokens) {
			System.out.print(items);
		}

	}
}

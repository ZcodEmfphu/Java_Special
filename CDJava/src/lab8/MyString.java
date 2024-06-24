package lab8;

public class MyString {

	private char[] content;

	private final int capacity = 1000;

	private char[] arr = new char[capacity];

	public MyString() {
		this.content = new char[0];
	}

	public MyString(String s) {
		this.content = s.toCharArray();
	}

	public String toString() {
		return new String(content);
	}

	public void append(String st) {

		for (int i = 0; i < content.length; i++) {
			arr[i] = content[i];
		}

		for (int i = 0; i < st.length(); i++) {
			arr[content.length + i] = st.charAt(i);
		}

		content = arr;
	}

	public void prepend(String st) {

		for (int i = 0; i < st.length(); i++) {
			arr[i] = st.charAt(i);
		}
		for (int i = 0; i < content.length; i++) {
			arr[st.length() + i] = content[i];
		}

		content = arr;
	}

	public static void main(String[] args) {
		MyString myString = new MyString("abc");
		System.out.println(myString);

		myString.append("def");
		myString.prepend("123");

		System.out.println(myString);

	}
}

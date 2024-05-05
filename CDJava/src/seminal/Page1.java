package seminal;

public class Page1 {

	public static void main(String[] args) {

		Object o1 = new String("1234");
		Object o2 = "1234";
		Object o3 = 1234;

		String s1 = (String) o1;
		String s2 = (String) o2;
		String s3 = (String) o3; // Uncaught Exception

		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s3);
		
	}
}

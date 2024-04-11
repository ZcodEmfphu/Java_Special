package lab5;

import java.math.BigInteger;

public class BigNumber {
	final int A = 1000; // Kiểm tra mảng có lớn hơn CAPACITY
	int[] digits;
	int len = 0;

	public BigNumber(String number) {
		this.digits = new int[A];
		len = number.length();
		for (int i = len - 1, j = 0; i > -1; i--, j++) {
			digits[j] = Character.getNumericValue(number.charAt(i));
		}
	}

	public void plus(BigNumber that) {
		int maxLen = this.len > that.len ? this.len : that.len;
		len = maxLen;
		int total, mem = 0;
		for (int i = 0; i < maxLen; i++) {
			total = mem + this.digits[i] + that.digits[i];
			mem = total / 10;
			this.digits[i] = total % 10;
		}
		if (mem > 0) {
			this.digits[len] = mem;
			len++;
		}
	}

	public String toString() {
		char[] charDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < len; i++) {
			stringBuilder.append(charDigits[digits[i]]);
		}
		return stringBuilder.reverse().toString();
	}

	public static void main(String[] args) {
		int count = 1000000;
		String num = "1236381893349012849029408141";
		String num0 = "1236381893349012849029408141";
		String num2 = "1236381893349012849029408141";
		String num1 = "1236381893349012849029408141";
		BigNumber bigNumber1 = new BigNumber(num1);
		BigNumber bigNumber2 = new BigNumber(num2);

		BigInteger b1 = new BigInteger(num);
		BigInteger b2 = new BigInteger(num0);

		long bt = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			b1 = b1.add(b2);
		}
		long et = System.currentTimeMillis();
		System.out.println("Big Integer: " + b1);
		System.out.println(et - bt);

		long bt1 = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			bigNumber1.plus(bigNumber2);
		}
		long et1 = System.currentTimeMillis();
		System.out.println("Big Number: " + bigNumber1);
		System.out.println(et1 - bt1);

	}

}

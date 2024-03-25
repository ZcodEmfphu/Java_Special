package lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.xml.crypto.Data;

public class XorBit {

	public static void encrypt(String inputFile, String outputFile, String password) throws IOException {

		try (FileInputStream in = new FileInputStream(inputFile);
				FileOutputStream out = new FileOutputStream(outputFile)) {
			byte[] data = new byte[120400];
			int count;
			byte[] passwordBytes = password.getBytes();
			int passwordLength = passwordBytes.length;
			long index = 0;
			while ((count = in.read(data)) != -1) {
				for (int i = 0; i < count; i++) {
					data[i] ^= passwordBytes[(int) (index++ % passwordLength)];
				}
				out.write(data, 0, count);
			}
			in.close();
			out.close();
		}
	}

	public static void main(String[] args) {
		String inputFile = "D:\\Project\\Java_Special\\Note\\week2\\test.txt";
		String outputFile = "D:\\Project\\Java_Special\\Note\\week2\\encrypted.txt";
		String desFile = "D:\\Project\\Java_Special\\Note\\week2\\descrypted.txt";
		String password = "MinhPhu";

		try {
//			encrypt(inputFile, outputFile, password);
			encrypt(outputFile, desFile, password);
			System.out.println("Encryption completed.");
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}

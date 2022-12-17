package practice1;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int i1 = sc.nextInt();

		System.out.println(i * i1);
		sc.close();

	}
}
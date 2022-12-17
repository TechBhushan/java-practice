package practice1;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int i1 = sc.nextInt();

		for (int i = 0; i < 1; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i1 * j);
			}
		}

		sc.close();

	}
}
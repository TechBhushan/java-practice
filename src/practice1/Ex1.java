package practice1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), sum = 0, r, temp = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum * 10 + r;
		}
		System.out.println("Reverse of " + temp + " is " + sum);

		if (temp == sum) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
		sc.close();

	}

}

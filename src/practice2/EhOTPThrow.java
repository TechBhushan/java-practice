package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EhOTPThrow {
	public static void main(String[] args) {
		try {
			NumberValidator.validator();
			System.out.println("Password Accepted");
		} catch (IllegalArgumentException e) {
			System.out.println("Enter only 4 digits number");
		} catch (InputMismatchException e) {
			System.out.println("Enter only integers");
		}
	}
}

class NumberValidator {
	public static void validator() throws IllegalArgumentException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String i = sc.nextLine();
		// String i1=sc.nextLine();
		if (i.length() > 4 || i.length() < 4)
			throw new IllegalArgumentException();
		if (!i.matches("[0-9]+"))
			throw new InputMismatchException();
	}
}

package practice2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Validator {
	public static int validateValue(int i) throws IllegalArgumentException {

		if (i <= 0)
			throw new IllegalArgumentException("Do not pass negative or zero");

		return i;
	}
}

public class EHThrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Number:");
			int res = Validator.validateValue(sc.nextInt());
		} catch (IllegalArgumentException | ArithmeticException e) { // we can pass multiple exceptions in single catch
																		// block
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Enter integer numbers only");
		}
	}
}

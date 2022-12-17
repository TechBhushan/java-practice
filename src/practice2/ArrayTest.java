package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	
	static int[] addSub(int[] ia) throws IllegalArgumentException {
		if (ia.length == 0)
			throw new IllegalArgumentException("Array is Empty");
		if (ia == null)
			throw new IllegalArgumentException("null is not allowed");
		int add = ia[0];
		for (int i = 1; i < ia.length; i++) {
			add += ia[i];
		}

		int sub = ia[0];
		for (int i = 1; i < ia.length; i++) {
			sub -= ia[i];
		}
		return new int[] { add, sub };
	}

	public static void main(String[] args) {

		try {
			int[] ia = { 2, 3, 4 };
			int[] res = addSub(ia);

			for (int i = 0; i < ia.length - 1; i++) {
				System.out.print(ia[i] + "+");
			}
			System.out.println(ia[ia.length - 1] + " = " + res[0]);

			for (int i = 0; i < ia.length - 1; i++) {
				System.out.print(ia[i] + "-");
			}
			System.out.println(ia[ia.length - 1] + " = " + res[1]);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}

package practice2;

public class EHBreak {
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("before loop\n");

		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("\nIn loop interation: " + i);
			try {
				System.out.println("In try");
				if (i == 5)
					break;
			} catch (ArithmeticException e) {
				System.out.println("In catch");
			} finally {
				System.out.println("In finally");
			}
			System.out.println("After try/catch/finally");
		}// for close
		
		System.out.println("\nAfter loop");
		System.out.println("main end");
	}
}

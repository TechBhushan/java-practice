package practice2;

public class Finally {

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(m1());
		System.out.println("main end");
	}

	static int m1() {
		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		}catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			int[] ia = new int[-5];
			return 10;  				//Transfer statements after Exception in same block will not be executed.
		}
	}
}

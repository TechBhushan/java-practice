package practice2;

public class FinallyBreak {

	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(m1(5));
		System.out.println("main end");
	}

	@SuppressWarnings("finally")
	static int m1(int i) {

		while (i == 5) {
			try {
				return 10;
			} finally {
				break;
			}
			//System.out.println(i);  --Unreachable Statement(Cannot write statement after finally block 
			//							while using Transfer Statements(return,break,continue) gets compile error)
		}
		System.out.println(i);
		return 20;
	}
}

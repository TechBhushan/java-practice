package practice1;

public class SpEL1 extends Example {
	int y = m3();

	int m3() {
		System.out.println("NSM2 created");
		return 20;
	}

	{
		System.out.println("NSB2 created");
	}

	SpEL1() {
		System.out.println("Constructor2 created");
	}

	void m4() {
		System.out.println("m4 method");
	}

	public static void main(String[] args) {
		SpEL1 s1 = new SpEL1();
		System.out.println(s1.x);
	}
}

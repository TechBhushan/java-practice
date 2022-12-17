package practice2;

public class InheritStructure1 extends InheritStructure {
	static int b = ss1();

	static int ss1() {
		System.out.println("Sm2 created");
		return 40;
	}

	int y = m3();

	int m3() {
		System.out.println("NSM2 created");
		return 20;
	}

	{
		System.out.println("NSB2 created");
	}

	InheritStructure1() {
		System.out.println("Constructor2 created");
	}

	static {
		System.out.println("SB2 created");
	}

	void m4() {
		System.out.println("m4 method");
	}

	public static void main(String[] args) {
		InheritStructure1 s1 = new InheritStructure1();
		System.out.println(s1.x);
		System.out.println(s1.y);
	}
}

package practice2;

public class InheritStructure {
	static int a = ss();

	static int ss() {
		System.out.println("SM1 created");
		return 10;
	}

	int x = m1();

	int m1() {
		System.out.println("NSM1 created");
		return 10;
	}

	{
		System.out.println("NSB1 created");
	}

	static {
		System.out.println("SB1 created");
	}

	InheritStructure() {
		System.out.println("Constructor1 created");
	}

	void m2() {
		System.out.println("m2 method");
	}

}

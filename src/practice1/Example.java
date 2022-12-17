package practice1;

public class Example {
	int x = m1();

	int m1() {
		System.out.println("NSM1 created");
		return 10;
	}

	{
		System.out.println("NSB1 created");
	}

	Example() {
		System.out.println("Constructor1 created");
	}

	void m2() {
		System.out.println("m2 method");
	}
}

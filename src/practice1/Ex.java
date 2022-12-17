package practice1;

public class Ex {
	int x = 10;

	Ex() {
		System.out.println("This is Ex constructor");
	}

	public static void main(String[] args) {
		Ok1 o = new Ok1();
		System.out.println(o.x);
	}
}

class Ok extends Ex {
	Ok(int a) {
		// super() constructor is added default by JVM
		System.out.println("This is ok constructor");
	}
}

class Ok1 extends Ok {
	Ok1() {
		super(5);
	}
}
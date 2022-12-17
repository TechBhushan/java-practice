package practice2;

class DownCasting {
	public void m1() {
		System.out.println("m1");
	}
}

class DownCasting1 extends DownCasting {
	public void m2() {
		System.out.println("m2");
	}
}

public class ObjectDownCasting {
	public static void main(String[] args) {
		DownCasting dc;
		dc = new DownCasting1();
		DownCasting1 dc1 = (DownCasting1) dc; // Type Casting/Down Casting
		dc1.m1();
		dc1.m2();
	}
}

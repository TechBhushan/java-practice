package practice1;

public class Inherit3 implements Inherit1, Inherit2 // Multiple Inheritance
{

	public static void main(String[] args) {
		Inherit3 i1 = new Inherit3();
		i1.demo();

	}

	@Override
	public void demo() {
		System.out.println("This is Inherited method");

	}

}

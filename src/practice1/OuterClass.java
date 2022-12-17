package practice1;

class Outer1 {
	class Inner{
		void inm() {
		System.out.println("Inner");
		}
	}
}

public class OuterClass{
	public static void main(String[] args) {
		Outer1 out=new Outer1();
		Outer1.Inner o1=out.new Inner();
		o1.inm();
	}
	
}

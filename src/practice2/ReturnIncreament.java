package practice2;

public class ReturnIncreament {

	public int m1(int a) {
		a=7;
		return a++;
	}
	
	public int m2(int b) {
		b=8;
		return ++b;
	}
	
	public static void main(String[] args) {
		
		ReturnIncreament rt= new ReturnIncreament();
		System.out.println(rt.m1(5));
		System.out.println(rt.m2(5));
	}

}
